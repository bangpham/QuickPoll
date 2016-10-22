package com.example.hungdo.quickpoll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);



        //To get longitude and latitude of location:
        //map addr = new map(getBaseContext(), "");
        //System.out.println("latitdute: " + addr.getLat());
        //System.out.println("longitude: " + addr.getLong());

    }
}
