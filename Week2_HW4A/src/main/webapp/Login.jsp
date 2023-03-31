<%--
  Created by IntelliJ IDEA.
  User: tayfurss
  Date: 31.03.2023
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<h1>Login Page</h1>
<form method="post" action="Login.jsp">
    <label>Username:</label>
    <input type="text" name="username"><br>
    <label>Password:</label>
    <input type="password" name="password"><br>
    <input type="submit" value="Login">
</form>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    if (username != null && password != null) {
        if (username.equals("godoro") && password.equals("java")) {
            // kullanıcı doğrulandı, session oluşturuldu
            session.setAttribute("username", username);
            response.sendRedirect("Home.jsp");
        } else {
            // kullanıcı doğrulanamadı, hata mesajı gösterildi
            out.println("<p style='color:red;'>Hatalı kullanıcı adı veya şifre!</p>");
        }
    }
%>
</body>
</html>
