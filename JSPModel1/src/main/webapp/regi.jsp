<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
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
	<h2>Sign Up</h2>
	<div class="center">
		<form action="regiAf.jsp" method="post">
			<table border="1">
				<tr>
					<td>ID</td>
					<td>
						<input type="text" name="id" id="id" size="20"><br>
						<p id="idcheck" style="font-size: 8px"></p>
						<input type="button" id="idChkBtn" value="Check ID">
					</td>
				</tr>
				<tr>
					<td>PW</td>
					<td>
						<input type="text" name="pwd" id="pwd" size="20">
					</td>
				</tr>
				<tr>
					<td>Name</td>
					<td>
						<input type="text" name="name" size="20">
					</td>
				</tr>
				<tr>
					<td>Email</td>
					<td>
						<input type="email" name="email" size="20">
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="Sign Up">
					</td>
				</tr>
			</table>
		</form>
	</div>
	<script type="text/javascript">
		
		// check blank's area
		// ~~~~
		
		$("#idChkBtn").click(function() {
			$.ajax({
				type: "post",
				url: "idcheck.jsp",
				data: { id:$("#id").val() },
				success: function(msg) {
					if (msg.trim() == "Available ID") {
						$("#idcheck").css("color", "#0000ff");
						$("#idcheck").text("Available ID")
					} else {
						$("#idcheck").css("color", "#ff0000");
						$("#idcheck").text("ID already exists");
						$("#id").val("");
					}
				},
				error: function() {
					alert("error");
				}
			})
		})
	</script>
</body>
</html>





















