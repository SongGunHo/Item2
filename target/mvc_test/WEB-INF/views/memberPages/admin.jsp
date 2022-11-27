<%--
  Created by IntelliJ IDEA.
  User: SongGeunHo
  Date: 2022-11-27
  Time: 오후 5:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h2>관리자 페이지</h2>
  <a href="/memberPages/list?id=${sessionScope.loginMember.memberId='amin'}}">회원목록</a>
  <a href="/registrar/save-form?id=${sessionScope.loginMember.memberId='amin'}}">등록업체</a>

</body>
</html>
