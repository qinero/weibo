package com.weibo.dao;

import com.weibo.pojo.User;
import com.weibo.util.DButil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    // 查询数据库用户
    public User selectName(String username) {
        try {
            // 得到一个连接
            Connection conn = DButil.getConn();
            // 得到操作数据库对象
            PreparedStatement search = conn.prepareStatement("select * from user where userName=?");
            search.setString(1, username);

            ResultSet result = search.executeQuery(); // 执行SQL
            User users = null;
            // bean封装
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
            // 返回查询用户全部信息
            return users;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 注册用户
    public boolean addName(String userName,String pwd) {
        try {
            // 得到一个连接
            Connection conn = DButil.getConn();
            // 向数据库添加用户
            PreparedStatement search = conn.prepareStatement("insert into user (userName,userPassword) values(?,?)");
            search.setString(1, userName);
            search.setString(2, pwd);
            // 执行SQL语句
            int result = search.executeUpdate();
            search.close();
            conn.close();
            // 是否添加成功
            if (result == 1) {
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

    // 删除用户
    public boolean deleteName(String userName) {
        try {
            // 得到一个连接
            Connection conn = DButil.getConn();
            // 向数据库删除用户
            PreparedStatement search = conn.prepareStatement("delete from user where userName=?");
            search.setString(1, userName);
            // 执行SQL语句
            int result = search.executeUpdate();
            search.close();
            conn.close();
            // 是否添加成功
            if (result == 1) {
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

    // 更新简介信息
    public boolean upIntroduce(String userName,String introduce) {
        try {
            // 得到一个连接
            Connection conn = DButil.getConn();
            System.out.println("111");
            // 向数据库添加用户
            PreparedStatement search = conn.prepareStatement("update user set aphorism=? where userName=? ");
            search.setString(1, introduce);
            search.setString(2, userName);
            System.out.println("333");
            // 执行SQL语句
            int result = search.executeUpdate();
            search.close();
            conn.close();
            // 是否添加成功
            if (result >= 1) {
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

    // 更新头像信息
    public boolean upHead(String userName,String head) {
        try {
            // 得到一个连接
            Connection conn = DButil.getConn();
            // 向数据库添加用户
            PreparedStatement search = conn.prepareStatement("update user set chatHead=? where userName=? ");
            search.setString(1, head);
            search.setString(2, userName);
            // 执行SQL语句
            int result = search.executeUpdate();
            search.close();
            conn.close();
            // 是否添加成功
            if (result > 0) {
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
