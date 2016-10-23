package com.example.hungdo.quickpoll;

/**
 * Created by Nhu Ng on 10/22/2016.
 */
import java.lang.annotation.Target;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.sql.Statement;


public class DBconnect {

    private static Connection con = null;
    private static PreparedStatement stmt = null;
    private static ResultSet rs = null;


    public static DBconnect connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }catch(Exception e) {
            System.out.println("-----------------------Unable to load Driver");
        }

        //Establish connection using DriverManager
        try {
            con = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/question1?" +
                    "user=question1&password=1234567");
            if(con == null){
                System.out.print("None-----------------------------");
            }else{
                System.out.print("Yes ----------------");
            }
        } catch (SQLException e) {
            System.out.println("-----------------------Unable to connect to database");
        }
        return null;
    }

    public static void ThanhCaptain() {
        try {
            String sql = "SELECT *  from Question";
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            System.out.println("5------55s555534t564dyg6u56dhf75dr57r7hf75666666666666666666666666666666666666666666666666666666666666666666666666666666666666");
            while (rs.next()) {
                System.out.println("--------------------------------------------------------");;
            }
        } catch (SQLException error) {
            System.out.println("------------------------in method");
        }
    }
}
