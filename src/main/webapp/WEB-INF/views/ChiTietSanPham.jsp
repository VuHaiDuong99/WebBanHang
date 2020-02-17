<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>ChiTietSanPham</title>
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
			<div class="col-sm-3">
				<p>Danh Muc San Pham</p>
				<br>
				<c:forEach var="listDanhMuc" items="${listDanhMuc}">
					<ul>
						<a href = "${pageContext.request.contextPath}/SanPham/${listDanhMuc.getMadanhmuc()}"><li>${listDanhMuc.getTendanhmuc() }</li></a>

					</ul>
				</c:forEach>
			</div>
			<div class="col-sm-3">
				<img
					src='<c:url value="/resources/images/${listChiTiet.getHinhsanpham()}"/>'
					class="img-thumbnail" alt="Cinque Terre" width="304" height="236">

				<br> <span style="text-align: center">${listChiTiet.getTensanpham()}</span>


			</div>
			<div class="col-sm-3">
				<p>Chi Tiet San Pham</p>
				<table class="table table-striped">
					<thead>
						<tr>

							<th>Mau San Pham</th>
							<th>Size</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="chitiet" items="${ChiTiet1 }">
							<tr>

								<td>${chitiet.getTenmau()}</td>
								<td>${chitiet.getSize()}</td>

							</tr>
						</c:forEach>
					</tbody>
				</table>

			</div>
			<div class="col-sm-3">
				<span style="color: red; text-align: center">Mo Ta</span>
				<p>${listChiTiet.getMota() }</p>
			</div>
		</div>


	</div>
</body>
</html>