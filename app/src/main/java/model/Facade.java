package model;

import com.example.hungdo.quickpoll.Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hungdo on 10/23/16.
 */

public class Facade {
    private static Facade facade;
    private static List<User> listUser;
    private static User user;
    private static Question questionInfo;

    public static void initialize() {

        // initialize the one facade instance for the application
        facade = new Facade();
        Question q1 = new Question("Who will be the President of the US?", "Donald Trum", "Hillary Clinton");
        q1.setACount(13);
        q1.setBCount(123);
        Question q2 = new Question("Who will be the President of the US", "Donald Trum", "Hillary Clinton");
        q2.setACount(46);
        q2.setBCount(9);
        Question q3 = new Question("Who will be the President of the US", "Donald Trum", "Hillary Clinton");
        q3.setACount(10);
        q3.setBCount(2);
        Question q4 = new Question("Who will be the President of the US", "Donald Trum", "Hillary Clinton");
        q4.setACount(388);
        q4.setBCount(912);
        Question q5 = new Question("Who will be the President of the US", "Donald Trum", "Hillary Clinton");
        Question q6 = new Question("Who will be the President of the US", "Donald Trum", "Hillary Clinton");
        Question q7 = new Question("Who will be the President of the US", "Donald Trum", "Hillary Clinton");
        List<Question> listQ1 = new ArrayList<>(Arrays.asList(q1, q2, q3, q4, q5, q6, q7));
        User user1 = new User("123456789", listQ1);
        Question q8 = new Question("this is different", "thisasd","Hillary Clinton");
        Question q9 = new Question("Who will be the President of the US", "Donald Trum", "Hillary Clinton");
        Question q10 = new Question("Who will be the President of the US", "Donald Trum", "Hillary Clinton");
        Question q11 = new Question("Who will be the President of the US", "Donald Trum", "Hillary Clinton");
        List<Question> listQ2 = new ArrayList<>(Arrays.asList(q8, q9, q10, q11));
        User user2 = new User("4043334902", listQ2);
        Question q12 = new Question("Who will be the President of the US", "Donald Trum", "Hillary Clinton");
        Question q13 = new Question("Who will be the President of the US", "Donald Trum", "Hillary Clinton");
        Question q14 = new Question("Who will be the President of the US", "Donald Trum", "Hillary Clinton");
        Question q15 = new Question("Who will be the President of the US", "Donald Trum", "Hillary Clinton");
        Question q16 = new Question("Who will be the President of the US", "Donald Trum", "Hillary Clinton");
        Question q17 = new Question("Who will be the President of the US", "Donald Trum", "Hillary Clinton");
        Question q18 = new Question("Who will be the President of the US", "Donald Trum", "Hillary Clinton");
        Question q19 = new Question("Who will be the President of the US", "Donald Trum", "Hillary Clinton");
        Question q20 = new Question("Who will be the President of the US", "Donald Trum", "Hillary Clinton");
        Question q21 = new Question("Who will be the President of the US", "Donald Trum", "Hillary Clinton");
        Question q22 = new Question("Who will be the President of the US", "Donald Trum", "Hillary Clinton");
        Question q23 = new Question("Who will be the President of the US", "Donald Trum", "Hillary Clinton");
        Question q24 = new Question("Who will be the President of the US", "Donald Trum", "Hillary Clinton");
        Question q25 = new Question("Who will be the President of the US", "Donald Trum", "Hillary Clinton");
        List<Question> listQ3 = new ArrayList<>(Arrays.asList(q12, q13, q14, q15, q16, q17, q18, q19, q20, q21, q22, q23, q24, q25));
        User user3 = new User("4043453278", listQ3);
        listUser = new ArrayList<>(Arrays.asList(user1, user2, user3));
    }

    public static Facade getFacade() {
        return facade;
    }

    public static List<User> getListUser() {
        return listUser;
    }

    public static List<Question> getListQuestionByID(String id) {
        for (User u: listUser) {
            if (u.getID().equals(id)) {
                return u.getQuestions();
            }
        }
        return null;
    }

    public static List<Question> getAllQuestion() {
        List<Question> listAllQuestion = new ArrayList<>();
        for (User u: listUser) {
            for (Question q: u.getQuestions()) {
                listAllQuestion.add(q);
            }
        }
        return listAllQuestion;
    }

    public static User getUserByID(String id) {
        for (User u: listUser) {
            if (u.getID().equals(id)) {
                user = u;
                return user;
            }
        }
        return null;
    }

    public static User getUser() {
        return user;
    }

    public static void setQuestionInfo(Question q) {
        questionInfo = q;
    }

    public static Question getQuestionInfo() {
        return questionInfo;
    }
    
}
