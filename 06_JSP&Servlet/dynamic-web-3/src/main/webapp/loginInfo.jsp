<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2024-07-29
  Time: 오전 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>로그인 입력 파라미터 출력</h1>
<%
    String userid = request.getParameter("userid");
    String Password = request.getParameter("password");
%>
아이디 값 : <%= userid%> <br>
비밀번호 : <%= Password%> <br>
</body>
</html>
