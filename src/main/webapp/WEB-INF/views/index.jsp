<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
	
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>생산관리 시스템</title>
<head>
<body>
<h1>생산관리 시스템 </h1>
<P>  현재시각 : ${serverTime}. </P>
<fieldset>
<legend>생산관리 메인메뉴</legend>
<a href="/product_register" style="color: gray; ;">제품입력</a><br>
<a href="/listsearch" style="color: gray;">제품조회</a><br>
<a href="/first" style="color: gray;">우선생산제품</a><br>
<a href="earn" style="color: gray;">이익순위</a><br>
<a href="/group" style="color: gray;">그룹별재고수량</a><br>
</fieldset>

</body>
</html>
