package com.example.hungdo.quickpoll;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class LoginScreenActivity extends Activity {

    Button userNamebutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        userNamebutton = (Button) findViewById(R.id.UserNameSubmit);


        //go to new page from image button

        userNamebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                //navigate to new activity
                Intent mainScreen = new Intent(LoginScreenActivity.this, MainScreenActivity.class);
                //mainScreen.putExtra("bmi", bmi); //passing value
                LoginScreenActivity.this.startActivity(mainScreen);
            }
        });


    }





}
