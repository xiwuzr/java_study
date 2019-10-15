package com.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
    public static Connection getConnection(){
       Connection conn=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldata?&serverTimezone=UTC",
                    "root","123456");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;

    }


}
