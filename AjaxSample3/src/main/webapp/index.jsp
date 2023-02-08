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
	<button type="button">click</button>
	<script type="text/javascript">
		$(function() {
			$("button").click(function() {
				$.ajax({
					url: "./hello",
					type: "get",
// 					data: "id=abc&pw=123",
					data: { id:"abc", pw:"123" },
					success: function(data) {
// 						alert(data.str);
// 						alert(JSON.stringify(data));

// 						let human = data.human;
// 						alert(human.name);
// 						alert(human.age);

// 						let list = data.list;
// 						for (var i = 0; i < list.length; i++) {
// 							alert(list[i].name);
// 							alert(list[i].age);
// 						}
						
						alert(data.map.mylist[1].name);
						alert(data.map.title);
					},
					error: function() {
						alert("error");
					}
				})
			})
		})
	</script>
</body>
</html>