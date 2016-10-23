package com.example.hungdo.quickpoll;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import model.Facade;

public class LoginScreenActivity extends Activity {
    Button userNamebutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        userNamebutton = (Button) findViewById(R.id.UserNameSubmit);
    }


    //exit app on back button
    public void onBackPressed(){
        Intent a = new Intent(Intent.ACTION_MAIN);
        a.addCategory(Intent.CATEGORY_HOME);
        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(a);
    }


    public void loginClick(View view) {
        Facade facade = Facade.getFacade();
        EditText editText = (EditText) findViewById(R.id.userNameEnter);
        if (editText.getText().toString().equals("")) {
            AlertDialog alertDialog = new AlertDialog.Builder(LoginScreenActivity.this).create();
            alertDialog.setTitle("WARNING");
            alertDialog.setMessage("Please input your username!!!");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();
        } else {
            Facade.getUserByID(editText.getText().toString());
            if (Facade.getUser() == null) {
                facade.createUser(editText.getText().toString());
                Facade.getUserByID(editText.getText().toString());
            }
            Intent mainScreen = new Intent(LoginScreenActivity.this, MainScreenActivity.class);
            //mainScreen.putExtra("bmi", bmi); //passing value
            LoginScreenActivity.this.startActivity(mainScreen);
        }
    }



}
