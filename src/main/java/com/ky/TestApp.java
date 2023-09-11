package com.ky;

import java.sql.*;

public class TestApp {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/webapp","root","");
            System.out.println("Server connected");
            //insert into users values (null,'admin','a123')
            //select * from users
            PreparedStatement ps=con.prepareStatement("update users set username='administrator' where id=1");
            ps.executeUpdate();
//            ResultSet rs=ps.executeQuery();
//            while(rs.next()){
//                System.out.println(rs.getInt("id")+" "+rs.getString("username"));
//            }

            System.out.println("data updated");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e);
        }
    }
}
