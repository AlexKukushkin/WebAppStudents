<%--
  Created by IntelliJ IDEA.
  User: Alex Kukushkin
  Date: 10/10/2017
  Time: 12:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
    html, body {
        height: 100%;
    }

    .outer-wrapper {
        display: table;
        width: 100%;
        height: 100%;
    }

    .inner-wrapper {
        display: table-cell;
        vertical-align: middle;
        padding: 15px;
    }

    .login-btn {
        position: fixed;
        top: 15px;
        right: 15px;
    }
</style>
<%--<head>--%>
<%--<title>Bootstrap Example</title>--%>
<%--<meta charset="utf-8">--%>
<%--<meta name="viewport" content="width=device-width, initial-scale=1">--%>
<%--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">--%>
<%--<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>--%>
<%--<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>--%>
<%--<title>Student project</title>--%>
<%--</head>--%>
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap Login &amp; Register Templates</title>

    <!-- CSS -->
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="assets/css/form-elements.css">
    <link rel="stylesheet" href="assets/css/style.css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

    <!-- Favicon and touch icons -->
    <link rel="shortcut icon" href="assets/ico/favicon.png">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="assets/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="assets/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="assets/ico/apple-touch-icon-57-precomposed.png">

</head>
<body class="top-content">
<form id="myForm" method="post" action="/webstudents/auth">
    <%--<div class="container">--%>
    <%--<label><b>Username</b></label>--%>
    <%--<input type="text" placeholder="Enter Username" name="login" required>--%>

    <%--<label><b>Password</b></label>--%>
    <%--<input type="password" placeholder="Enter Password" name="password" required>--%>

    <%--<button type="submit" value="login">Login</button>--%>
    <%--<input type="checkbox" checked="checked"> Remember me--%>
    <%--</div>--%>

    <%--<div class="container" style="background-color:#f1f1f1">--%>
    <%--<button type="button" class="cancelbtn">Cancel</button>--%>
    <%--<span class="psw">Forgot <a href="#">password?</a></span>--%>
    <%--</div>--%>
    <%--<div class="container">--%>
    <%--<div class="row">--%>
    <%--<div class="span12">--%>
    <%--<div class="" id="loginModal">--%>
    <%--<div class="modal-header">--%>
    <%--<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>--%>
    <%--<h3>Have an Account?</h3>--%>
    <%--</div>--%>
    <%--<div class="modal-body">--%>
    <%--<div class="well">--%>
    <%--<ul class="nav nav-tabs">--%>
    <%--<li class="active"><a href="#login" data-toggle="tab">Login</a></li>--%>
    <%--<li><a href="#create" data-toggle="tab">Create Account</a></li>--%>
    <%--</ul>--%>
    <%--<div id="myTabContent" class="tab-content">--%>
    <%--<div class="tab-pane active in" id="login">--%>
    <%--<form class="form-horizontal" action='' method="POST">--%>
    <%--<fieldset>--%>
    <%--<div id="legend">--%>
    <%--<legend class="">Login</legend>--%>
    <%--</div>--%>
    <%--<div class="control-group">--%>
    <%--<!-- Username -->--%>
    <%--<label class="control-label" for="username">Username</label>--%>
    <%--<div class="controls">--%>
    <%--<input type="text" id="username" name="username" placeholder=""--%>
    <%--class="input-xlarge">--%>
    <%--</div>--%>
    <%--</div>--%>

    <%--<div class="control-group">--%>
    <%--<!-- Password-->--%>
    <%--<label class="control-label" for="password">Password</label>--%>
    <%--<div class="controls">--%>
    <%--<input type="password" id="password" name="password" placeholder=""--%>
    <%--class="input-xlarge">--%>
    <%--</div>--%>
    <%--</div>--%>


    <%--<div class="control-group">--%>
    <%--<!-- Button -->--%>
    <%--<div class="controls">--%>
    <%--<button class="btn btn-success">Login</button>--%>
    <%--</div>--%>
    <%--</div>--%>
    <%--</fieldset>--%>
    <%--</form>--%>
    <%--</div>--%>
    <%--<div class="tab-pane fade" id="create">--%>
    <%--<form id="tab">--%>
    <%--<label>Username</label>--%>
    <%--<input type="text" value="" class="input-xlarge">--%>
    <%--<label>First Name</label>--%>
    <%--<input type="text" value="" class="input-xlarge">--%>
    <%--<label>Last Name</label>--%>
    <%--<input type="text" value="" class="input-xlarge">--%>
    <%--<label>Email</label>--%>
    <%--<input type="text" value="" class="input-xlarge">--%>
    <%--<label>Address</label>--%>
    <%--<textarea value="Smith" rows="3" class="input-xlarge">--%>
    <%--</textarea>--%>

    <%--<div>--%>
    <%--<button class="btn btn-primary">Create Account</button>--%>
    <%--</div>--%>
    <%--</form>--%>
    <%--</div>--%>
    <%--</div>--%>
    <%--</div>--%>
    <%--</div>--%>
    <%--</div>--%>
    <%--</div>--%>
    <%--</div>--%>
    <>
    <!-- Top content -->


    <div class="inner-bg">
        <div class="container">

            <div class="row">
                <div class="col-sm-8 col-sm-offset-2 text">
                    <h1><strong>Bootstrap</strong> Login &amp; Register Forms</h1>
                    <div class="description">
                        <p>
                            This is a free responsive <strong>"login and register forms"</strong> template made with
                            Bootstrap.
                            Download it on <a href="http://azmind.com" target="_blank"><strong>AZMIND</strong></a>,
                            customize and use it as you like!
                        </p>
                    </div>
                </div>
            </div>

            <div class="row">
                <div class="col-sm-5">

                    <div class="form-box">
                        <div class="form-top">
                            <div class="form-top-left">
                                <h3>Login to our site</h3>
                                <p>Enter username and password to log on:</p>
                            </div>
                            <div class="form-top-right">
                                <i class="fa fa-lock"></i>
                            </div>
                        </div>
                        <div class="form-bottom">
                            <form role="form" action="" method="post" class="login-form">
                                <div class="form-group">
                                    <label class="sr-only" for="form-username">Username</label>
                                    <input type="text" name="form-username" placeholder="Username..."
                                           class="form-username form-control" id="form-username">
                                </div>
                                <div class="form-group">
                                    <label class="sr-only" for="form-password">Password</label>
                                    <input type="password" name="form-password" placeholder="Password..."
                                           class="form-password form-control" id="form-password">
                                </div>
                                <button type="submit" class="btn">Sign in!</button>
                            </form>
                        </div>
                    </div>

                    <div class="social-login">
                        <h3>...or login with:</h3>
                        <div class="social-login-buttons">
                            <a class="btn btn-link-2" href="#">
                                <i class="fa fa-facebook"></i> Facebook
                            </a>
                            <a class="btn btn-link-2" href="#">
                                <i class="fa fa-twitter"></i> Twitter
                            </a>
                            <a class="btn btn-link-2" href="#">
                                <i class="fa fa-google-plus"></i> Google Plus
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</form>

<%--<%double num = Math.random();%>--%>
<%--<%=num%>--%>
<%--<%=request.getRequestURI()%>--%>
</body>
</html>
