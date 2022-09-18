<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap demo</title>
</head>
<body>
	<table class="table table-bordered">
		<thead>
			<tr>
				<th scope="col">번호</th>
				<th scope="col">제목</th>
				<th scope="col">작성자</th>
				<th scope="col">작성일</th>
				<th scope="col">수정일</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="board">
				<tr onclick="location.href = '${pageContext.request.contextPath}/board/get?bno=${board.bno }'">
					<td>${board.bno }</td>
					<td>${board.title }</td>
					<td>${board.writer }</td>
					<td><fmt:formatDate pattern="yyyy-MM-dd"
							value="${board.regdate }" /></td>
					<td><fmt:formatDate pattern="yyyy-MM-dd"
							value="${board.updateDate }" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<!-- Modal -->
	<div class="modal" tabindex="-1">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title">Modal title</h5>
					<button type="button" class="btn-close" data-bs-dismiss="modal"
						aria-label="Close"></button>
				</div>
				<div class="modal-body">
					<p>Modal body text goes here.</p>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-bs-dismiss="modal">Close</button>
					<button type="button" class="btn btn-primary">Save changes</button>
				</div>
			</div>
		</div>
	</div>
	<style>
.modal-backdrop {
	z-index: -1;
}
</style>
	<script type="text/javascript">
		$(document).ready(
				function() {
					var result = '<c:out value="${result}"/>';

					checkModal(result);
		
					history.replaceState({},null,null);
					
					function checkModal(result) {
						console.log(result);
						if (result === '' || history.state) {
							return;
						}

						if (parseInt(result) > 0) {
							$(".modal-body").html(
									"게시글 " + parseInt(result) + " 번이 등록되었습니다.")
						}

						$(".modal").modal("show");
					}

				});

		$(document).off('focusin.modal');
	</script>
</body>
</html>