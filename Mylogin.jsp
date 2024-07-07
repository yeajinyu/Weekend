<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>로그인</title>
</head>
<!-- 로그인 기능 구현
	로그인 서블릿에서 기본 아이디, 비밀번호 비교 후
	로그인성공 > 마이페이지 이동(안녕하세요 id님 환영합니다 메시지 출력)
	로그인실패 > 다시 로그인 페이지(로그인에 실패하였습니다 출력)
 -->
 <body>
<h2>로그인</h2>
<form action="/Mylogin.do" method="post">
아이디 : <input type="text" name="id"><br>
비밀번호 : <input type="password" name="password"><br>
<input type="submit" value="로그인"><br>
</form>

</body>
</html>