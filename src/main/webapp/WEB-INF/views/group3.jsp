<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>﻿﻿그룹별 재고 수량</title>
</head>
<body>
<h1>﻿﻿그룹별 재고 수량</h1> <br>

 <fieldset>
 <legend>﻿﻿그룹별 재고 수량 조회</legend>
	<table>
	<thead>
	<tr>
	<th>제품코드</th>
	<th>제품이름</th>
	<th>재고수량</th>
	<th>그룹명</th>
	</tr>
	<c:forEach items="${group2}" var="product">
	<tr>
	<td><a href='/search?code=<c:out value="${product.code}"/>'><c:out value="${product.code}"/></a></td>
	<td><c:out value="${product.pname}"/></td>
	<td><c:out value="${product.jnum}"/></td>
	<td><c:out value="${product.gcode}"/></td>
	</tr></c:forEach></thead></table>
	<br>
	<br>
	<a href="/index" style="background-color: lightgray; color: black; border-radius: 10px; padding: 5px 10px;">메인화면 </a>
</fieldset>
</body>
</html>