<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<nav class="sb-sidenav accordion sb-sidenav-light" id="sidenavAccordion">
	<div class="sb-sidenav-menu">
		<div class="nav">
			<div class="sb-sidenav-menu-heading">Web</div>
			<a class="nav-link"
				href="${pageContext.request.contextPath}/board/list">
				<div class="sb-nav-link-icon">
					<i class="fas fa-tachometer-alt"></i>
				</div> 게시글목록
			</a> 
			<a class="nav-link"
				href="${pageContext.request.contextPath}/board/list">
				<div class="sb-nav-link-icon">
					<i class="fas fa-tachometer-alt"></i>
				</div> 게시글 수정/조회
			</a> 
			<a class="nav-link" href="${pageContext.request.contextPath}/empList">
				<div class="sb-nav-link-icon">
					<i class="fas fa-tachometer-alt"></i>
				</div> 게시글 인기 조회
			</a> <a class="nav-link"
				href="${pageContext.request.contextPath}/rentList">
				<div class="sb-nav-link-icon">
					<i class="fas fa-tachometer-alt"></i>
				</div> 홈으로
			</a>
		</div>
	</div>
</nav>