package com.weibo.dao;

import com.weibo.util.DButil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserAddDao {
    static int count=2;
    public boolean addName() {
        try {
            Connection conn = DButil.getConn();
            PreparedStatement search = conn.prepareStatement("INSERT INTO User (userId,userName,userPassword) VALUES (count,?,?)");
            System.out.println("正确1");
            count++;
            search.close();
            conn.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
