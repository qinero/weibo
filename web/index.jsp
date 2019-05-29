<%--
  Created by IntelliJ IDEA.
  User: 沁儿
  Date: 2019/5/7
  Time: 20:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title> new微博-感知世界 </title>
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <header>
            <nav class="b_clear">
                <div class="nav_logo l_float">
                    <img src="imgs/logo.svg" alt="">
                </div>
                <div class="nav_link r_float">
                    <ul>
                        <li><a href="#">返回首页</a></li>
                        <li><a href="#">关于我们</a></li>
                        <li><a href="#">联系我们</a></li>

                    </ul>
                </div>
            </nav>
        </header>
        <div class="container">
            <div class="login_body l_clear">
                <div class="login_form l_float">
                    <div class="login_top">
                        <img src="imgs/logo_z.svg" alt="" class="">
                        
                        <div class="login_tags b_clear">
                            <span class="top_tag l_float active" onClick="PwdLogin()">密码登录</span>
                         
                        </div>
                        <br>
                    </div>
                  
                    <div class="login_con">
                        <form action="LoginServlet" method="POST">
                            <div>
                                <label for="user_name">用户名</label>
                                <input type="text" name="username" id="user_name" placeholder="账号/手机号/邮箱">
                                <img src="imgs/icons/user.svg">
                                <p class="tips hidden">请检查您的账号</p>
                            </div>
                            <br>
                            <br>
                            <div>
                                <label for="user_pwd">密码</label>
                                <input type="password" name="password" id="user_pwd" placeholder="请输入账户密码">
                                <img src="imgs/icons/lock.svg">
                                <p class="tips hidden">请检查您的密码</p>
                            </div>
                            <br>
                            <br>
                            <div class="b_clear submit">
                                
                                <button type="submit">登&nbsp;&nbsp;录</button>
                                <a href="sign_in.jsp" class="r_float">没有账号？点我</a>
                                <p class="tips hidden">登录失败，请检查您的账户与密码</p>
                            </div>
                            <br>
                            <br>
                        </form>   
                    </div>
                </div>
                <div class="login_ad l_float" id="AdImg">
                    <a href="">查看详情</a>
                </div>
            </div>
            <div class="footer">
                        <p><a href="#">沁儿的梦</a></p>
                    </div>
        </div>

        <script src="js/login.js"></script>        
    </body>
</html>
