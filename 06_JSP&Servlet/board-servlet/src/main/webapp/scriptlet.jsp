<%@ page import="com.sun.org.apache.xpath.internal.operations.Bool" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2024-07-31
  Time: 오후 3:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@include file="header.jsp"%>
<h2>조건 처리</h2>
<%
    Boolean condition = (Boolean) request.getAttribute("condition");
    if(condition){
%>
<p>전달 받은 조건은 TRUE!</p>
<%
    } else{
%>
<p>전달 받은 조건은 FALSE!</p>
<%
        }
%>

<h2>리스트 컬렉션 출력하기</h2>
<ul>
    <%
        List<String> items = (List<String>) request.getAttribute("list");
        if(items != null){
            for(String item : items){
    %>
    <li><%= item %></li>
    <%
            }
        }
    %>
</ul>
</body>
</html>
