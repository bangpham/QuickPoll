package model;

import com.example.hungdo.quickpoll.Question;

import java.util.List;

/**
 * Created by Nhu Ng on 10/23/2016.
 */

public class User {
    private  int phoneNum;
    private List<Question> questions;

    public User(int phoneNum, List<Question> questions) {
        this.phoneNum = phoneNum;
        this.questions = questions;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
