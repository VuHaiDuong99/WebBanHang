<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>


<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<meta charset="UTF-8">
	<title>Dang Ki</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  	<link rel="stylesheet" href='<c:url value ="/resources/css/style_dangki.css"/>' />
  	
</head>
<body>
	<form:form action="DangKi" style="border:1px solid #ccc" modelAttribute="themUser" method="POST">
  <div class="container" >
    <h1>Sign Up</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>
	<label ><b>Name</b></label>
	 <form:input  path="name" placeholder="Name"  id="name" />
	 <br>
	<form:errors path="name" cssClass="error" />
    <label for="email"><b>Email</b></label>
    <form:input  path="email" placeholder="Enter Email" id ="email"/>
	<form:errors path="email" style="color:red"></form:errors>
    <label for="psw"><b>Password</b></label>
    <form:input type="password" placeholder="Password"   path="password" id="password" />
	<form:errors path="password" style="color:red"></form:errors>
    <label for="psw-repeat"><b>Repeat Password</b></label>
    <form:input type="password" path="repeatpassword" placeholder="Repeat Password" id ="repeatpassword" />
    <form:errors path="repeatpassword" style="color:red"></form:errors>

    <div class="clearfix">
      
      <button type="submit" class="signupbtn" >Sign Up</button>
    </div>
  </div>
</form:form>	
</body>
<script type="text/javascript">
	function click1(){
		var name =$('#name').val();
		var email =$('#email').val();
		var  password =$('#password').val();
		var repeatpassword =$('#repeatpassword').val();
		if(name == "" || email =="" || password =="" || repeatpassword ==""){
			alert("Ban Nhap Day Du Thong Tin");
		}
		
	}
</script>
</html>