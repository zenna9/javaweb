<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>hello</title>
</head>
<body>
Hello jsp로 구성된 페이지
<%
	String name = request.getParameter("name");
	if (name ==null){
		name = "익명";
		
	}
	%>
	네임으로 받아온 파라미터 : <%=name %>
</body>
</html>