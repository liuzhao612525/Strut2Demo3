<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/list.action" method="post">
		username:<input type="text" name="list[0].username" />
		<br/>
		password:<input type="text" name="list[0]..password" />
		<br/>
		address:<input type="text" name="list[0]..address" />
		<br/><br/>
		
		username:<input type="text" name="list[1].username" />
		<br/>
		password:<input type="text" name="list[1].password" />
		<br/>
		address:<input type="text" name="list[1].address" />
		<br/>
		<input type="submit" value="提交"/>
	</form>
</body>
</html>