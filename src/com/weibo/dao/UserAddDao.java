package com.weibo.dao;

import com.weibo.util.DButil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserAddDao {
    public boolean addName(String userName,String pwd) {
        try {
            Connection conn = DButil.getConn();
            System.out.println("正确0");
            PreparedStatement search = conn.prepareStatement("insert into user (userName,userPassword) values(?,?)");
            search.setString(1, userName);
            search.setString(2, pwd);
            // 执行SQL语句
            int result = search.executeUpdate();
            search.close();
            conn.close();
            if (result != -1) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
