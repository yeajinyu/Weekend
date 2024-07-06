<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>요청 파라미터 입력 예제</title>
</head>
<body>

<form action="/Input.do" method="get">

//action : 어느 주소로 보낼지<br>
//method : 어느 방식으로 보낼지<br>

아이디 : <input type="text" name="id"><br>
비밀번호 : <input type="password" name="password"><br>
<input type="submit" value="get저장"><input type="reset" value="취소">
</form>

<br><br>

<form action="/Input.do" method="post">
아이디 : <input type="text" name="id"><br>
비밀번호 : <input type="password" name="password"><br>
<input type="submit" value="post저장"><input type="reset" value="취소">
</form>

</body>
</html>