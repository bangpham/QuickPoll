package com.example.hungdo.quickpoll;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.widget.EditText;

import model.Facade;


public class MainScreenActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    private Facade facade = Facade.getFacade();
    EditText editQues;
    EditText editAnsA;
    EditText editAnsB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        MainRecyclerAdapter adapter = new MainRecyclerAdapter(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);

        //Layout manager for Recycler view

        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        //To get longitude and latitude of location:
        map addr = new map(getBaseContext(), "60 Luckie Street NW Atlanta, GA 30303");
        System.out.println("latitdute************************: " + addr.getLat());
        System.out.println("longitude: " + addr.getLong());


        editQues = (EditText) findViewById(R.id.editQuestion);
        editAnsA = (EditText) findViewById(R.id.editAnswerA);
        editAnsB = (EditText) findViewById(R.id.editAnswerB);

    }

    public void pollClick(View view) {
        if (editQues.getText().toString().equals("") || editAnsA.getText().toString().equals("") || editAnsB.getText().toString().equals("")) {
            AlertDialog alertDialog = new AlertDialog.Builder(MainScreenActivity.this).create();
            alertDialog.setTitle("WARNING");
            alertDialog.setMessage("Cannot leave any empty field!!!");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();
        } else {
            Question newQuestion = new Question(editQues.getText().toString(), editAnsA.getText().toString(), editAnsB.getText().toString());
            facade.addQuestion(newQuestion);
            CookieSyncManager.createInstance(this);
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.removeAllCookie();
            Intent intent= new Intent(MainScreenActivity.this, MainScreenActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_profile, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_myQuestions) {
            startActivity(new Intent(MainScreenActivity.this, Profile.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
