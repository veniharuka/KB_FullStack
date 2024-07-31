<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2024-07-31
  Time: 오전 9:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Integer age=null; // 이건 지역변수
    request.setAttribute("age", null); //이건 request의 age키로 받아오는 거

%>



<html>
<head>
    <title>Title</title>
</head>
<body>
변수 age : <%=age%> <br>
EL age : ${age}
</body>
</html>
