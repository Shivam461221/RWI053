<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add notes</title>
<%@include file="all_js_css.jsp"%>
</head>
<body>
	<div class="container">
		<%@include file="navbar.jsp"%>
		<br />
		<h1>Add Note</h1>
		<!--This is add form  -->
		<form action="SaveNote" method="post">
			<div class="form-group">
				<label for="title">Note Title</label> <input name="title" type="text"
					class="form-control" id="title" aria-describedby="emailHelp"
					placeholder="Enter Title Here" required />

			</div>
			<div class="form-group">
				<label for="content">Note Content</label>
				<textarea name="content" id="content" placeholder="Enter Your Content"
					class="form-control" style="height:250px;" required></textarea>
			</div>
			<div class="container">
				<button type="submit" class="btn btn-primary">Add</button>
			</div>

		</form>
	</div>
</body>
</html>