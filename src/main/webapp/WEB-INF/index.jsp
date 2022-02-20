<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>servlet</title>
</head>
<body>
	<h1>${result} 단</h1>
	
	<%
	int number = (int)request.getAttribute("result");
	
	for( int i = 1; i < 10; i++ ){ %>
		
		<p><%=number%> * <%=i%> = <%=number * i%></p>
		
	<% } %>
	
</body>
</html>