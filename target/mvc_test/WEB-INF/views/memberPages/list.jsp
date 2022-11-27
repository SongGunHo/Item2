<%--
  Created by IntelliJ IDEA.
  User: SongGeunHo
  Date: 2022-11-27
  Time: 오후 7:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h2>회원목록</h2>
  <table>
    <tr>
      <th>아이디</th>
      <th>비밀번호</th>
      <th>비밀번호</th>
      <th>이름</th>
      <th>나이</th>
      <th>전화번호</th>
    </tr>
    <tr>
      <c:forEach items="${all}" var="all">
        <th><a href="/member/detail?=${all.id}"></a>${all.memberId}</th>
        <th>${all.memberPassword}</th>
        <th>${all.memberName}</th>
        <th>${all.memberAge}</th>
        <th>${all.memberPhone}</th>
      </c:forEach>
    </tr>
  </table>
</body>
</html>
