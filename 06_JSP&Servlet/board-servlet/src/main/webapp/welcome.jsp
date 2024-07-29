
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>welcome</title>
</head>
<%@include file="header.jsp"%>
<body>
        <h1>로그인 성공</h1>
       <h2>환영합니다! <%= request.getAttribute("username") %>님</h2>
        <h2>환영합니다! ${username}님 </h2>
</body>
</html>
