<%@page import="JSPSample02.Human"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>default.jsp</h1>
	<%
	// 	String name = request.getParameter("name");
	%>
	<%-- <p>name : <%=name%></p> --%>

	<%
	// 	Human human = (Human) request.getAttribute("lady");
	%>
	<%-- <p>name : <%=human.getName()%></p> --%>
	<%-- <p>age : <%=human.getAge()%></p> --%>

	<%
	Human human = (Human) session.getAttribute("man");
	%>
	
	<p>name : <%=human.getName() %></p>
	<p>age : <%=human.getAge() %></p>
</body>
</html>