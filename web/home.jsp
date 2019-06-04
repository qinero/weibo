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
    <meta charset="utf-8" />
    <link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
    <link rel="icon" type="image/png" href="assets/img/favicon.png">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <title>微博-主页</title>
    <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />
    <!--     Fonts and icons     -->
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700,200" rel="stylesheet" />
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" />
    <!-- CSS Files -->
    <link href="assets/css/bootstrap.min.css" rel="stylesheet" />
    <link href="assets/css/now-ui-kit.css?v=1.1.0" rel="stylesheet" />
    <!-- CSS Just for demo purpose, don't include it in your project -->
    <link href="assets/css/demo.css" rel="stylesheet" />
    <!-- Canonical SEO -->
    <link rel="canonical" href="" />
    <!--  Social tags      -->
    <meta name="keywords" content="">
    <meta name="description" content="">
</head>


<body class="profile-page sidebar-collapse">
    <!-- Navbar -->
    <nav class="navbar navbar-expand-lg bg-primary fixed-top navbar-transparent " color-on-scroll="400">
        <div class="container">
            <div class="navbar-translate">
                <a class="navbar-brand" href="#" rel="tooltip" title="" data-placement="bottom">
                    回到顶部
                </a>
                <button class="navbar-toggler navbar-toggler" type="button" data-toggle="collapse" data-target="#navigation" aria-controls="navigation-index" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-bar bar1"></span>
                    <span class="navbar-toggler-bar bar2"></span>
                    <span class="navbar-toggler-bar bar3"></span>
                </button>
            </div>
            <div class="collapse navbar-collapse justify-content-end" data-nav-image="assets/img/blurred-image-1.jpg">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" href="head.jsp">修改头像</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="introduce.jsp">修改简介</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <!-- End Navbar -->
    <div class="wrapper">
        <div class="page-header page-header-small" filter-color="orange">
            <div class="page-header-image" data-parallax="true" style="background-image: url('assets/img/bg5.jpg');">
            </div>
            <div class="container">
                <div class="content-center">
                    <div class="photo-container">
                        <img src="<%
                        String head = request.getParameter("head");
                        out.println(head);
                    %>" alt="">
                    </div>
                    <!-- 昵称 -->
                    <h3 class="title"><%
                        String name = request.getParameter("username");
                        out.println(name);
                    %>
                    </h3>
                    <!-- 简介 -->
                    <p class="category"><%
                        String intr = request.getParameter("introduce");
                        out.println(intr);
                    %></p>
                    <div class="content">
                        <div class="social-description">
                            <h2>26</h2>  <!-- 链接 -->
                            <a class="nav-link" href="#">微博</a>
                        </div>
                        <div class="social-description">
                            <h2>30</h2>
                            <a class="nav-link" href="#">关注</a>
                        </div>
                        <div class="social-description">
                            <h2>20</h2>
                            <a class="nav-link" href="#">粉丝</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="section">
            <div class="container">
                <div class="button-container">
                    <a href="write.jsp" class="btn btn-primary btn-round btn-lg">写微博</a>
                </div>
                <div class="row">
                    <div class="col-md-6 ml-auto mr-auto">
                        <div class="nav-align-center">
                            <ul class="nav nav-pills nav-pills-primary" role="tablist">
                                <li class="nav-item">
                                    <a class="nav-link" data-toggle="tab" href="#profile" role="tablist" ><br>热门</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link active" data-toggle="tab" href="#home" role="tablist"><br>关注</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" data-toggle="tab" href="#messages" role="tablist"><br>消息</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                    <!-- Tab panes -->
                    <div class="tab-content gallery">
                        <div class="tab-pane active" id="home" role="tabpanel">
                            <div class="col-md-10 ml-auto mr-auto">
                                <div class="row collections">
                                    <div class="col-md-6">
                                        <img src="assets/img/bg1.jpg" alt="" class="img-raised">
                                        <img src="assets/img/bg3.jpg" alt="" class="img-raised">
                                    </div>
                                    <div class="col-md-6">
                                        <img src="assets/img/bg8.jpg" alt="" class="img-raised">
                                        <img src="assets/img/bg7.jpg" alt="" class="img-raised">
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="tab-pane" id="profile" role="tabpanel">
                            <div class="col-md-10 ml-auto mr-auto">
                                <div class="row collections">
                                    <div class="col-md-6">
                                        <img src="assets/img/bg6.jpg" class="img-raised">
                                        <img src="assets/img/bg11.jpg" alt="" class="img-raised">
                                    </div>
                                    <div class="col-md-6">
                                        <img src="assets/img/bg7.jpg" alt="" class="img-raised">
                                        <img src="assets/img/bg8.jpg" alt="" class="img-raised">
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="tab-pane" id="messages" role="tabpanel">
                            <div class="col-md-10 ml-auto mr-auto">
                                <div class="row collections">
                                    <div class="col-md-6">
                                        <img src="assets/img/bg3.jpg" alt="" class="img-raised">
                                        <img src="assets/img/bg8.jpg" alt="" class="img-raised">
                                    </div>
                                    <div class="col-md-6">
                                        <img src="assets/img/bg7.jpg" alt="" class="img-raised">
                                        <img src="assets/img/bg6.jpg" class="img-raised">
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
<!--   Core JS Files   -->
<script src="assets/js/core/jquery.3.2.1.min.js" type="text/javascript"></script>
<script src="assets/js/core/popper.min.js" type="text/javascript"></script>
<script src="assets/js/core/bootstrap.min.js" type="text/javascript"></script>
<!--  Plugin for Switches, full documentation here: http://www.jque.re/plugins/version3/bootstrap.switch/ -->
<script src="assets/js/plugins/bootstrap-switch.js"></script>
<!--  Plugin for the Sliders, full documentation here: http://refreshless.com/nouislider/ -->
<script src="assets/js/plugins/nouislider.min.js" type="text/javascript"></script>
<!--  Plugin for the DatePicker, full documentation here: https://github.com/uxsolutions/bootstrap-datepicker -->
<script src="assets/js/plugins/bootstrap-datepicker.js" type="text/javascript"></script>
<!-- Share Library etc -->
<script src="assets/js/plugins/jquery.sharrre.js" type="text/javascript"></script>
<!-- Control Center for Now Ui Kit: parallax effects, scripts for the example pages etc -->
<script src="assets/js/now-ui-kit.js?v=1.1.0" type="text/javascript"></script>

</html>