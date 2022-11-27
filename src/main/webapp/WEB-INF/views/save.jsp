<%--
  Created by IntelliJ IDEA.
  User: SongGeunHo
  Date: 2022-11-26
  Time: 오후 8:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>회원 가입</h2>
    <form action="save" method="post">
        <input type="text" id="memberId" placeholder="아이디">
        <input type="text" id="memberPassword" placeholder="비밀번호">
        <input type="text" id="memberPhone" placeholder="전화번호">
        <input type="submit" value="회원 가입">
    </form>
</body>
</html>
