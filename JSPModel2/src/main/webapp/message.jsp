<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String message = (String) request.getAttribute("message");
if (message != null && !message.equals("")) {
	if (message.equals("MEMBER_YES")) {
%>
<script type="text/javascript">
	alert("가입 성공");
	location.href = "login.jsp";
</script>
<%
} else {
%>
<script type="text/javascript">
	alert("가입 실패. 다시 시도");
	location.href = "member?param=regi";
</script>
<%
}
}

String bbswrite = (String) request.getAttribute("bbswrite");
if (bbswrite != null && !bbswrite.equals("")) {
if (bbswrite.equals("BBS_ADD_OK")) {
%>
<script type="text/javascript">
	alert("작성 완료");
	location.href = "bbs?param=bbslist";
</script>
<%
} else {
%>
<script type="text/javascript">
	alert("작성 실패");
	location.href = "bbs?param=bbswrite";
</script>
<%
}
}
%>