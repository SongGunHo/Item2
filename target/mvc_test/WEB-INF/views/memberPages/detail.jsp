<%--
  Created by IntelliJ IDEA.
  User: SongGeunHo
  Date: 2022-11-27
  Time: 오후 5:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>정보</h2>
    <tr>
        <th>아이디</th>
        <th>비밀번호</th>
        <th>이름</th>
        <th>나이</th>
        <th>전화번호</th>
    </tr>
    <tr>
        <td text="${byId.memberId}"><a href="/member/update-form?id=${byId.id}"></a></td>
        <td text="${byId.memberPassword}"></td>
        <td text="${byId.memberName}"></td>
        <td text="${byId.memberAge}"></td>
        <td text="${byId.memberPhone}"></td>
    </tr>
    <button onclick="deleCh()">삭제</button>
</body>
<script>
    const deleCh =()=>{
        location.href="/member/delete?id=${byId.id}"
    }
</script>
</html>
