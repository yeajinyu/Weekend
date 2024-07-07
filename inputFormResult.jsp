<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>인풋 폼 결과 페이지</title>
</head>
<body>
<h2>입력 회원 정보</h2>
아이디 : <%= request.getParameter("id") %><br>
비밀번호 : <%= request.getParameter("password") %><br>
생년월일 : <%= request.getAttribute("birth") %><br> <!-- 객체형태임 -->
취미 : <%= request.getAttribute("hobbyData") %><br> <!-- 객체형태임 -->
성별 : <%= request.getParameter("gender").equals("1") ? "남" : "여" %><br> <!-- 객체형태임 -->
이메일 : <%= request.getParameter("email") %><br>
연락처 : <%= request.getParameter("tel") %><br>
학년 : <%= request.getParameter("grade") %><br>
지역 : <%= request.getAttribute("areaData") %><br>
자기소개 : <pbe><%= request.getParameter("intro") %></pbe><br>
</body>
</html>