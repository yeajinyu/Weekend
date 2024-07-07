<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>인풋 폼 예제</title>
</head>
<body>
<h1>회원 정보 입력</h1>
<!-- 
	action = "보내는 곳"
	method = "요청방식"
	DB에 저장될때 보내는 방식은 무조건 POST방식
	조회할떄는 GET방식
	form 태그를 쓸때는 input type submit을 써야한다
	* 안써도되는데 그럼 내가 원할때 보낼 수 없음
	cols=가로/열 rows=세로/행
	파라미터에는 데이터를 저장할 수 없다. request.getParameter
	-->
<form action="/InputForm.do" method="post">
아이디 : 	<input type="text" name=id><br>
비밀번호 :	<input type="password" name=password><br>
생년월일 :	<input type="date" name=birth><br>
취미 : 	<input type="checkbox" name=hobby value="1">운동
		<input type="checkbox" name=hobby value="2">독서
		<input type="checkbox" name=hobby value="3">요리
		<input type="checkbox" name=hobby value="4">없음<br>
성별 : 	<input type="radio" name=gender value="1" checked>남자
		<input type="radio" name=gender value="2">여자
이메일 : 	<input type="email" name=email><br>
연락처 : 	<input type="tel" name=tel pattern="[0][1][0]-\d{4}-\d{4}"><br>
학년 : 	<input type="number" min=1 max=4 step=1 name=grade><br>
지역 : 	<select name="area">
			<option value="1"> 서울 </option>
			<option value="2"> 경기 </option>
			<option value="3"> 인천 </option>
			<option value="4"> 강원 </option>
		</select><br>
자기소개 : <textarea name="intro" cols="10" rows="10">	자기소개를 입력해주세요.</textarea>
<br>
<br>

<input type="submit" value="저장">
<input type="reset" value="취소">

</form>
</body>
</html>