<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Them San Pham</title>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href='<c:url value ="/resources/css/style_dangki.css"/>'>
<link rel="stylesheet"
	href='<c:url value ="/resources/css/style_addSanPham.css"/>'>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-2">
				<div class="sidebar-menu">
					<div class="sidebar-icon " style="text-align: center">
						<a> <span>Hai Duong</span>
						</a>
					</div>
					<div style="border-top: 1px ridge rgba(255, 255, 255, 0.15)"></div>
					<div id="menu">
						<ul>
							<li id="menu-academico"><a href="DanhSachSanPhamAdmin.html"><i
									class="fa fa-envelope nav_icon"></i><span> Danh Sách Sản
										Phẩm</span>
									<div class="clearfix"></div></a></li>
							<li id="menu-academico"><a href="inbox.html"><i
									class="fa fa-envelope nav_icon"></i><span> Sản Phẩm</span>
									<div class="clearfix"></div></a></li>
						</ul>
						<ul>
							<li id="menu-academico"><a href="inbox.html"><i
									class="fa fa-envelope nav_icon"></i><span> Danh Mục Sản
										Phẩm</span>
									<div class="clearfix"></div></a></li>
						</ul>
						<ul>
							<li id="menu-academico"><a href="NhanVien.html"><i
									class="fa fa-envelope nav_icon"></i><span>Nhân Viên</span>
									<div class="clearfix"></div></a></li>
						</ul>
						<ul>
							<li id="menu-academico"><a href="inbox.html"><i
									class="fa fa-envelope nav_icon"></i><span> Chi Tiết Sản
										Phẩm</span>
									<div class="clearfix"></div></a></li>
						</ul>
						<ul>
							<li id="menu-academico"><a href="inbox.html"><i
									class="fa fa-envelope nav_icon"></i><span> Chi Tiết
										Khuyến Mại</span>
									<div class="clearfix"></div></a></li>
						</ul>

					</div>
				</div>
			</div>


			<%-- 			<div class="col-sm-10 ">
				<form action="ThemSanPham" method="GET"
					style="border: 1px solid #ccc; margin-top: 40px">
					<div class="container">
						<h1 style="text-align: center">Them San Pham</h1>

						<hr>
						<label><b>Ma San Pham</b></label> <input type="text"
							placeholder="Name" name="masanpham" required>


						<div class="form-group">
							<label for="madanhmuc"><b>Danh Muc:</b></label> <select
								class="form-control" id="madanhmuc">
								<c:forEach var="a" items="${listDanhMuc }">
									<option value="${a.getMadanhmuc() }">${a.getTendanhmuc() }</option>
								</c:forEach>
							</select>
						</div>

						<label for="tensanpham"><b>Ten San Pham</b></label> <input
							type="password" placeholder="Enter Password" name="tensanpham"
							required> <label for="giatien"><b>Gia Tien</b></label> <input
							type="password" placeholder="Repeat Password" name="giatien"
							required> <label for="mota"><b>Mo Ta</b></label> <input
							type="password" placeholder="Repeat Password" name="mota"
							required> <label for="hinhsanpham"><b>Hinh
								San Pham</b></label> <input type="file" name="hinhsanpham" multiple
							placeholder="Repeat Password" required><br> <label
							for="gianhcho"><b>Gianh Cho</b></label><br> <input
							type="radio" name="gioitinh" value="nam"> Nam<br> <input
							type="radio" name="gioitinh" value="nu"> Nu<br>
					</div>
					<div class="container">
						<label>Chi Tiet</label>
						<div class="containerchitietsanpham">
							<div class="form-group">
								<select class="form-control" id="sel1">
									<c:forEach var="b" items="${listSize }">
										<option value="${b.getMasize() }">${b.getSize() }</option>
									</c:forEach>
								</select>
							</div>
							<div class="form-group">

								<select class="form-control" id="sel1">
									<c:forEach var="c" items="${listMau }">
										<option value="${c.getMamau() }">${c.getTenmau() }</option>
									</c:forEach>
								</select>
							</div>
							<input type="text" placeholder="So Luong" name="soluong" required>
							<div class="form-group">
								<div class='input-group date' id='datetimepicker1'>
									<input type='text' class="form-control" /> <span
										class="input-group-addon"> <span
										class="glyphicon glyphicon-calendar"></span>
									</span>
								</div>
							</div>
						</div>
						<button type="submit" class="signupbtn btn_chitiet" style="margin-left: 25%">Chi
							Tiet San Pham</button>
							<div class="chitietsanpham">
						<div class="form-group">
							<select class="form-control" id="sel1">
								<c:forEach var="b" items="${listSize }">
									<option value="${b.getMasize()}">${b.getSize()}</option>
								</c:forEach>
							</select>
						</div>
						<div class="form-group">

							<select class="form-control" id="sel1">
								<c:forEach var="c" items="${listMau}">
									<option value="${c.getMamau()}">${c.getTenmau()}</option>
								</c:forEach>
							</select>
						</div>
						<input type="text" placeholder="So Luong" name="soluong" required>
						<div class="form-group">
							<div class='input-group date' id='datetimepicker1'>
								<input type='text' class="form-control" /> <span
									class="input-group-addon"> <span
									class="glyphicon glyphicon-calendar"></span>
								</span>
							</div>
						</div>
					</div>
					<button type="submit" class="signupbtn btn_chitiet" style="margin-left: 25%">Chi
						Tiet San Pham</button>
			</div>
					</div>
					
			<div class="clearfix">
				<button type="submit" class="signupbtn" style="margin-left: 25%">Them
					San Pham</button>
			</div> 
		</div>
		</form> --%>
			<div class="col-sm-10 ">
				<form:form action="XuLyThemSanPham" method="POST"
					style="border: 1px solid #ccc; margin-top: 40px"
					modelAttribute="insertSanPham">
					<div class="container">
						<h1 style="text-align: center">Them San Pham</h1>
						<hr>
						  <div class="form-group">
							<label for="madanhmuc"><b>Danh Muc:</b></label>
							<form:select class="form-control" path="madanhmuc">
								<c:forEach var="a" items="${listDanhMuc }">
									<form:option  value="${a.getMadanhmuc() }" >${a.getTendanhmuc() }</form:option>>
								</c:forEach>
							</form:select>
							
						</div>   
						
						<label for="tensanpham"><b>Ten San Pham</b></label>
						<form:input path="tensanpham" />
						<label for="giatien"><b>Gia Tien</b></label> 
							<form:input path="giatien" />
							 <label for="mota"><b>Mo Ta</b></label> 
						<form:input	 path="mota" />
							 <label for="hinhsanpham"><b>Hinh
								San Pham</b></label> <form:input type="file" path="hinhsanpham" 
							 /><br> 
							 <label
							 for="gianhcho"><b>Gianh Cho</b></label><br> <%-- <form:input
							type="radio" path="gianhcho" value="nam"/> Nam<br> <form:input
							type="radio" path="gianhcho" value="nu"/> Nu<br>  --%>
							 <form:radiobutton path = "gianhcho" value = "nam"  /> Nam
                			  <form:radiobutton path = "gianhcho" value = "nu"  /> Nu
					<div class="clearfix">
				<button type="submit" class="signupbtn" style="margin-left: 25%">Them
					San Pham</button>
			</div>
					</div>
				</form:form>
			</div>
		</div>
	</div>
	<div></div>

</body>
<script type="text/javascript">
	$("body").on("click", ".btn_chitiet", function() {

		alert("Hello");
	})
</script>
</html>