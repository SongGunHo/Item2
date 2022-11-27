<%--
  Created by IntelliJ IDEA.
  User: SongGeunHo
  Date: 2022-11-27
  Time: 오후 6:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h2>등록 업체명</h2>
  <form action="/registar/save" method="post">
    <input type="text" id=" registrarCompany" placeholder="등록업체명">
    <input type="text" id=" registrarName" placeholder="대표명">
    <input type="text" id=" registrarPhone" placeholder="대표 전화번호">
      <input type="submit" value="등록">
  </form>
</body>
</html>
