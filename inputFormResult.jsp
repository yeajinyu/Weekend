<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>��ǲ �� ��� ������</title>
</head>
<body>
<h2>�Է� ȸ�� ����</h2>
���̵� : <%= request.getParameter("id") %><br>
��й�ȣ : <%= request.getParameter("password") %><br>
������� : <%= request.getAttribute("birth") %><br> <!-- ��ü������ -->
��� : <%= request.getAttribute("hobbyData") %><br> <!-- ��ü������ -->
���� : <%= request.getParameter("gender").equals("1") ? "��" : "��" %><br> <!-- ��ü������ -->
�̸��� : <%= request.getParameter("email") %><br>
����ó : <%= request.getParameter("tel") %><br>
�г� : <%= request.getParameter("grade") %><br>
���� : <%= request.getAttribute("areaData") %><br>
�ڱ�Ұ� : <pbe><%= request.getParameter("intro") %></pbe><br>
</body>
</html>