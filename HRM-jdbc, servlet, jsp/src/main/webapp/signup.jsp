<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign up</title>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
	font-family: Calibri, Helvetica, sans-serif;
	background-color: white;
}

.container {
	padding: 6 0px;
	background-color: lightblue;
}

input[type=text], input[type=password], textarea {
	width: 100%;
	padding: 15px;
	margin: 5px 0 22px 0;
	display: inline-block;
	border: none;
	background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
	background-color: white;
	outline: none;
}

div {
	padding: 10px 0;
}

hr {
	border: 1px solid #f1f1f1;
	margin-bottom: 25px;
}

.registerbtn {
	background-color: #4CAF50;
	color: white;
	padding: 16px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 20%;
	opacity: 0.9;
}

.registerbtn:hover {
	opacity: 1;
}
</style>
</head>
<body>
	<form method="post" action="managers">
		<div class="container">
			
				<h1 style="text-align: center">HR Manager Registeration Form</h1>
			
			<hr>
			 <input type="hidden" name="task" value="signup">
			<label> Full Name </label> 
			<input type="text" name="fullName" id="fullName" placeholder="Full Name" size="15" required />

		 
			<label> Mobile Number : </label> 
				<input type="text" id="mobileNumber" name="mobileNumber" placeholder=" Mobile Number"  required>
			
			<label for="Email"><b>Email</b></label> 
			<input type="text" id="Email"	placeholder="Email" name="Email" required>
			
			<label for="branchId"><b>Branch Id</b></label> 
			<input type="text"	id="branchId" placeholder="Branch Id" name="branchId" required> 
			
			<label for="psw"><b>Password</b></label> 
			<input type="password" id="password" placeholder="Password" name="password" required> 
			
			<label for="psw-repeat"><b>Re-type Password</b></label> 
			<input 	type="password" placeholder="Retype Password" name="psw-repeat" required>
			
			<button type="submit" class="registerbtn">Register</button>
			</div>
	</form>
</body>
</html>
