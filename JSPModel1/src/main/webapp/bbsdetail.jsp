<%@page import="dto.BbsDto"%>
<%@page import="dao.BbsDao"%>
<%@page import="dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
int seq = Integer.parseInt(request.getParameter("seq"));
MemberDto login = (MemberDto)session.getAttribute("login");
if (login == null) {
	%>
	<script>
	alert('로그인 해 주십시오');
	location.href = "login.jsp";
	</script>
	<%
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
BbsDao dao = BbsDao.getInstance();
BbsDto dto = dao.getBbs(seq);
%>
	<h1>글쓰기</h1>
	<div align="center">
		<table border="1">
			<col width="100"><col width="500">
			<tr>
				<td align="center">작성자</td>
				<td><%=login.getId() %></td>
			</tr>
			<tr>
				<td align="center">제목</td>
				<td><%=dto.getTitle() %></td>
			</tr>
			<tr>
				<td align="center">작성일</td>
				<td><%=dto.getWdate() %></td>
			</tr>
			<tr>
				<td align="center">조회수</td>
				<td><%=dto.getReadcount() %></td>
			</tr>
			<tr>
				<td align="center">정보</td>
				<td><%=dto.getRef() %>-<%=dto.getStep() %>-<%=dto.getDepth() %></td>
			</tr>
			<tr height="300">
				<td align="center">내용</td>
				<td><%=dto.getContent() %></td>
			</tr>
		</table>
		<br>
		<button type="button" onclick="answerBbs(<%=dto.getSeq() %>)">답글</button>
		<button type="button" onclick="location.href='bbslist.jsp'">목록</button>
		<%
		if (dto.getId().equals(login.getId())) {
		%>
			<button type="button" onclick="updateBbs(<%=dto.getSeq()%>)">수정</button>
			<button type="button" onclick="updateBbs(<%=dto.getSeq()%>)">삭제</button>
		<%
		}
		%>
	</div>
	<script type="text/javascript">
		function answerBbs(seq) {
			location.href = "answer.jsp?seq=" + seq;
		}
		
		function updateBbs(seq) {
			
		}
		
		function deleteBbs(seq) {
			
		}
	</script>
</body>
</html>



















