<%--
  Created by IntelliJ IDEA.
  User: SongGeunHo
  Date: 2022-11-27
  Time: 오후 3:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>update.jsp</h2>
    <form action="update" method="post">
        <input type="text" id="id" value="${byId.id}"hidden>
        <input type="text" id="memberId" placeholder="아이디">
        <input type="Password" id="memberPassword" placeholder="비밀번호">
        <input type="Password" id="memberName" placeholder="이름" readonly>
        <input type="Password" id="memberAge" placeholder="나이"readonly>
        <input type="Password" id="memberPhone" placeholder="전화번호">
        <input type="submit" value="수정">
    </form>
</body>
</html>
