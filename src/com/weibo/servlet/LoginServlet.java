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
import java.io.PrintWriter;

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

        User user = ud.selectName(userName);

        if (user != null) {
            if (pwd.equals(user.getUserPassword())) {
                // session 保存用户名
                String username =user.getUserName();
                HttpSession session = request.getSession();
                session.setAttribute("username", username);
                request.getRequestDispatcher("home.jsp").forward(request, response);
            }
        } else {
            // 创建新用户
            // 提示注册窗口
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out=response.getWriter();
            out.print("<script language='javascript'>('请先注册')");
            out.print("<script>window.location.href='sign_in.jsp'</script>");
        }
    }
}
