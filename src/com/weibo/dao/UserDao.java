package com.weibo.dao;

import com.weibo.pojo.User;
import com.weibo.util.DButil;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    public String nowUser;
    public User selectName(String user) {
        try {
            Connection conn = DButil.getConn();
            PreparedStatement search = conn.prepareStatement("SELECT * FROM user WHERE userId=?");
            search.setString(1, user);
   //         search.setString(2, user);
            nowUser = user;
            ResultSet result = search.executeQuery(); // 执行
            User users = null;

            while (result.next()) {
                users = new User();
                users.setUserId(result.getInt("userId"));
                users.setUserName(result.getString("userName"));
                users.setUserPassword(result.getString("userPassword"));
                users.setFans(result.getInt("fans"));
                users.setCarePeople(result.getInt("carePeople"));
                users.setMicroblog(result.getInt("microblog"));
                users.setChatHead(result.getString("chatHead"));
                users.setAphorism(result.getString("aphorism"));
            }
            result.close();
            search.close();
            conn.close();
            return users;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
