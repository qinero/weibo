package com.weibo.servlet;

import com.weibo.util.Fileutil;
import com.weibo.util.Ziputil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "WriteServlet", urlPatterns = {"/WriteServlet"})
public class WriteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        String  content= request.getParameter("content");

        Ziputil zip=new Ziputil();
        Fileutil save=new Fileutil();
        byte[] compressed;
        String decompressed;

        compressed=zip.compress(content); // 将文字压缩
        save.saveFile(compressed);

        decompressed=zip.decompress(compressed); // 得到解压后的文字

    }
}

