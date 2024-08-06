<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 페이지</title>
</head>
<body>
	<form:form action="goods/sell" modelAttribute="sellBean" method="get">
		상품이름 : <form:input path="goods_name" /> <br />
		상품가격 : <form:input path="goods_price" /> <br />
		판매상점 : <form:input path="goods_store" /> <br />
		<button type="submit">상품등록</button>
		
	</form:form>
	
</body>
</html>