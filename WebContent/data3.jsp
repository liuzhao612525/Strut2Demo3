<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/data3.action" method="post">
		username:<input type="text" name="user.username" />
		<br/>
		password:<input type="text" name="user.password" />
		<br/>
		address:<input type="text" name="user.address" />
		<br/>
		<input type="submit" value="提交"/>
	</form>
</body>
</html>