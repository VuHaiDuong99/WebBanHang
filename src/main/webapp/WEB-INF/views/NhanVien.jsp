<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Nhan Vien</title>
	<meta charset="UTF-8">
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
							 <li id="menu-academico" ><a href="DanhSachSanPhamAdmin.html" ><i class="fa fa-envelope nav_icon"></i><span>  Danh Sach	Sản Phẩm</span><div class="clearfix"></div></a></li>
							 <li id="menu-academico" ><a href="inbox.html" ><i class="fa fa-envelope nav_icon"></i><span>  	Sản Phẩm</span><div class="clearfix"></div></a></li>
						</ul>
						<ul>
							 <li id="menu-academico" ><a href="inbox.html"><i class="fa fa-envelope nav_icon"></i><span> Danh Mục Sản Phẩm</span><div class="clearfix"></div></a></li>
						</ul>
						<ul>
							 <li id="menu-academico" ><a href="inbox.html"><i class="fa fa-envelope nav_icon"></i><span> Nhân Viên</span><div class="clearfix"></div></a></li>
						</ul>
						<ul>
							 <li id="menu-academico" ><a href="inbox.html"><i class="fa fa-envelope nav_icon"></i><span> Chi Tiết Sản Phẩm</span><div class="clearfix"></div></a></li>
						</ul>
						<ul>
							 <li id="menu-academico" ><a href="inbox.html"><i class="fa fa-envelope nav_icon"></i><span> Chi Tiết Khuyến Mại</span><div class="clearfix"></div></a></li>
						</ul>
						
					</div>
				</div>
			</div>
			<div class ="col-sm-10 ">
				<form action="" style="border:1px solid #ccc;margin-top: 40px">
				  <div class="container">
				    <h1 style ="text-align: center">NhanVien</h1>
				    
				    <hr>
					<label><b>Ma Nhan Vien</b></label>
					 <input type="text" placeholder="Name" name="txt_MaNV" required>
				    <label for="email"><b>Ho Ten</b></label>
				    <input type="text" placeholder="Enter Email" name="txtHoTen" required>

				    <label for="psw"><b>Dia Chi</b></label>
				    <input type="text" placeholder="Enter Password" name="txtDiaChi" required>

				    <label for="psw-repeat"><b>Gioi Tinh</b></label>
				    <input type="text" placeholder="Repeat Password" name="txtGioiTinh" required>
				    
				     <label for="psw-repeat"><b>CMND</b></label>
				    <input type="text" placeholder="Repeat Password" name="txt_CMND" required>
				    
				     <label for="psw-repeat"><b>Ma Chuc Vu</b></label>
				      <input type="text" placeholder="Name" name="txt_MaCV" required>
				     <label for="psw-repeat"><b>Email</b></label>
				    <input type="text" placeholder="Name" name="txt_Email" required>
				      <label for="psw-repeat"><b>Ten Dang Nhap</b></label>
				     <input type="text" placeholder="Name" name="txt_tenDN" required>
				       <label for="psw-repeat"><b>Mat Khau</b></label>
				      <input type="text" placeholder="Name" name="txt_MatKhau" required>
				   
				 
				    <div class="clearfix">
					     
				     <button type="submit" class="signupbtn" style ="margin-left: 25%">Them Nhan Vien</button>
					    </div>
					  </div>
				</form>
		</div>
		</div>
		
	</div>
</body>
</html>