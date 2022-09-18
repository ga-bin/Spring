<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h6>상품 조회/수정</h6>
	<table>
		<thead>
			<tr>
				<th>상품ID</th>
				<th>이름</th>
				<th>단가</th>
				<th>담당자</th>
				<th>등록일자</th>
				<th>공급업체</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list }" var="product">
				<tr>
					<td>${product.productId }</td>
					<td>${product.productName }</td>
					<td>${product.productPrice }</td>
					<td>
					<c:choose>
						<c:when test="${product.managerId eq 'E201'}">김사원</c:when>
						<c:when test="${product.managerId eq 'E202'}">이대리</c:when>
						<c:otherwise>${product.managerId }</c:otherwise>
					</c:choose>
					</td>
					<td><fmt:formatDate pattern="yyyy/MM/dd"
							value="${product.productDate }" /></td>
					<td>${product.company }</td>
				</tr>

			</c:forEach>

		</tbody>
	</table>
</body>
</html>