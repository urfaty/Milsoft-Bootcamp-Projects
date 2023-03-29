<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>

<%
	int sum=0;
	int left=0;
	int right=0;
	if(request.getParameter("add")!=null){
		left = Integer.parseInt(request.getParameter("left"));
		right = Integer.parseInt(request.getParameter("right"));
		sum = left+right;
	}

%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
<form>
	sol : <input type ="text" name="left" value="<%=left%>"><br/>
	sağ : <input type ="text" name="right" value="<%=right%>"><br/>
	<input type="submit" value="Topla" name="add">
</form>
toplam  : <%=sum %>
</body>
</html>
<!-- session
cookie

-->