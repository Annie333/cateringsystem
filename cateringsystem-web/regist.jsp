<%--
  Created by IntelliJ IDEA.
  User: chenlu
  Date: 2018/12/25
  Time: 17:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>餐饮管理系统</title>
    <script type="text/javascript" src="assets/js/log.js"></script>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="assets/css/login.css">
</head>
<body>
<div class="box">
    <div id="container">
        <div id="header"><h2 align="center">注册</h2>
        </div>
        <div class="content">
            <p align="center">账号:
                <input id="uname" type="text" name="user" placeholder="请输入你的账号">
            </p>
            <p align="center">密码:
                <input id="upass" type="password" name="psw" placeholder="请输入密码">
            </p>
            <p align="center">手机:
                <input id="contact" type="text" name="address" placeholder="请输入你的联系方式，可不填">
            </p>
            <p align="center">地址:
            <input id="address" type="text" name="address" placeholder="请输入你的地址，可不填">
        </p>
            <br/>

            <button onclick="fnLogin()" class="btn btn-primary">注册</button>
            <a href="index.jsp"><input type="button" class="btn btn-info" name="return" value="返回"></a>
        </div>

    </div>
</div>
</body>
</html>
