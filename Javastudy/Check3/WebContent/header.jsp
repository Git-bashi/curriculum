<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import= "java.util.Date" %>
<%@ page import= "java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/Check3/css/style.css" type = "text/css">
<title>Insert title here</title>
</head>
<body>
	<div class = "header">
		<div class = "label">login</div>
		<div class = "Hjsp">
			<%
				Date d = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
				out.println(sdf.format(d));
				%>
		</div>
	</div>
</body>
</html>