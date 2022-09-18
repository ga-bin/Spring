<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<section class="vh-100" style="background-color: gray;">
	<div class="container h-100">
		<div
			class="row d-flex justify-content-center align-items-center h-100">
			<div class="col-xl-9">

				<h1 class="text-white mb-4">Board Register</h1>

				<div class="card" style="border-radius: 15px;">
					<div class="card-body">
						<form role="form" action="${pageContext.request.contextPath}/board/register" method="post">
							<div class="row align-items-center pt-4 pb-3">
								<div class="col-md-3 ps-5">

									<h6 class="mb-0">Title</h6>

								</div>
								<div class="col-md-9 pe-5">

									<input type="text" name="title" class="form-control form-control-lg" />

								</div>
							</div>

							<hr class="mx-n3">

							<div class="row align-items-center py-3">
								<div class="col-md-3 ps-5">

									<h6 class="mb-0">Text area</h6>

								</div>
								<div class="col-md-9 pe-5">

									<textarea class="form-control" name="content" rows="3"
										placeholder="Message sent to the employer"></textarea>

								</div>
							</div>

							<hr class="mx-n3">

							<div class="row align-items-center py-3">
								<div class="col-md-3 ps-5">

									<h6 class="mb-0">writer</h6>

								</div>
								<div class="col-md-9 pe-5">

									<input type="text" name="writer" class="form-control form-control-lg" />

								</div>
							</div>

							<hr class="mx-n3">

							<div class="px-5 py-4">
								<button type="submit" class="btn btn-secondary">Submit
									button</button>
								<button type="button" class="btn btn-secondary">Reset
									button</button>
							</div>
						</form>
					</div>
				</div>

			</div>
		</div>
	</div>
</section>