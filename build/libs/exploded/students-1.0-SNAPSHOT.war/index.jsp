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
    html, body { height:100%; }

    .outer-wrapper {
        display: table;
        width: 100%;
        height: 100%;
    }

    .inner-wrapper {
        display:table-cell;
        vertical-align:middle;
        padding:15px;
    }
    .login-btn { position:fixed; top:15px; right:15px; }
</style>
<head>
    <title>Student project</title>
</head>
<body>
<form id="myForm" method="post" action="/webstudents/auth">
    <%--<input type="text" name="login"/>--%>
    <%--<input type="password" name="password"/>--%>
    <%--<input type="submit" value="login"/>--%>
    <div class="container">
        <label><b>Username</b></label>
        <input type="text" placeholder="Enter Username" name="login" required>

        <label><b>Password</b></label>
        <input type="password" placeholder="Enter Password" name="password" required>

        <button type="submit" value="login">Login</button>
        <input type="checkbox" checked="checked"> Remember me
    </div>

    <div class="container" style="background-color:#f1f1f1">
        <button type="button" class="cancelbtn">Cancel</button>
        <span class="psw">Forgot <a href="#">password?</a></span>
    </div>
</form>

<%double num = Math.random();%>
<%=num%>
<%=request.getRequestURI()%>
</body>
</html>
