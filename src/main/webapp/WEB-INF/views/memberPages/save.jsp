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
<div class="container col-3">
    <h2>회원 가입</h2>
    <form action="save" method="post">
        <input class="form-control" type="text" id="memberId" placeholder="아이디">
        <input class="form-control" type="text" id="memberPassword" placeholer="비밀번호">
        <input class="form=control" type="text" id="memberName" placeholder="이름">
        <input class=form-control type="text" id="memberAge" placeholder="나이">
        <input class="form-control" type="text" id="memberPhone" placeholder="전화번호">
        <input class="form-control" type="submit" value="회원 가입">
    </form>
</div>
</body>
</html>
