package com.ky.dao;

import com.ky.config.ConnectDB;
import com.ky.model.Todo;
import com.ky.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TodoDAO {
    public static void save(Todo todo){
        try {
            Connection con= ConnectDB.connect();
            String sql="INSERT INTO todo VALUES (null,?,?)";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,todo.getItems());
            ps.setBoolean(2,todo.isStatus());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
    public static ArrayList<Todo> getItems(){
        ArrayList<Todo> items=new ArrayList<>();
        try {
            Connection con= ConnectDB.connect();
            String sql="SELECT * FROM todo";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                items.add(new Todo(rs.getInt("id"),rs.getString("items"),rs.getBoolean("status")));
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
        return items;
    }
    public static Todo getItem(int id){
        Todo item = null;
        try {
            Connection con= ConnectDB.connect();
            String sql="SELECT * FROM todo WHERE id=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                item=new Todo(rs.getInt("id"),rs.getString("items"),rs.getBoolean("status"));
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
        return item;
    }
    public static void remove(int id){
        try {
            Connection con= ConnectDB.connect();
            String sql="DELETE FROM todo WHERE id=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
    public static void update(Todo item){
        try {
            Connection con= ConnectDB.connect();
            String sql="UPDATE todo SET status=? WHERE id=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setBoolean(1,item.isStatus());
            ps.setInt(2, item.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
}
