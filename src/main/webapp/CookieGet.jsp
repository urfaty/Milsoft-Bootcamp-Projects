<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%
	String company="";
	for(Cookie cookie : request.getCookies()){
		if(cookie.getName().equals("company")){
			company=cookie.getValue();
			break;
		}
	}
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
Çerez alındı <%=company %>
</body>
</html>