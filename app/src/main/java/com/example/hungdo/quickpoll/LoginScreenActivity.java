package com.example.hungdo.quickpoll;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import model.Facade;

public class LoginScreenActivity extends Activity {
    Button userNamebutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        userNamebutton = (Button) findViewById(R.id.UserNameSubmit);


    }

    public void loginClick(View view) {
        Facade facade = Facade.getFacade();
        EditText editText = (EditText) findViewById(R.id.userNameEnter);
        facade.getUserByID(editText.getText().toString());
        Intent mainScreen = new Intent(LoginScreenActivity.this, MainScreenActivity.class);
        LoginScreenActivity.this.startActivity(mainScreen);
    }



}
