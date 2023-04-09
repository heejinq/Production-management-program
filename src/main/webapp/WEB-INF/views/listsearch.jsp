<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>생산관리 조회</title>
</head>
<body>
<h1>생산관리 조회</h1> <br>

 <fieldset>
 <legend>생산관리 조회</legend>
 <form action="/listsearch2" method="get">
검색할 제품코드를 입력하세요 <input type="text" name="code" placeholder="예시)A01"><input type="submit" value="검색하기" style="background-color: lightgray; color: black; border-radius: 10px; padding: 5px 10px;"><br>
	<br><hr>
	<table>
	<thead>
	<tr>
	<th>제품코드</th>
	<th>제품이름</th>
	<th>제품원가</th>
	<th>목표수량</th>
	<th>재고수량</th>
	<th>출고가</th>
	<th>그룹명</th>
	</tr>
	<c:forEach items="${listsearch}" var="product">
	<tr>
	<td><a href='/search?code=<c:out value="${product.code}"/>'><c:out value="${product.code}"/></a></td>
	<td><c:out value="${product.pname}"/></td>
	<td><c:out value="${product.cost}"/></td>
	<td><c:out value="${product.pnum}"/></td>
	<td><c:out value="${product.jnum}"/></td>
	<td><c:out value="${product.sale}"/></td>
	<td><c:out value="${product.gcode}"/></td>
	</tr></c:forEach></thead></table>
	<br>
	<br>
<!-- 	<a href="/index" style="background-color: lightgray; color: black; border-radius: 10px; padding: 5px 10px;">메인화면 </a> -->
	<a href="/index" style="background-color: lightgray; color: black; border-radius: 10px; padding: 5px 10px;">메인화면 </a>
</form>
</fieldset>
</body>
</html>