package model;

import com.example.hungdo.quickpoll.Question;

import java.util.List;

/**
 * Created by Nhu Ng on 10/23/2016.
 */

public class User {
    private  String id;
    private List<Question> questions;

    public User(String id, List<Question> questions) {
        this.id = id;
        this.questions = questions;
    }

    public String getID() {
        return id;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setID(String id) {
        this.id = id;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public void addQuestion(Question q) {
        questions.add(q);
    }

}
