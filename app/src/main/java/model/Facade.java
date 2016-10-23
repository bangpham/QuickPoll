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
    public static boolean profileQuestion;

    public static void initialize() {

        // initialize the one facade instance for the application
        facade = new Facade();
        Question q1 = new Question("Who will be the President of the US", "Donald Trum", "Hillary Clinton");
        q1.setACount(55);
        q1.setBCount(77);
        Question q2 = new Question("Would you date someone on Tinder?", "No", "Ewww!");
        q2.setACount(50);
        q2.setBCount(112);
        Question q3 = new Question("Are you happy with your student life?", "Donald Trum", "of course!");
        q3.setACount(10);
        q3.setBCount(2);
        Question q4 = new Question("Which fastfood item has more calories?", "Dunkin's donut jelly donut", "taco bells crunchwrap");
        q4.setACount(388);
        q4.setBCount(412);
        Question q5 = new Question("Which starbuck order is better?", "Caramel macchiato", "sexy corn cob");
        q5.setACount(32);
        q5.setBCount(12);
        Question q6 = new Question("Which hallowen costume do you prefer?", "sexy ronald mcdonal", "Hillary Clinton");
        q6.setACount(388);
        q6.setBCount(912);
        Question q7 = new Question("Would you rather", "be colorblind", "lose ur sense of smell");
        q7.setACount(38);
        q7.setBCount(91);
        List<Question> listQ1 = new ArrayList<>(Arrays.asList(q1, q2, q3, q4, q5, q6, q7));
        User user1 = new User("user1", listQ1);

        Question q8 = new Question("How often do you party?", "everyday", "Never");
        q8.setACount(13);
        q8.setBCount(123);
        Question q9 = new Question("Batman or Superman", "Batman", "Superman");
        q9.setACount(13);
        q9.setBCount(123);
        Question q10 = new Question("Facebook & Youtube", "Facebook", "Youtube");
        q10.setACount(13);
        q10.setBCount(123);
        Question q11 = new Question("Who will be the President of the US", "Donald Trum", "Hillary Clinton");
        q11.setACount(13);
        q11.setBCount(123);
        List<Question> listQ2 = new ArrayList<>(Arrays.asList(q8, q9, q10, q11));
        User user2 = new User("user2", listQ2);

        Question q12 = new Question("Who is the hottest celebrity?", "Emma Watson", "Hillary Clinton");
        q12.setACount(13);
        q12.setBCount(143);
        Question q13 = new Question("What is your favorite designer brand?", "Forever 21", "Gucci");
        q13.setACount(13);
        q13.setBCount(135);
        Question q14 = new Question("What is your favorite designer brand?", "Money", "Money");
        q14.setACount(213);
        q14.setBCount(423);
        Question q15 = new Question(" Are you a family orientated person?", "yes", "no");
        q15.setACount(153);
        q15.setBCount(234);
        Question q16 = new Question("What is your favorite day and why?", "monday", "sunday");
        q16.setACount(153);
        q16.setBCount(523);
        Question q17 = new Question("Do you believe in evolution or religion?", "yes", "no");
        q17.setACount(13);
        q17.setBCount(423);
        Question q18 = new Question("Can you cook carbonara?", "yes", "no");
        q18.setACount(153);
        q18.setBCount(723);
        Question q19 = new Question("Do you own a bike?", "yes", "no");
        q19.setACount(173);
        q19.setBCount(123);
        Question q20 = new Question("Coke or Pepsi?", "coke", "pepsi");
        q20.setACount(653);
        q20.setBCount(123);
        Question q21 = new Question("Are you old-fashioned?",  "yes", "no");
        q21.setACount(376);
        q21.setBCount(263);
        Question q22 = new Question("Do you like stripes?", "yes", "no");
        q22.setACount(1753);
        q22.setBCount(1673);
        Question q23 = new Question("Do you like football?", "yes", "no");
        q23.setACount(376);
        q23.setBCount(763);
        Question q24 = new Question("Are you a girl?", "yes", "no");
        q24.setACount(153);
        q24.setBCount(523);
        Question q25 = new Question("Are you a boy?", "yes", "no");
        q25.setACount(135);
        q25.setBCount(123);
        List<Question> listQ3 = new ArrayList<>(Arrays.asList(q12, q13, q14, q15, q16, q17, q18, q19, q20, q21, q22, q23, q24, q25));
        User user3 = new User("user3", listQ3);
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

    public void resetUser() {
        user = null;
    }

    public void createUser(String username) {
        User newUser = new User(username, new ArrayList<Question>());
        listUser.add(newUser);
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

    public static void addQuestion(Question q) {
        user.getQuestions().add(q);
    }

}
