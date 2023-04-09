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
	제품코드 <input  name="code" value="<c:out value="${product.code}"/>" readonly="readonly" style="background-color: lightgray;"> <br>
	제품이름 <input name="pname" value="<c:out value="${product.pname}"/>" readonly="readonly" style="background-color: lightgray;"><br>
	제품원가 <input  name="cost" value="<c:out value="${product.cost}"/>" readonly="readonly" style="background-color: lightgray;"><br>
	목표수량 <input  name="pnum" value="<c:out value="${product.pnum}"/>" readonly="readonly" style="background-color: lightgray;"><br>
	재고수량 <input name="jnum" value="<c:out value="${product.jnum}"/>" readonly="readonly" style="background-color: lightgray;"><br>
	출 고 가 <input  name="sale" value="<c:out value="${product.sale}"/>" readonly="readonly" style="background-color: lightgray;"><br>
	그룹이름 <input name="gcode" value="<c:out value="${product.gcode}"/>" readonly="readonly" style="background-color: lightgray;"><br>
	<br>
	<br>
	<a href="/modify?code=<c:out value="${product.code}"/>" style="background-color: lightgray; color: black; border-radius: 10px; padding: 5px 10px;">수정하기 </a>
	<a href="/index" style="background-color: lightgray; color: black; border-radius: 10px; padding: 5px 10px;">메인화면 </a>
</fieldset>
</body>
</html>