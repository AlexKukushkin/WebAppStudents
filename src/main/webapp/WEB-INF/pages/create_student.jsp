
<%@ page contentType="text/html;charset=cp1251" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="${pageContext.servletContext.contextPath}/create" method="POST">
    <table>
        <tr>
            <td align="right" >First Name : </td>
            <td>
                <input type="text" name="firstName">
            </td>
        </tr>
        <tr>
            <td align="right" >Second Name : </td>
            <td>
                <input type="text" name="secondName">
            </td>
        </tr>
        <tr>
            <td align="right" >Family Name : </td>
            <td>
                <input type="text" name="familyName">
            </td>
        </tr>
        <tr>
            <td align="right" >Birth Date : </td>
            <td>
                <input type="text" name="birthDay">
            </td>
        </tr>
        <tr>
            <td align="right" >Group : </td>
            <td>
                <input type="text" name="group_id">
            </td>
        </tr>
        <tr>
            <td><input type="submit" align="center" value="Создать"/></td>
        </tr>
    </table>
</form>
</body>
</html>
