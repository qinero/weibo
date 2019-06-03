package com.weibo.servlet;

import com.weibo.dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "IntroduceServlet", urlPatterns = {"/IntroduceServlet"})
public class IntroduceServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置编码格式
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        String  introduce= request.getParameter("introduce");
        // Session 传值
        HttpSession session = request.getSession();
        String username=  (String)session.getAttribute("username");
        // 操作数据库
        UserDao ud = new UserDao();
        // 添加简介
        boolean result= ud.upIntroduce(username,introduce);
        // 是否添加成功
        if (result == true) {
           request.getRequestDispatcher("home.jsp").forward(request, response);
        } else {
            // 提示重新设置窗口
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out=response.getWriter();
            out.print("<script language='javascript'>('未提交成功，请重新提交')");
            out.print("<script>window.location.href='introduce.jsp'</script>");
        }
    }
}
