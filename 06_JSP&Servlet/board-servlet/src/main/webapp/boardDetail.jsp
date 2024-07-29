
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>welcome</title>
</head>
<%@include file="header.jsp"%>
<body>
        <h1>작성하신 글의 내용은</h1>
        <h2><%= request.getAttribute("post")%> 입니다. </h2>
</body>
</html>
