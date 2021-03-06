<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>1. 조건문 (c:choose, c:when, c:otherwise)</h1>
	<c:set var="weight" value="64" />


	<c:choose>
		<c:when test="${weight < 60}">
			치킨 먹자!!!<br>
		</c:when>
		<c:when test="${weight < 70}">
			<!-- 60 ~ 69 -->
			샐러드 먹자!!!<br>
		</c:when>
		<c:otherwise>
			<!--70 -->
			굶자<br>
		</c:otherwise>
	</c:choose>

	<h1>2. 반복문(c:forEach)</h1>
	<c:forEach begin="0" end="5" step="1" var="value1">
		${value1}<br>
	</c:forEach>
	<br>

	<!--16  ~ 20 => 5번 -->

	<c:forEach begin="16" end="20" step="1" var="value2" varStatus="status">
		var: ${value2} current: ${status.current} first: ${status.first}
		last: ${status.last} count : ${status.count} index: ${status.index}
		<br>
	</c:forEach>

	<!-- 서버에서 가져온 List<String>  -->
	<c:forEach var="fruit" items="${fruits}" varStatus="status">
		${fruit} ::::: ${status.count} :: ${status.index}
	</c:forEach>

	<!-- 서버에서 가져온 List<Map>  -->
	<c:forEach var="user" items="${users}" varStatus="status">
		<h4>${status.count}번째 사람정보</h4>
		이름: ${user.name}<br>
		나이: ${user.age}<br>
		취미: ${user.hobby}<br>
	</c:forEach>

	<!-- 테이블 구성 -->
	<table border="1">
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>나이</th>
				<th>취미</th>
			</tr>
		</thead>
		
		<c:forEach var="user" items="${users}" varStatus="status">
			<tbody>
				<tr>
					<td>${status.count}</td>
					<td>${user.name}</td>
					<td>${user.age}</td>
					<td>${user.hobby}</td>
				</tr>
			</tbody>
		</c:forEach>
	</table>
</body>
</html>