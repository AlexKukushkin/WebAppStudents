<%--
  Created by IntelliJ IDEA.
  User: Alex Kukushkin
  Date: 10/10/2017
  Time: 12:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <style>
      table, th, td {
        border: 1px solid black;
        border-collapse: collapse;
      }
    </style>
    <title>Student project</title>
  </head>
  <body>
  <form id="myForm" method="post" action="/webstudents/auth">
    <input type="text" name="login"/>
    <input type="password" name="password"/>
    <input type="submit" value="login"/>
  </form>
  <table style="width:100%">
    <tr>
      <th>First name</th>
      <th>Last name</th>
      <th>Age</th>
    </tr>
    <tr>
      <td>Jill</td>
      <td>Smith</td>
      <td>50</td>
    </tr>
    <tr>
      <td>Eve</td>
      <td>Jackson</td>
      <td>94</td>
    </tr>
    <tr>
      <td>John</td>
      <td>Doe</td>
      <td>80</td>
    </tr>
  </table>
  <%double num = Math.random();%>
  <%=num%>
  <%=request.getRequestURI()%>
  </body>
</html>
