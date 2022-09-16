<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>게시글 목록</h3>
<table>
	<thead>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>저자</th>
			<th>내용</th>
			<th>이미지</th>
			<th>작성일</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${boardList }" var="board">
			<tr>
				<td>${board.boardNo }</td>
				<td>${board.boardTitle }</td>
				<td>${board.boardWriter }</td>
				<td>${board.boardContent }</td>
				<td><img src='<c:url value="/resources/images/${board.boardImage }"></c:url>' width="50px"></td>
				<td><fmt:formatDate pattern="yyyy/MM/dd" value="${board.boardDate }"/></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>