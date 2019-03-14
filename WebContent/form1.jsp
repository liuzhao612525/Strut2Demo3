<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/form1.action" method="post">
		username:<input type="text" name="username" />
		<br/>
		password:<input type="text" name="password" />		<action name="form1" class="cn.itcast.action.Form1DemoAction"></action>
		
		<br/>
		address:<input type="text" name="address" />
		<br/>
		<input type="submit" value="提交"/>
	</form>
</body>
</html>