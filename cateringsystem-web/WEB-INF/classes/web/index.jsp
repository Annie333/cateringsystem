<%--
  Created by IntelliJ IDEA.
  User: chenlu
  Date: 2018/12/25
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>餐饮管理系统</title>
  <script type="text/javascript" src="assets/js/login.js"></script>
  <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
  <link rel="stylesheet" href="assets/css/login.css">

</head>
<body>
<div class="box">
  <h2>登录</h2>

  <div class="content">
    <p align="center">账号:
      <input id="uname" type="text" name="user" placeholder="请输入你的账号">
    </p>
    <p align="center">密码:
      <input id="upass" type="password" name="password" placeholder="请输入密码">
    </p>
  </div>
  <div class="content">
    <button type="button" class="btn btn-primary" onclick="fnLogin()">登陆</button>
    <a href="regist.jsp"><input type="button" class="btn btn-info" name="regist" value="注册"></a>
  </div>

</div>
</body>
</html>
