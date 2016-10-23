package com.example.hungdo.quickpoll;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import model.Facade;


public class MainScreenActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Facade.initialize();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        ProfileRecyclerAdapter adapter = new ProfileRecyclerAdapter(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);

        //Layout manager for Recycler view

        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        //To get longitude and latitude of location:
        map addr = new map(getBaseContext(), "60 Luckie Street NW Atlanta, GA 30303");
        System.out.println("latitdute************************: " + addr.getLat());
        System.out.println("longitude: " + addr.getLong());


//        DBconnect aa = new DBconnect();
//        aa.connect();
//         aa.ThanhCaptain();
//        System.out.println(aa);

    }

    public void pollClick(View view) {
        startActivity(new Intent(MainScreenActivity.this, Profile.class));
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
