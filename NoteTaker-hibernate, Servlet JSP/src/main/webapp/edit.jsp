<%@page import="org.hibernate.Session"%>
<%@page import="com.entities.Note"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="com.helper.FactoryProvider"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="all_js_css.jsp"%>
<title>Edit</title>
</head>
<body>
	<div class="container">
		<%@include file="navbar.jsp"%>
		<h1>Edit Your Note</h1>
		<br/>
			<%
		int noteId = Integer.parseInt(request.getParameter("note_id").trim());
		Session s = FactoryProvider.getFactory().openSession();
		Transaction txn = s.beginTransaction();
		Note note = (Note) s.get(Note.class, noteId);
		%>
			<form action="UpdateServlet" method="post">
			<div class="form-group">
			<input value="<%= note.getId() %>" name="noteId" type="hidden" />
			</div>
				<div class="form-group">
					<label for="title">Note Title</label> <input name="title"
						type="text" class="form-control" id="title"
						aria-describedby="emailHelp" placeholder="Enter Title Here"
						required value="<%= note.getTitle() %>"/>

				</div>
				<div class="form-group">
					<label for="content">Note Content</label>
					<textarea name="content" id="content"
						placeholder="Enter Your Content" class="form-control"
						style="height: 250px;" required ><%= note.getContent() %></textarea>
				</div>
				<div class="container">
					<button type="submit" class="btn btn-success">Save</button>
				</div>

			</form>
	</div>
</body>
</html>