<%--
  Created by IntelliJ IDEA.
  User: tayfurss
  Date: 31.03.2023
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    // invalidate the session
    session.invalidate();

// redirect to login page
    response.sendRedirect("Login.jsp");
%>
