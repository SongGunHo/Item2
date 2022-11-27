<%--
  Created by IntelliJ IDEA.
  User: SongGeunHo
  Date: 2022-11-27
  Time: 오후 7:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h2>list</h2>
  <tr>
    <th>등록업체명</th>
    <th>대표명</th>
    <th>대표전화번호</th>
  </tr>
  <tr>
    <c:forEach items="${all}" var="all">
      <td>${all.id}</td>
      <td><a href="/registrar/detail?id=${dall.id}}"></a>${all. registrarCompany}</td>
      <td>${all.registrarName}</td>
      <td>${all.registrarPone}</td>
    </c:forEach>
    <th></th>
  </tr>
</body>
</html>
