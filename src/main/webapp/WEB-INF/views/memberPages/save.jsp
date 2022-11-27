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
        <button class="btn btn-outline-primary d-grid mx-auto" type="button" onclick="aa()">회원가입</button>
    </form>
</div>
</body>
<script>
    const aa =()=>{
    const memberId = document.getElementById("memberId").value;
    const idCheck = document.getElementById("idCheck");
    $.ajax({
        type:"post",
        url:"/id-Check",
        data:{"memberId":memberId},
        dataType:"text",
        success: function (result){
        if(result == 'ok'){
            alert("성공");
            saveForm.submit();
        }else {
            alert("실패");
        }
        },
        error: function (){
            alert("아이디가 있습니다")
        }
    })
    }
</script>
</html>
