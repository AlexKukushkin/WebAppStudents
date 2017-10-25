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

<form action="${pageContext.servletContext.contextPath}/save" method="post">
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
        <tr>
            <td>
                <p><input type="text" name="id_student" size="15" value="<c:out value="${student.id}"></c:out>"/></p>
            </td>
            <td>
                <p><input type="text" name="first_name" size="15" value="<c:out value="${student.firstName}"></c:out>"/>
                </p>
            </td>
            <td>
                <p><input type="text" name="second_name" size="15"
                          value="<c:out value="${student.secondName}"></c:out>"/></p>
            </td>
            <td>
                <p><input type="text" name="family_name" size="15"
                          value="<c:out value="${student.familyName}"></c:out>"/></p>
            </td>
            <td>
                <p><input type="text" name="birthday" size="15" value="<c:out value="${student.birthDay}"></c:out>"/>
                </p>
            </td>
            <td>
                <p><input type="text" name="group_id" size="15" value="<c:out value="${student.group_id}"></c:out>"/>
                </p>
            </td>
            <td>
                <p>
                    <button type="submit" name="save" value="${student.id}" formaction="/webstudents/save">Сохранить</button>
                </p>
            </td>
        </tr>
    </table>
</form>
</body>
</html>