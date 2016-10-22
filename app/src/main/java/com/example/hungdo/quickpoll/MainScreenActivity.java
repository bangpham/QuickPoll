package com.example.hungdo.quickpoll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);



        //example to get longitude and latitude of location:
        //map addr = new map(getBaseContext(), "60 Luckie Street NW Atlanta, GA 30303");
        //System.out.println(addr.getLat());
        //System.out.println(addr.getLong());

    }
}
