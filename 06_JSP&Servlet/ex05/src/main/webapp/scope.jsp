
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

        <h1>scope 데이터 보기</h1>
pageScope의 속성 값은 : ${pageScope.scopeName}<br>
requestScope의 속성 값은 : ${requestScope.scopeName}<br>
sessionScope 속성 값은 : ${sessionScope.scopeName}<br>
applicationScope 속성 값은 : ${applicationScope.scopeName}<br>

scopeName 자동 찾기 : ${scopeName} <br />
member : ${member.name}(${member.userid})<br />

</body>
</html>
