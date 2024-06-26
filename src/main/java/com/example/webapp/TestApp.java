package com.example.webapp;

import com.example.webapp.models.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class TestApp {
    public static String test() {
        return "Testing something";
    }

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/webapp", "root", "");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from users");

            ArrayList<User> users = new ArrayList<>();
            while (rs.next()) {
                User user = new User(rs.getInt("id"), rs.getString("username"), rs.getString("password"), rs.getString("created_at"));
                users.add(user);
            }
            con.close();
//            System.out.println("server connected");
            for (User u : users) {
                System.out.println(u.getId());
                System.out.println(u.getUsername());
                System.out.println(u.getPassword());
                System.out.println(u.getCreatedAt());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
