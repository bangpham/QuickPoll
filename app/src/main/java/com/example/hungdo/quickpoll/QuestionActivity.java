package com.example.hungdo.quickpoll;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import model.Facade;

public class QuestionActivity extends AppCompatActivity {
    private TextView question;
    private TextView answerA;
    private TextView answerB;
    private TextView aCount;
    private TextView bCount;
    private TextView votedA;
    private TextView votedB;
    Facade facade = Facade.getFacade();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        question = (TextView) findViewById(R.id.title);
        question.setText(facade.getQuestionInfo().getQuestion());
        System.out.println(facade.getQuestionInfo().getQuestion());
        answerA = (TextView) findViewById(R.id.answerA);
        answerA.setText(facade.getQuestionInfo().getA());
        answerB = (TextView) findViewById(R.id.answerB);
        answerB.setText(facade.getQuestionInfo().getB());
        aCount = (TextView) findViewById(R.id.aCount);
        aCount.setText(facade.getQuestionInfo().getACount() + "");
        bCount = (TextView) findViewById(R.id.bCount);
        bCount.setText(facade.getQuestionInfo().getBCount() + "");
        votedA = (TextView) findViewById(R.id.youVotedA);
        votedB = (TextView) findViewById(R.id.youVotedB);
        answerA.setClickable(true);
        answerB.setClickable(true);
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(this, MainScreenActivity.class));
        finish();
    }

    public void answerAClicked(View view) {
        if (!facade.profileQuestion) {
            answerA.setBackground(new ColorDrawable(Color.parseColor("#F50057")));
            answerA.setTextSize(18);
            answerA.setTypeface(null, Typeface.BOLD);
            aCount.setTextSize(20);
            aCount.setTypeface(null, Typeface.BOLD);
            answerA.setClickable(false);
            answerB.setClickable(false);
            facade.getQuestionInfo().incrementA();
            aCount.setText(facade.getQuestionInfo().getACount() + "");
            votedA.setVisibility(View.VISIBLE);
        }
    }

    public void answerBClicked(View view) {
        if (!facade.profileQuestion) {
            answerB.setBackground(new ColorDrawable(Color.parseColor("#1A237E")));
            answerB.setTextSize(18);
            answerB.setTypeface(null, Typeface.BOLD);
            bCount.setTextSize(20);
            bCount.setTypeface(null, Typeface.BOLD);
            answerA.setClickable(false);
            answerB.setClickable(false);
            facade.getQuestionInfo().incrementB();
            bCount.setText(facade.getQuestionInfo().getBCount() + "");
            votedB.setVisibility(View.VISIBLE);
        }
    }

}

