<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>��û �Ķ���� �Է� ����</title>
</head>
<body>

<form action="/Input.do" method="get">

//action : ��� �ּҷ� ������<br>
//method : ��� ������� ������<br>

���̵� : <input type="text" name="id"><br>
��й�ȣ : <input type="password" name="password"><br>
<input type="submit" value="get����"><input type="reset" value="���">
</form>

<br><br>

<form action="/Input.do" method="post">
���̵� : <input type="text" name="id"><br>
��й�ȣ : <input type="password" name="password"><br>
<input type="submit" value="post����"><input type="reset" value="���">
</form>

</body>
</html>