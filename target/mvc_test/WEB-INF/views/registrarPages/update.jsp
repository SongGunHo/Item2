<%--
  Created by IntelliJ IDEA.
  User: SongGeunHo
  Date: 2022-11-27
  Time: 오후 7:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h2>수정</h2>
  <form action="/registrar/update" method="post">
    <input type="text" id="id" value="${byId.id}" hidden>
    <input type="text" id="registrarCompany" placeholder="등록업체명">
    <input type="text" id="registrarName" placeholder="대표명">
    <input type="text" id="registrarPhone" placeholder="대표전화">
    <input type="submit" value="수정">
  </form>
</body>
</html>
