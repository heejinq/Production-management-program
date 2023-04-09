<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제품입력</title>
</head>
<body>
<h1>제품입력 </h1>
<fieldset>
<legend>제품입력</legend>
<form action="/product_register" method="post">
제품코드 <input type="text" name="code" placeholder="예시)A01"> <br>
	제품이름 <input type="text" name="pname" > <br>
	제품원가 <input type="number" name="cost"> <br>
	목표수량 <input type="number" name="pnum"> <br>
	재고수량 <input type="number" name="jnum"> <br>
	출 고 가 <input type="number" name="sale"> <br>
	그룹이름 <select name="gcode">
			<option value="A">컴퓨터</option>
			<option value="B">모바일</option>
			<option value="C">냉장소모품</option>
			</select> 
	<br>
	<br>
	<input type="submit" value="등록하기" style="background-color: lightgray; color: black; border-radius: 10px; padding: 5px 10px;">
	<a href="/index" style="background-color: lightgray; color: black; border-radius: 10px; padding: 5px 10px;">메인화면 </a>
</form>
</fieldset>
</body>
</html>