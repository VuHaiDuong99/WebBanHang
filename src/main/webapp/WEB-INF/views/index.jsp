<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<link rel="stylesheet"
	href='<c:url value ="/resources/css/style_index.css"/>'>
<title>Trang Chu</title>
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Hải Dương</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Home</a></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Danh Sách Sản Phẩm <span
						class="caret"></span></a>
					<ul class="dropdown-menu">
						<c:forEach var ="listDanhMuc" items ="${listDanhMuc}">					
						<li><a href="${pageContext.request.contextPath}/SanPham/${listDanhMuc.getMadanhmuc()}">${listDanhMuc.getTendanhmuc() }</a></li>
						</c:forEach>
					</ul>
					</li>

				<li><a href="#">Link</a></li>
				<li><a>Sale</a></li>
				<li id ="admin" value ="${Sign_in}"><a id ="admin1" >Admin</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="Sign_up"><span
						class="glyphicon glyphicon-user"></span> Sign Up</a></li>
				<li><a href="Sign_in"><span
						class="glyphicon glyphicon-log-in"></span> Sign In</a></li>
			</ul>
			<button class="btn btn-danger navbar-btn">Button</button>
		</div>

	</nav>


	<div class="hero-image">

		<div class="hero-text">
			<h1 style="font-size: 50px">Black Friday</h1>
			<p>20/11 - 01/12</p>
			<button>Chi Tiet</button>
		</div>
	</div>
	<div class="container-fluid bg-3 text-center">
		<h3>San Pham Ban Chay</h3>
		<br>

		<div class="container-fluid bg-3 text-center">
			<div class="row">
				<c:forEach var="sanpham" items="${sanpham}">
					<a href="ChiTietSanPham/${sanpham.getMasanpham() }">
						<div class="col-sm-3">

							<div class="sanpham">

								<p>${sanpham.getTensanpham() }</p>

								<img
									src='<c:url value ="resources/images/${sanpham.getHinhsanpham() }"/>' />
								<p>Gia Ban : ${sanpham.getGiatien() }</p>
							</div>


						</div>
					</a>
				</c:forEach>
			</div>
		</div>
		<br>
		<br>
		<hr width="80%" size="10px" style="background-color: red" />
		<div class="hero-image-footer"></div>
</body>
<script type="text/javascript">
/* $(document).ready(function(){
    $("#admin").ready(function(){
    	var inputVal = $('#admin').val();
    	if(inputVal==1){
    		alert("ban dang nhap voi quyen admin");
    	}
    	if(inputVal==0){
    		alert("ban dang nhap voi quyen nguoi dung");
    	}
    	
    });
    
}); */
</script>
</html>
