<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>가입 완료</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
	String id = request.getParameter("USRID");
	String pwd = request.getParameter("passwd");
%>
	<p> 아이디 : <%= id %>
	<p> 패스워드 : <%= pwd %>

</body>
</html>