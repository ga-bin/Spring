<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- nav bar start-->
	<nav class="navbar navbar-expand-lg bg-light">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">Navbar</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNav"
				aria-controls="navbarNav" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="http://localhost:8088/java">Home</a></li>
					<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/board/list">게시글목록</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/board/register">게시글등록</a>
					</li>
					<li class="nav-item"><a class="nav-link disabled">Disabled</a>
					</li>
				</ul>
			</div>
		</div>
	</nav>
	<!-- nav bar end -->