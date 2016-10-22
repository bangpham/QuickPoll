package com.example.hungdo.quickpoll;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class Profile extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        RecyclerAdapter adapter = new RecyclerAdapter(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);

        //Layout manager for Recycler view

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


    public void goToMain() {
        startActivity(new Intent(Profile.this, MainScreenActivity.class));
    }
}
