package com.example.hungdo.quickpoll;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.os.Handler;
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
        facade.getUserByID(editText.getText().toString());
        Intent mainScreen = new Intent(LoginScreenActivity.this, MainScreenActivity.class);
        //mainScreen.putExtra("bmi", bmi); //passing value
        LoginScreenActivity.this.startActivity(mainScreen);
    }



}
