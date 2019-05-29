package com.weibo.servlet;

import com.weibo.dao.UserDao;
import com.weibo.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        String userName = request.getParameter("username");
        String pwd = request.getParameter("password");

        UserDao ud = new UserDao();
        User user = new User();
        user = ud.selectName(userName);

        if (user == null) {
            // 创建新用户

        } else {
            if (pwd.equals(user.getUserPassword())) {
                int id=user.getUserId();
                HttpSession session = request.getSession();
                session.setAttribute("user", id);
                // request.setAttribute("user", user);
                //System.out.println("正确");
                request.getRequestDispatcher("home.jsp").forward(request, response);

            }
        }
    }
}
