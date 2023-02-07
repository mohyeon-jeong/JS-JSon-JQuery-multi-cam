<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
// can be here
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- html 주석 -->
	<%-- JSP 주석 --%>
	<%--
		JSP : Java Server Page
		제어문, collection, access to DB
		
		Servlet = java(html)
		JSP		= html(java) - low readability
	--%>
	<h3>Hello JSP</h3>
	<p>hello world</p>

	<%
	// java code area (wherever)
// 	int number = 0;
	%>

	<%
	for (int i = 0; i < 10; i++) {
	%>
	<p><%=(i + 1)%></p>
	<%
	}
	%>

	<%-- types of java area --%>
	<%-- declaration --%>
	<%!
	// global variables, functions, classes
	int glNumber = 0;
	
	void func() { // must be declaration area( <%! )
		System.out.println("called func()");
	}
	
	int getValue() {
		return 7;
	}
	%>

	<%-- codes --%>
	<%
	// calculate, call functions, create objects
	int number = 0; // local var
	glNumber++;
	number++;
	func();
	%>

	<%-- values --%>
	<%=glNumber%><br>
	<%=number%><br>
	<%-- <%=func()%> - err(void) --%> 
	<%=getValue()%><br>
	<%=getValue() + 1%><br>
	<p><%=glNumber%></p>
	<input type="text" value="<%=glNumber%>">
</body>
</html>

















