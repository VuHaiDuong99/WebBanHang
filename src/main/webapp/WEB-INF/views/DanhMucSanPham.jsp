<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>San Pham</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href='<c : url value ="/resources/css/style_dangki.css"/>' />

</head>
<body>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#" style="color: red">Hai Duong</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Home</a></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Danh Muc San Pham <span
						class="caret"></span></a>
					<ul class="dropdown-menu">
						<c:forEach var ="listDanhMuc" items ="${listDanhMuc}">
						
						<li><a href="${pageContext.request.contextPath}/SanPham/${listDanhMuc.getMadanhmuc()}">${listDanhMuc.getTendanhmuc() }</a></li>
						</c:forEach>
					</ul></li>

				<li><a href="#">Link</a></li>
				<li><a>Sale</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="DangKi.html"><span
						class="glyphicon glyphicon-user"></span> Sign Up</a></li>
				<li><a href="DangNhap.html"><span
						class="glyphicon glyphicon-log-in"></span> Login</a></li>
			</ul>
		</div>
	</nav>
	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-2">
				<p>Danh Muc San Pham</p>
				<br>
				<c:forEach var="listDanhMuc" items="${listDanhMuc}">
					<ul>
						<a><li>${listDanhMuc.getTendanhmuc() }</li></a>

					</ul>
				</c:forEach>
			</div>

			<div class="col-sm-9">
				<div class="container-fluid bg-3 text-center">
					<div class="row">
						<c:forEach var="sanpham" items="${sanphamDanhMuc}">
							<a>
								<div class="col-sm-3">

									<div class="sanpham">

										<p>${sanpham.getTensanpham() }</p>

										<img
											src='<c:url value="/resources/images/${sanpham .getHinhsanpham()}"/>'
											class="img-thumbnail" alt="Cinque Terre" width="304"
											height="236">
										<p>Gia Ban : ${sanpham.getGiatien() }</p>
									</div>


								</div>
							</a>
						</c:forEach>
					</div>
				</div>
			</div>


		</div>


	</div>
</body>
</html>