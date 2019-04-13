package com.weibo.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DButil {
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConn() throws Exception {
        Connection conn;
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/weibo?serverTimezone=GMT%2B8", "root", "201610204032");
        return conn;
    }
}