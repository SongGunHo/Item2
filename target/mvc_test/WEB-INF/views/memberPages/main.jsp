<%--
  Created by IntelliJ IDEA.
  User: SongGeunHo
  Date: 2022-11-27
  Time: 오후 3:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>main.jsp</h2>
    <a href="/member/save-form">회원가입</a>
    <a href="/member/login-form">로그인</a>
    <a href="${sessionScope.loginMember.memberId='amin'}}">관리자 페이지</a>
    </p>
</body>
</html>
