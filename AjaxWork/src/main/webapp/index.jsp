<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
</head>
<body>
	<p id="name"></p>
	<p id="age"></p>
	<p id="birth"></p>
	<button type="button">button</button>
	<script type="text/javascript">
		$("button").click(function() {
			$.ajax({
				URL: "data.jsp",
				type: "get",
				datatype: "jsp",
				
				success: function(data) {
					alert(JSON.stringify(data));
				}
			})
		})
	</script>
	</body>
</html>