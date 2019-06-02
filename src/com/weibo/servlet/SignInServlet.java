package com.weibo.servlet;

import com.weibo.dao.UserAddDao;
import com.weibo.dao.UserDao;
import com.weibo.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "SignInServlet", urlPatterns = {"/SignInServlet"})
public class SignInServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        // 获取提交的昵称，密码
        String userName = request.getParameter("name");
        String pwd = request.getParameter("pass");
        System.out.println(userName);
        UserAddDao uad = new UserAddDao();
        boolean flag = uad.addName(userName,pwd);

        if (flag) {
            System.out.println("正确4");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }

}

