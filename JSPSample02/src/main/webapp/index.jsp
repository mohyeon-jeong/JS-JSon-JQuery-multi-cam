<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--
	내장 객체 : 동적 할당 없이 바로 사용할 수 있는 객체
	
	out
	request
	response
	session
	pageContext
	application
		:
	 --%>
	<h3>out</h3>

	<%
	String title = "hello jsp";
	out.println("<p>" + title + "</p>");
	%>

	<p><%=title%></p>

	<h3>request</h3>

	<%
	// request(요청) : to get parameter value, to access session, to send object, for encoding

	// encoding
	request.setCharacterEncoding("utf-8");

	// get parameter value
	String name = request.getParameter("name");
	%>

	<p><%=name%></p>

	<%
	String[] hobby = request.getParameterValues("hobby");

	for (int i = 0; i < hobby.length; i++) {
	%>
	
	<p><%=hobby[i]%></p>
	
	<%
	}
	%>
	
	<%
	// session
	request.getSession().setAttribute("visited", "1");
	
	Object obj = request.getSession().getAttribute("visited");
	String str = (String) obj;
	
	out.println("<h5>" + str + "</h5>");
	%>
</body>
</html>