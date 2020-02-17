<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<html>
<head>
<meta charset="UTF-8">
<title>Dang Nhap</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<link rel="stylesheet"
	href='<c:url value ="/resources/css/style_dangki.css"/>' />

</head>
<body>
	<form action="DangNhap" style="border: 1px solid #ccc">
		<div class="container">
			<h1>Sign Up</h1>
			<p>Please fill in this form to create an account.</p>
			<hr>

			<label for="email"><b>Email</b></label> 
				<input type="text" placeholder="Enter Email" name="email" required> 
				<label for="psw"><b>Password</b></label> 
				<input type="password" placeholder="Enter Password" name="password" required> 
				<label>
				<input type="checkbox" checked="checked" name="remember"
				style="margin-bottom: 15px"> Remember me
				</label>

			

			<div class="clearfix">
				
				<button type="submit" class="signupbtn" id ="dangnhap" value="${loiDangNhap} " onclick="dangnhap()">Sign Up</button>
			</div>
		</div>
	</form>
</body>
<script type="text/javascript">
	function dangnhap(){
	var a= $('#dangnhap').val();
		if(a==0){
			alert("Ban Dang Nhap Khong Dung");
		}
	}
</script>
</html>