<%@page import="dto.MemberDTO"%>
<%@page import="DAO.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
request.setCharacterEncoding("utf-8");

String id = request.getParameter("id");
String pwd = request.getParameter("pwd");
String name = request.getParameter("name");
String email = request.getParameter("email");

MemberDAO dao = MemberDAO.getInstance();
MemberDTO dto = new MemberDTO(id, pwd, name, email, 0);

boolean isS = dao.addMember(dto);
if (isS) {
%>
<script type="text/javascript">
	alert("Sign Up Success");
	location.href = "login.jsp";
</script>
<%
} else {
%>
<script type="text/javascript">
	alert("Sign Up Failed");
	location.href = "regi.jsp";
</script>
<%	
}
%>

