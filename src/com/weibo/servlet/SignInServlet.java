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

        String userName = request.getParameter("name");
        String pwd = request.getParameter("pass");

        UserDao ud = new UserDao();
        User user = new User();
        user = ud.selectName(userName);

        if (user == null) {
            // 创建新用户
            UserAddDao addUser = new UserAddDao();
            boolean add;
            add = addUser.addName();
            System.out.println("正确3");
            if (add == true) {
                System.out.println("正确4");
                request.getRequestDispatcher("index.jsp").forward(request, response);

            }
        } else {

        }
    }
     /*   System.out.println("正确2");
        UserAddDao addUser = new UserAddDao();
        User user = new User();
        boolean add;

        add=addUser.addName();
        System.out.println("正确3");
        if (add==true) {
            System.out.println("正确4");
            request.getRequestDispatcher("index.jsp").forward(request, response);

        }

      */
}

