<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>테스트 메인</title>
</head>
<body>
	회원가입 페이지(이름/비밀번호)
	<form:form action="member/join" modelAttribute="memberBean" method="post">
		이름 : <form:input path="member_name"/> <br />
		비밀번호 : <form:password path="member_pw"/> <br />
		<button type="submit">제출</button>
	</form:form>
	
	<a href="goods">상품페이지</a> 
	<hr />
	
	
</body>
</html>