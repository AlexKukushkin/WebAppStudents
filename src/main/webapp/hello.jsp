<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Hello title</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>
<%=request.getParameter("login")%>
<c:forTokens var = "message" items = "Artem, Vladimir, Pavel" delims = ", ">
    <c:out value="${message}"></c:out>
</c:forTokens>
<c:forEach items = "${list}" var = "item">
    <p><c:out value = "${item.firstName}"></c:out></p>
</c:forEach>
</body>
</html>