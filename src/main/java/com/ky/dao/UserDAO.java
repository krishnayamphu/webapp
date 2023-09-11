package com.ky.dao;

import com.ky.config.ConnectDB;
import com.ky.model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO {
    public static void save(User user){
        try {
            Connection con= ConnectDB.connect();
            String sql="INSERT INTO users VALUES (null,?,?)";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,user.getUsername());
            ps.setString(2,user.getPassword());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
}
