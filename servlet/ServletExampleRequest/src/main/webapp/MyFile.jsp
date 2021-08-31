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
String value=request.getParameter("t1");
  int a=Integer.parseInt(value);
  if(a==10)
  {
	  out.println(a);
  }
  else
  {
	  out.println("The value will not match");
  }
%>
</body>
</html>