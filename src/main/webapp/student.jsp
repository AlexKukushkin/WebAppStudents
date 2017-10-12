<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <style>
        table, th, td {
            border: 1px solid black;
            border-collapse: collapse;
        }

        th, td {
            padding: 5px;
        }

        th {
            text-align: left;
        }
    </style>
    <title>Students</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>

<form method="post">
    <table style="width:100%">
        <tr>
            <th>Id Student</th>
            <th>First Name</th>
            <th>Second Name</th>
            <th>Family Name</th>
            <th>Birth Date</th>
            <th>Group</th>
            <th>Action</th>
        </tr>
        <c:forEach items="${list}" var="item">
            <tr>
                <td>
                    <p><c:out value="${item.id}"></c:out></p>
                </td>
                <td>
                    <p><c:out value="${item.firstName}"></c:out></p>
                </td>
                <td>
                    <p><c:out value="${item.secondName}"></c:out></p>
                </td>
                <td>
                    <p><c:out value="${item.familyName}"></c:out></p>
                </td>
                <td>
                    <p><c:out value="${item.birthDay}"></c:out></p>
                </td>
                <td>
                    <p><c:out value="${item.group_id}"></c:out></p>
                </td>
                <td>
                    <p><%--<input type="submit" name="delete" value="${item.id}" class="delete"/>--%>
                        <button name="delete" value="${item.id}" formaction="/webstudents/deleteById">Удалить</button>
                        <button name="edit" value="${item.id}">Изменить</button>
                        <%--<button name="edit" value="${item.id}" formaction="/webstudents/editById">Изменить</button>--%>
                    </p>
                </td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>