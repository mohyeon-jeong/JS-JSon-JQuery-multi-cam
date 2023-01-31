<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
String name = request.getParameter("name");
int age = Integer.parseInt(request.getParameter("age"));
System.out.println("name : " + name);
System.out.println("age : " + age);
%>