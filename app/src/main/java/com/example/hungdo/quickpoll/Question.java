package com.example.hungdo.quickpoll;

/**
 * Created by Bang on 10/22/16.
 */

public class Question {
    private String question;
    private String answerA;
    private String answerB;
    private int count;
    private int aCount;
    private int bCount;

    public Question(String question, String answerA, String answerB) {
        this.question = question;
        this.answerA = answerA;
        this.answerB = answerB;
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
        return answerA;
    }

    public String getB() {
        return answerB;
    }

    public int getTotal() {
        return aCount + bCount;
    }

    public int getACount() {
        return aCount;
    }
    public int getBCount() {
        return bCount;
    }

    public void setACount(int count) {
        aCount = count;
    }

    public void setBCount(int count) {
        bCount = count;
    }

}
