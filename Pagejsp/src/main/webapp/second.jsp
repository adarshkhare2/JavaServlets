<%@page import="java.sql.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
  %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Insert title here</title>
</head>

<body>
<h1>Today is: <%= new java.util.Date() %></h1>  
<br>
<%out.print("This is second jap page"); %>
<a href="third.jsp">Anime</a>  
<a href="error.jsp">Error</a> 


</body>
</html>