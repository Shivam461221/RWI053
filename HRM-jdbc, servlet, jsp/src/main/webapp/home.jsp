<%@page import="com.human.resource.management.dto.ManagerDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
body {
	font-family: Calibri, Helvetica, sans-serif;
	background-color: white;
}

.container {
	padding: 50px;
	background-color: lightblue;
}

input[type=text], input[type=password] {
	width: 40vw;
	margin: 8px 0;
	padding: 12px 20px;
	display: inline-block;
	border: 2px solid green;
	box-sizing: border-box;
}

button {
	background-color: purple;
	width: 10%;
	color: orange;
	padding: 15px;
	margin: 10px 0px;
	border: none;
	cursor: pointer;
}

td button {
	background-color: purple;
	width: 25%;
	color: orange;
	padding: 15px;
	margin: 10px 0px;
	margin-left: 10px;
	border: none;
	cursor: pointer;
	border: none;
}

form button {
background-color: purple;
	width: 50%;
	color: orange;
	padding: 15px;
	margin: 10px 0px;
	margin-left: 10px;
	border: none;
	cursor: pointer;
	border: none;
}

button:hover {
	opacity: 0.7;
}

table, th, td {
	border: 2px solid black;
	font-size: x-large;
	border-spacing: 5px;
}

a {
	text-decoration: none;
	color: orange;
}
</style>
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>Home Page</h1>
	</center>
	<div class="container">

		<%
		if (request.getAttribute("activeManagerDTO") != null) {
			ManagerDTO activeManagerDTO = (ManagerDTO) request.getAttribute("activeManagerDTO");
		%>
		<h3>
			Welcome
			<%=activeManagerDTO.getName()%>!!
		</h3>
		<%
		}
		%>

		<form method="get" id="home" action="managers">
			<input type="hidden" name="task" value="findById"> 
			<input type="text" placeholder="Enter Manager Id" name="managerid" required>
			<button type="submit">Find</button>
		</form>

		<table style="width: 100%">
			<tr>
				<th>id</th>
				<th>Name</th>
				<th>Mobile Number</th>
				<th>Email</th>
				<th>BranchId</th>
				<th>Sallary</th>
				<th>action</th>
			</tr>

			<%
			if (request.getAttribute("managerDTO") != null) {
				ManagerDTO managerDTO = (ManagerDTO) request.getAttribute("managerDTO");
			%>
			<tr>
				<td><%=managerDTO.getId()%></td>
				<td><%=managerDTO.getName()%></td>
				<td><%=managerDTO.getMobileNumber()%></td>
				<td><%=managerDTO.getEmail()%></td>
				<td><%=managerDTO.getBranchId()%></td>
				<td><%=managerDTO.getSallary()%></td>
				<td><button type="submit" name="update">Edit</button> &nbsp;
					<button type="submit" name="delete">Delete</button></td>
			<tr>
				<%
				}
				%>
			</tr>
			<form action="managers" id="home" method="get">

			<input type="hidden" name="task" value="findAll">

			<button type="submit" id="submit" value="Submit" name="submit">Find
				All</button>
		</form>
			<%
			if (request.getAttribute("managerDTOList") != null) {
				List<ManagerDTO> managerDTOList = (List) request.getAttribute("managerDTOList");
				for (ManagerDTO managerDTO : managerDTOList) {
			%>

			<tr>
				<td><%=managerDTO.getId()%></td>
				<td><%=managerDTO.getName()%></td>
				<td><%=managerDTO.getMobileNumber()%></td>
				<td><%=managerDTO.getEmail()%></td>
				<td><%=managerDTO.getBranchId()%></td>
				<td><%=managerDTO.getSallary()%></td>

				<td>

					<form action="managers" id="home" method="get">
						<input type="hidden" name="task" value="editByManagerId"> 
						<input type="hidden" name="managerId" value="<%=managerDTO.getId()%>">
						<button type="submit" name="update">Edit</button>
					</form>
					<form action="managers" id="home" method="get">
						<input type="hidden" name="task" value="deleteById"> <input
							type="hidden" name="managerId" value="<%=managerDTO.getId()%>">
						<button type="submit" name="delete">Delete</button>
					</form>

				</td>
			</tr>

			<%
			 }
			}
			%>

		</table>
		
	
	<%
	if (request.getAttribute("editManagerDTO") != null) {
		ManagerDTO editManagerDTO = (ManagerDTO) request.getAttribute("editManagerDTO");
	%>
	
	<form method="post" action="managers">
		<div class="container">
			
				<h1 style="text-align: center">Edit HR Manager Details</h1>
			
			<hr>
			 <input type="hidden" name="task" value="update">
			 <input type="hidden" id="managerId" name="managerId" value="<%=editManagerDTO.getId()%>">			 
			 <br>
			<label for="Full Name "><b>Full Name </b></label> <br>
			<input type="text" name="Name" id="Name" placeholder="FullName" value="<%=editManagerDTO.getName()%>"  >
			<br>
		    <label for="Mobile" ><b>Mobile</b> </label> <br>
		    <input type="text" id="mobileNumber" name="mobileNumber" placeholder=" Mobile Number" value="<%=editManagerDTO.getMobileNumber() %>" >
			<br>
			<label for="Email"><b>Email</b></label> <br>
			<input type="text" id="email"	placeholder="Email" name="email" value="<%=editManagerDTO.getEmail() %>" >
			<br>
			<label for="Password"><b> Password</b></label><br> 
			<input type="text"	id="Password" placeholder="Password" name="Password" value="<%=editManagerDTO.getPassword()%>" > 
			<br>
			<label for="sallary"><b>sallary</b></label> <br>
			<input type="text"	id="sallary" placeholder="sallary" name="sallary" value="<%=editManagerDTO.getSallary()%>"> 
			<br>
			
			<button type="submit" class="registerbtn">Update</button>
			</div>
	</form>
	<% 
	}
	%>
    </div>
</body>
</html>