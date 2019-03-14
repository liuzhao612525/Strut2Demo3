<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/map.action" method="post">
		username:<input type="text" name="map['one'].username" />
		<br/>
		password:<input type="text" name="map['one'].password" />
		<br/>
		address:<input type="text" name="map['one'].address" />
		<br/><br/>
		
		username:<input type="text" name="map['two'].username" />
		<br/>
		password:<input type="text" name="map['two'].password" />
		<br/>
		address:<input type="text" name="map['two'].address" />
		<br/>
		<input type="submit" value="提交"/>
	</form>
</body>
</html>