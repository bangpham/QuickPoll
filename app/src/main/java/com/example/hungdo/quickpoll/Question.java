package com.example.hungdo.quickpoll;

/**
 * Created by Bang on 10/22/16.
 */

public class Question {
    private String question;
    private String[] answers;
    private int count;
    private int aCount;
    private int bCount;

    public Question(String question, String answerA, String answerB) {
        this.question = question;
        answers[0] = answerA;
        answers[1] = answerB;
    }

    public void incrementA() {
        aCount++;
        count++;
    }

    public void incrementB() {
        bCount++;
        count++;
    }

    public String getQuestion() {
        return question;
    }

    public String getA() {
        return answers[0];
    }

    public String getB() {
        return answers[1];
    }

    public int getCount() {
        return count;
    }

    public int getACount() {
        return aCount;
    }
    public int getBCount() {
        return bCount;
    }

}
