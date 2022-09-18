<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h6>상품등록</h6>
	<form action="insert" method="post" id="insertForm" name="insertForm">
		<table>
			<tr>
				<td>상품id</td>
				<td><input type="text" value="${productId }" name="productId" readonly="readonly"></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="productName"></td>
			</tr>
			<tr>
				<td>단가</td>
				<td><input type="text" name="productPrice"></td>
			</tr>
			<tr>
				<td>상품정보</td>
				<td><textarea name="productInfo"></textarea></td>
			</tr>
			<tr>
				<td>등록일자</td>
				<td><input type="text" id="currentDate" name="productDate" value="${productDate }" readonly="readonly"></td>
			</tr>
			<tr>
				<td>공급업체</td>
				<td><input type="text" name="company"></td>
			</tr>
			<tr>
				<td>담당자</td>
				<td><input type="text" name="managerId"></td>
			</tr>
		</table>
		<button type="button" id="btnSubmit" >등록하기</button>
	</form>
	<script>
		
		let productName = document.querySelector("input[name='productName']");	
		let btnSubmit = document.querySelector("#btnSubmit");
		btnSubmit.addEventListener("click", register);
		
		function register(event) {
			if (productName.value == '') {
				alert("상품명이 입력되지 않았습니다.");
				return false;
			}
			
			alert("“상품등록이 완료 되었습니다.");
			insertForm.submit();
			
		}
		</script>
</body>
</html>