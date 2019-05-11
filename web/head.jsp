<%--
  Created by IntelliJ IDEA.
  User: 沁儿
  Date: 2019/5/11
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1.0,user-scalable=no">
    <title>修改头像</title>
    <style>
        div {
            width: 100%;
        }

        .logo img {
            display: block;
            margin: 0 auto;
        }

        .upload {
            position: relative;
            width: 80px;
            height: 18px;
            line-height: 18px;
            background: #fc6d0efb;
            text-align: center;
            color: rgb(255, 255, 255);
            padding: 0px 5px;
            -webkit-border-radius: 2px;
            border-radius: 2px;
            margin: 0 auto;
        }

        .upload form {
            width: 100%;
            position: absolute;
            left: 0;
            top: 0;
            opacity: 0;
            filter: alpha(opacity=0);
        }

        .upload form input {
            width: 100%;
        }
    </style>
</head>
<body>
<div class="logo">
    <img src="#"/>
</div>
<div class="upload">
    <p>上传图片</p>
    <form>
        <input type="file"/>
    </form>
</div>
</body>
</html>
