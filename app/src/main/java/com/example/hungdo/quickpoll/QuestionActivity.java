package com.example.hungdo.quickpoll;
import android.graphics.Color;
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
    }

    public void answerAClicked(View view) {
        answerA.setBackground(new ColorDrawable(Color.parseColor("#EC407A")));
    }


}

