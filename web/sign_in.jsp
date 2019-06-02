<%--
  Created by IntelliJ IDEA.
  User: 沁儿
  Date: 2019/5/7
  Time: 20:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <title>注册</title>
    <link rel="stylesheet" type="text/css" href="./css/sign_in.css">
    <script src="./js/sign_in.js"></script>
</head>
<body bgcolor="#ffa500">

<div class="box">
    <form action="SignInServlet" method="POST">
    <div id="tittle"><h2 align="center">注册</h2></div>
    <p class="input_box">
        账户： <input name="name" id="name" type="text" placeholder="请输入您的昵称">
    </p>
    <p class="input_box">
        密码： <input name="pass" id="pass" type="password" placeholder="请设置您的密码">
    </p>
    <p class="input_box">
        验证： <input name="passl" id="passl" type="password" placeholder="请再次输入密码">
    </p>

    <div id="error_box"><br></div>
    <div class="button">

            <button type="submit">立即注册</button>

    </div>
    <h4 align="center"><a href="index.jsp">已有账号请登录</a></h4>
    </form>
</div>

</body>
</html>