<%--
  Created by IntelliJ IDEA.
  User: tayfurss
  Date: 31.03.2023
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
<%
    // check if user is logged in
    String username = (String) session.getAttribute("username");
    if (username == null) {
        // user is not logged in, redirect to login page
        response.sendRedirect("Login.jsp");
    } else {
        // user is logged in, display welcome message
        out.println("<h1>Hoşgeldin " + username + "</h1>");
        out.println("<a href='Logout.jsp'>Çık</a>");

    }
%>
</body>
</html>


