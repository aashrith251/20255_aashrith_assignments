<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String user=request.getParameter("t1");
out.println(user);
%>
UserName is ${param.t1}
PassWord is ${param.t2}
</body>
</html>