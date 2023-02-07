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
	<p id="demo"></p>
	<button type="button">button</button>
	<script type="text/javascript">
		$("button").click(function() {
			$.ajax({
				// send
				url: "data.json", // where to go
				type: "get",	  // form(get / post)
				datatype: "json", // type
				
				// after send
				success: function(data) {
// 					alert("success");
// 					alert(data);
// 					alert(JSON.stringify(data));

					for (var i = 0; i < data.length; i++) {
						$("#demo").append(i + 1 + " ");
						$("#demo").append(data[i].name + " ");
						$("#demo").append(data[i].age + " ");
						$("#demo").append(data[i].address + " ");
						$("#demo").append(data[i].phone + "<br>");
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