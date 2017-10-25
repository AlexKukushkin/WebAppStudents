<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <c:set var="context" value="${pageContext.request.contextPath}"/>
    <link type="text/css" rel="stylesheet" href="${context}/css/style_2.css"/>
    <%--<link rel="stylesheet" href="${context}/css/bootstrap.min.css">--%>
    <title>Students</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>

<form action="${pageContext.servletContext.contextPath}/create" method="POST">
    <table style="width:100%">
        <tr>
            <th>Id Student</th>
            <th>First Name</th>
            <th>Second Name</th>
            <th>Family Name</th>
            <th>Birth Date</th>
            <th>Group</th>
        </tr>
        <c:forEach items="${list}" var="item">
            <tr>
                <td><p><c:out value="${item.id}"></c:out></p></td>
                <td><p><c:out value="${item.firstName}"></c:out></p></td>
                <td><p><c:out value="${item.secondName}"></c:out></p></td>
                <td><p><c:out value="${item.familyName}"></c:out></p></td>
                <td><p><c:out value="${item.birthDay}"></c:out></p></td>
                <td><p><c:out value="${item.group_id}"></c:out></p></td>
            </tr>
        </c:forEach>
        <tr>
            <td>
                <p><input type="text" id="id" name="id" size="25" class="form-control" placeholder="Id Student"
                           required autofocus></p>
            </td>
            <td>
                <p><input type="text" id="firstName" name="firstName" size="25" class="form-control" placeholder="First Name"
                           required autofocus></p>
            </td>
            <td><p><input type="text" id="secondName" name="secondName" size="25" class="form-control" placeholder="Second Name"
                           required autofocus></p>
            </td>
            <td><p><input type="text" id="familyName" name="familyName" size="25" class="form-control" placeholder="Family Name"
                           required autofocus></p>
            </td>
            <td><p><input type="text" id="birthDay" name="birthDay" size="25" class="form-control" placeholder="Birthday"
                           required autofocus></p>
            </td>
            <td><p><input type="text" id="group_id" name="group_id" size="25" class="form-control" placeholder="Id Group"
                           required autofocus></p>
            </td>
        </tr>
    </table>
    <div>
        </br>
        <button class="button button1" type="addButton" formaction="/webstudents/insert"
                style="margin: auto; display: block">Insert
        </button>
    </div>
</form>
</body>
</html>