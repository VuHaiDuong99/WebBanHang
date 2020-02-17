<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Danh Sach San Pham</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  	<link rel="stylesheet" href='<c:url value ="/resources/css/style_dangki.css"/>'>
  	<link rel="stylesheet" href='<c:url value ="/resources/css/style_addSanPham.css"/>'>
  	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
	<div class ="container-fluid">
		<div class = "row">
			<div class="col-sm-2" >
				<div class="sidebar-menu">
					<div class ="sidebar-icon " style="text-align: center">
						<a> <span >Hai Duong</span> </a> 
					</div>
					<div style="border-top:1px ridge rgba(255, 255, 255, 0.15)"></div>
					<div id ="menu">
						<ul>
							 <li id="menu-academico" ><a href="DanhSachSanPhamAdmin.html" ><i class="fa fa-envelope nav_icon"></i><span>  Danh Sach	Sáº£n Pháº©m</span><div class="clearfix"></div></a></li>
							 <li id="menu-academico" ><a href="" ><i class="fa fa-envelope nav_icon"></i><span>  	Sáº£n Pháº©m</span><div class="clearfix"></div></a></li>
						</ul>
						<ul>
							 <li id="menu-academico" ><a href="inbox.html"><i class="fa fa-envelope nav_icon"></i><span> Danh Má»¥c Sáº£n Pháº©m</span><div class="clearfix"></div></a></li>
						</ul>
						<ul>
							 <li id="menu-academico" ><a href="NhanVien.html"><i class="fa fa-envelope nav_icon"></i><span> NhÃ¢n ViÃªn</span><div class="clearfix"></div></a></li>
						</ul>
						<ul>
							 <li id="menu-academico" ><a href="inbox.html"><i class="fa fa-envelope nav_icon"></i><span> Chi Tiáº¿t Sáº£n Pháº©m</span><div class="clearfix"></div></a></li>
						</ul>
						<ul>
							 <li id="menu-academico" ><a href="inbox.html"><i class="fa fa-envelope nav_icon"></i><span> Chi Tiáº¿t Khuyáº¿n Máº¡i</span><div class="clearfix"></div></a></li>
						</ul>
						
					</div>
				</div>
			</div>
			<div class ="col-sm-10">
				<div class="container-fluid">
					<form action="" style="border:1px solid #ccc;margin-top: 40px">
						<table class="table table-striped">
					    <thead>
					      <tr>
					        <th>Ma San Pham</th>
					        <th>Ma Danh Muc</th>
					        <th>Ten San Pham</th>
					        <th>Gia Tien</th>
					        <th>Mo Ta</th>
					        <th>Hinh San Pham</th>
					        <th>Gioi Tinh</th>
					        <th></th>
					      </tr>
					    </thead>
					    <tbody>
					      <tr>
					        <td>John</td>
					        <td>Doe</td>
					        <td>john@example.com</td>
					        <td>Doe</td>
					        <td>Doe</td>
					        <td>Doe</td>
					        <td>Doe</td>
					        <td><button style="padding: 0px;margin-top: 0px;" onclick ="alert('ban co muon xoa')">Xoa</button></td>
					      </tr>
					     	<tr>
					        <td>John</td>
					        <td>Doe</td>
					        <td>john@example.com</td>
					        <td>Doe</td>
					        <td>Doe</td>
					        <td>Doe</td>
					        <td>Doe</td>
					        <td><button style="padding: 0px;margin-top: 0px;">Xoa</button></td>
					      </tr>
					    </tbody>
					  </table>
					</form>
				</div>
			</div>
</div>
</div>

</body>
</html>