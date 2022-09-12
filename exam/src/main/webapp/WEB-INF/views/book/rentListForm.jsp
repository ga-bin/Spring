<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>도서번호</th>
			<th>도서이름</th>
			<th>도서가격</th>
			<th>대출현황</th>
		</tr>
		<c:forEach var="list" items="${list}">
			<tr>
				<td>${list.bookNo }</td>
				<td>${list.bookName }</td>
				<td>${list.rentPrice }</td>
				<td>${list.rentCnt }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>