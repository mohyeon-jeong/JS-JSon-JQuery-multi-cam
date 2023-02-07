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
	<h3>response</h3>

	<%
	// response : 이동
	// String name = "asdf";
	// response.sendRedirect("default.jsp?name=" + name);
	%>
	
	<h3>pageContext</h3>
	<%
// 	String name = "Seong";
// 	int age = 16;
	
// 	// response.sendRedirect("default.jsp?name=" + name + "&age=" + age);

// 	// packaging
// 	Human human = new Human(name, age);
// 	request.setAttribute("lady", human);
// // 	request.setAttribute("lady", new Human(name,age));
	
// 	// send
// 	pageContext.forward("default.jsp");
	%>
	
	<h3>session</h3>
	
	<%
	String name = "asdf";
	int age = 35;
	
	// packaging
	session.setAttribute("man", new Human(name, age));
	
	// send
	response.sendRedirect("default.jsp"); // no need to ?name= ..
	%>
</body>
</html>
















