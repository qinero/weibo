package com.weibo.servlet;

import com.weibo.dao.UserDao;
import com.weibo.pojo.User;
import com.weibo.util.Fileutil;
import com.weibo.util.Ziputil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "WriteServlet", urlPatterns = {"/WriteServlet"})
public class WriteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        String content= request.getParameter("content");
        // Session 传来用户名
        HttpSession session = request.getSession();
        Object user=  session.getAttribute("username");
        // 文字小于20字不压缩
        if(content.length()<21){
            Fileutil save=new Fileutil();
            save.saveString(content,user);
        }
        // 大于20字压缩
        else{
            Ziputil zip=new Ziputil();
            Fileutil save=new Fileutil();
            byte[] compressed;

            String decompressed;
            // 将文字压缩
            compressed=zip.compress(content);
            save.saveFile(compressed,user);
            // 得到解压后的文字
            //decompressed=zip.decompress(compressed);
        }
        request.getRequestDispatcher("home.jsp").forward(request, response);
    }
}

