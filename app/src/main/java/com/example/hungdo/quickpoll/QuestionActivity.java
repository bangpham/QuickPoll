package com.example.hungdo.quickpoll;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class QuestionActivity extends AppCompatActivity {
    private TextView question;
    private TextView answerA;
    private TextView answerB;
    private TextView aCount;
    private TextView bCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        question = (TextView) findViewById(R.id.question);
        answerA = (TextView) findViewById(R.id.answerA);
        answerA = (TextView) findViewById(R.id.answerB);
        aCount = (TextView) findViewById(R.id.aCount);
        bCount = (TextView) findViewById(R.id.bCount);
    }
}
