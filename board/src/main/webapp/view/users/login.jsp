<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="/board/doLogin">
	<br/>
	<input type="text" name="userId" placeholder = "ID를 입력하세요"/>
	<br/>
	<input type="password" name= "userPassword" placeholder="비밀번호를 입력하세요" /><br/>
	<input type="submit" value="SignIn"/>
</form>
</body>
</html>