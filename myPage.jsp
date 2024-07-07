<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>마이페이지</title>
</head>
<body>
	<% if (session.getAttribute("id") == null) {
			response.sendRedirect("/login.jsp");
	}else{ %>
			안녕하세요 <%= session.getAttribute("id") %>님. 환영합니다.<br>
			로그아웃 하시려면 아래 버튼을 눌러주세요<br>
			<a href="/login.do"><button>로그아웃</button></a>
	
	<% } %>
	
</body>
</html>