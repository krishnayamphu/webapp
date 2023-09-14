package com.ky.dao;

import com.ky.config.ConnectDB;
import com.ky.model.User;
import com.mysql.cj.PreparedQuery;

import java.sql.*;
import java.util.ArrayList;

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
    public static ArrayList<User> getUsers(){
        ArrayList<User> users=new ArrayList<>();
        try {
            Connection con= ConnectDB.connect();
            String sql="SELECT * FROM users";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                users.add(new User(rs.getInt("id"),rs.getString("username"),rs.getString("password")));
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
        return users;
    }

    public static User getUser(int id){
        User user = null;
        try {
            Connection con= ConnectDB.connect();
            String sql="SELECT * FROM users WHERE id=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                user=new User(rs.getInt("id"),rs.getString("username"),rs.getString("password"));
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
        return user;
    }

    public static void remove(int id){
        try {
            Connection con= ConnectDB.connect();
            String sql="DELETE FROM users WHERE id=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public static void update(User user){
        try {
            Connection con= ConnectDB.connect();
            String sql="UPDATE users SET username=?, password=? WHERE id=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,user.getUsername());
            ps.setString(2,user.getPassword());
            ps.setInt(3, user.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public static boolean authUser(User user){
        boolean status=false;
        try {
            Connection con= ConnectDB.connect();
            String sql="SELECT * FROM users WHERE username=? AND password=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,user.getUsername());
            ps.setString(2,user.getPassword());
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                status=true;
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
        return status;
    }
}
