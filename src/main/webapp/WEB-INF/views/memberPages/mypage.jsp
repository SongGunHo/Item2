<%--
  Created by IntelliJ IDEA.
  User: SongGeunHo
  Date: 2022-11-27
  Time: 오후 4:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h2>마이패이지</h2>
  <a href="/detail?id=${sessionScope.loginMember.memberId}}">정보</a>
  <a href="/detail-form?id=${sessionScope.loginMember.memberId}}">수정</a>
</body>
</html>
