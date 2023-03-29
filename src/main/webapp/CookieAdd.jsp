<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%
    Cookie cookie = new Cookie("company","Godoro");
    response.addCookie(cookie);
    //setMaxAGE BENİ HATIRLARLA yapılacağı zaman kullanılır
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
Çerez atıldı : <%=cookie.getValue() %>
</body>
</html>