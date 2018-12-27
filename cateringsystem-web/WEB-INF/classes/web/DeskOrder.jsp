<%--
  Created by IntelliJ IDEA.
  User: chenlu
  Date: 2018/12/25
  Time: 20:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>餐饮管理系统</title>

    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="assets/materialize/css/materialize.min.css" media="screen,projection" />
    <!-- Bootstrap Styles-->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FontAwesome Styles-->
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
    <!-- Morris Chart Styles-->
    <link href="assets/js/morris/morris-0.4.3.min.css" rel="stylesheet" />
    <!-- Custom Styles-->
    <link href="assets/css/custom-styles.css" rel="stylesheet" />
    <!-- Google Fonts-->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
    <link rel="stylesheet" href="assets/js/Lightweight-Chart/cssCharts.css">
</head>
<body>
<div id="wrapper">
    <nav class="navbar navbar-default top-navbar" role="navigation">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand waves-effect waves-dark" href="OrderSheet.jsp"><i class="large material-icons">track_changes</i> <strong>餐饮管理</strong></a>
        </div>
    </nav>


    <nav class="navbar-default navbar-side" role="navigation">
        <div class="sidebar-collapse">
            <ul class="nav" id="main-menu">
                <li>
                    <a href="OrderSheet.jsp" class="waves-effect waves-dark"><i class="fa fa-sitemap"></i> 点单/结账<span class="fa arrow"></span></a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a href="DeskOrder.jsp" class="active-menu waves-effect waves-dark"><i class="fa fa-dashboard"></i>餐桌</a>
                        </li>
                        <li>
                            <a href="BalconyOrder.jsp" class="waves-effect waves-dark"><i class="fa fa-dashboard"></i>包厢</a>
                        </li>
                        <li>
                            <a href="TakeoutOrder.jsp" class="waves-effect waves-dark"><i class="fa fa-dashboard"></i>外卖</a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="MenuManagement.jsp" class="waves-effect waves-dark"><i class="fa fa-desktop"></i> 菜单信息</a>
                </li>
                <li>
                    <a href="DeskManagement.jsp" class="waves-effect waves-dark"><i class="fa fa-bar-chart-o"></i> 餐桌信息</a>
                </li>
                <li>
                    <a href="OrderManagement.jsp" class="waves-effect waves-dark"><i class="fa fa-qrcode"></i> 订单信息</a>
                </li>

                <li>
                    <a href="StaffManagement.jsp" class="waves-effect waves-dark"><i class="fa fa-table"></i> 员工信息</a>
                </li>
            </ul>

        </div>

    </nav>
    <!-- /. NAV SIDE  -->
    <div id="page-wrapper" >
        <div class="header">
            <h1 class="page-header">餐桌</h1>
        </div>

        <div id="page-inner">

            <div class="row">
                <div class="col-md-4 col-sm-4">
                    <div class="card teal">
                        <div class="card-content white-text">
                            <span class="card-title">A01</span>
                            <p>可容纳人数：10</p>
                            <p>当前状态：已接单</p>
                        </div>
                        <div class="card-action">
                            <a href="#">下单</a>
                            <a href="#">确认送达</a>
                            <a href="#">完成用餐</a>
                            <a href="#">查看订单</a>
                        </div>
                    </div>
                </div>
                <div class="col-md-4 col-sm-4">
                    <div class="card teal">
                        <div class="card-content white-text">
                            <span class="card-title">A02</span>
                            <p>可容纳人数：5</p>
                            <p>当前状态：空</p>
                        </div>
                        <div class="card-action">
                            <a href="#">下单</a>
                            <a href="#">确认送达</a>
                            <a href="#">完成用餐</a>
                            <a href="#">查看订单</a>
                        </div>
                    </div>
                </div>
                <div class="col-md-4 col-sm-4">
                    <div class="card teal">
                        <div class="card-content white-text">
                            <span class="card-title">A03</span>
                            <p>可容纳人数：5</p>
                            <p>当前状态：空</p>
                        </div>
                        <div class="card-action">
                            <a href="#">下单</a>
                            <a href="#">确认送达</a>
                            <a href="#">完成用餐</a>
                            <a href="#">查看订单</a>
                        </div>
                    </div>
                </div>
            </div>

        </div>
        <!-- /. PAGE WRAPPER  -->
        <!-- /. WRAPPER  -->
        <!-- JS Scripts-->
        <script src="assets/js/jquery-1.10.2.js"></script>

        <!-- Bootstrap Js -->
        <script src="assets/js/bootstrap.min.js"></script>

        <script src="assets/materialize/js/materialize.min.js"></script>

        <!-- Metis Menu Js -->
        <script src="assets/js/jquery.metisMenu.js"></script>
        <!-- Morris Chart Js -->
        <script src="assets/js/morris/raphael-2.1.0.min.js"></script>
        <script src="assets/js/morris/morris.js"></script>


        <script src="assets/js/easypiechart.js"></script>
        <script src="assets/js/easypiechart-data.js"></script>

        <script src="assets/js/Lightweight-Chart/jquery.chart.js"></script>

        <!-- Custom Js -->
        <script src="assets/js/custom-scripts.js"></script>
        <script>
            $(document).ready(function(){
                $('ul.tabs').tabs();
                $('.collapsible').collapsible({
                        accordion: false, // A setting that changes the collapsible behavior to expandable instead of the default accordion style
                        onOpen: function(el) { alert('Open'); }, // Callback for Collapsible open
                        onClose: function(el) { alert('Closed'); } // Callback for Collapsible close
                    }
                );
            });
        </script>

</body>

</html>