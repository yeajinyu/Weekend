<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>����������</title>
</head>
<body>
	<% if (session.getAttribute("id") == null) {
			response.sendRedirect("/login.jsp");
	}else{ %>
			�ȳ��ϼ��� <%= session.getAttribute("id") %>��. ȯ���մϴ�.<br>
			�α׾ƿ� �Ͻ÷��� �Ʒ� ��ư�� �����ּ���<br>
			<a href="/login.do"><button>�α׾ƿ�</button></a>
	
	<% } %>
	
</body>
</html>