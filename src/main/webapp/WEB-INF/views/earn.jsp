<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>﻿이익순위 조회</title>
</head>
<body>
<h1>﻿이익순위 조회</h1> <br>

 <fieldset>
 <legend>﻿이익순위 조회</legend>
	<br>
	<table>
	<thead>
	<tr>
	<th>순위</th>
	<th>제품코드</th>
	<th>제품이름</th>
	<th>순이익</th>
	</tr>
	<c:forEach items="${earn}" var="product" varStatus="status">
	<tr>
	<td>${status.count}</td>
	<td><a href='/search?code=<c:out value="${product.code}"/>'><c:out value="${product.code}"/></a></td>
	<td><c:out value="${product.pname}"/></td>
	<td><c:out value="${product.profit}"/></td>
	</tr></c:forEach></thead></table>
	<br>
	<br>
	<a href="/index" style="background-color: lightgray; color: black; border-radius: 10px; padding: 5px 10px;">메인화면 </a>
</fieldset>
</body>
</html>