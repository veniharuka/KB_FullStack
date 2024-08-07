<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@include file="header.jsp"%>
<h1>할 일 목록 2</h1>
<ul>
    <li><b>할 일 리스트</b></li>
    <c:forEach var="todo" items="${todoList}">
        <li>${todo.todo}</li>
    </c:forEach>
</ul>
</body>
</html>
