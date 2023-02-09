<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script src="http://lab.alexcican.com/set_cookies/cookie.js" type="text/javascript" ></script>
<style type="text/css">
.center {
	margin: auto;
	width: 60%;
	border: 3px solid #550000;
	padding: 10px;
}
</style>
</head>
<body>
	<h2>login page</h2>
	<div class="center">
		<form action="loginAf.jsp" method="post">
			<table border="1">
				<tr>
					<th>ID</th>
					<td>
						<input type="text" id="id" name="id" size="20"><br>
						<input type="checkbox" id="chk_save_id">save ID
					</td>
				</tr>
				<tr>
					<th>PW</th>
					<td>
						<input type="password" name="pwd" size="20">
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="Sign In">
						<a href="regi.jsp">Sign up</a>
					</td>
			</table>
		</form>
	</div>
	<script type="text/javascript">
		let user_id = $.cookie("user_id");
		
		if (user_id != null) {
			$("#id").val(user_id);
			$("#chk_save_id").prop("checked", true);
		}
		
		$("#chk_save_id").click(function() {
			if ($("#chk_save_id").is(":checked") == true) {
				if($("#id").val().trim() == "") {
					alert("please input id");
					$("#chk_save_id").prop("checked", false);
				} else {
					// save cookie
					$.cookie("user_id", $("#id").val().trim(), {expires:7, path:'./'});
				}
			} else {
				$.removeCookie("user_id", {path:'./'});
			}
		})
	</script>
</body>
</html>


























