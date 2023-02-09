<%@page import="DAO.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String id = request.getParameter("id");
System.out.println("id : " + id);

MemberDAO dao = MemberDAO.getInstance();
boolean b = dao.getId(id);

if (b) { // id already exists
	out.println("ID is already exists");
} else {
	out.println("Available ID");
}
%>