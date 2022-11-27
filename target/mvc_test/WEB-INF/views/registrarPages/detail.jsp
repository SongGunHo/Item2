<%--
  Created by IntelliJ IDEA.
  User: SongGeunHo
  Date: 2022-11-27
  Time: 오후 7:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>detail</h2>
    <tebel>
        <tr>
        <tr>등록업체명</tr>
        <tr>대표명</tr>
        <tr>대표전화</tr>
        </tr>
        <tr>
            <td>${byId.registrarCompany}</td>
            <td><a href="/registrar/update-form?id${byId.id}"></a>${byId.registrarName}</td>
            <td>${byId.registrarPhone}</td>
        </tr>
        <button onclick="dete()">삭제</button>
    </tebel>

</body>
<script>
    const dete =()=>{
        location.href="/registrar/delete?id=${byId.id}"
    }
</script>
</html>
