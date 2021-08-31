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
  String pass=request.getParameter("t2");
  session.setAttribute("userName",user);
  if(user.equals("admin"))
  {
	  response.sendRedirect("./LoginSucess");
  }
  else
  {
	  response.sendRedirect("./LoginDetails.jsp");
  }
%>
<a href="./LoginDetails.jsp">Redirect</a>
</body>
</html>