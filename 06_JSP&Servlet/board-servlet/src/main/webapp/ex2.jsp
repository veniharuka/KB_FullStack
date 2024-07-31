<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2024-07-31
  Time: 오후 4:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@include file="header.jsp"%>

    <c:if test="${condition}">
        <p>전달 받은 조건은 ${msg1}!</p>
    </c:if>
    <c:if test="${!condition}">
        <p>전달 받은 조건은 ${msg2}!</p>
    </c:if>

    <h2>리스트 컬렉션 출력하기</h2>
    <c:forEach var="item" items="${lunchList}">
        <li>${item}</li>
    </c:forEach>
</body>
</html>
