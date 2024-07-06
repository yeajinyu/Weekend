<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%int ran = (int)(Math.random() *9+1); %>
안녕하세요.오늘의 행운의 숫자는 <%= ran %> 입니다.
</body>
</html>