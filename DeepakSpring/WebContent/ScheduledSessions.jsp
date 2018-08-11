<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../../../favicon.ico">

<title>Home Page</title>

<!-- Bootstrap core CSS -->
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<!-- Custom styles for this template -->
<link rel="stylesheet" type="text/css" href="css/index.css">
</head>

<body class="text-center">
	<div class="card-3">


		<h1 class="h3 mb-3 font-weight-normal main-heading">Scheduled
			Sessions</h1>
		<table class="table">
			<tr>
				<th class="trow">Session Name</th>
				<th class="trow">Duration (Days)</th>
				<th class="trow">Faculty</th>
				<th class="trow">Mode</th>
			</tr>
			<c:forEach items="${sessiondata}" var="obj">
			<tr>
				<td class="trow">${obj.name}</td>
				<td class="trow">${obj.duration}</td>
				<td class="trow">${obj.faculty}</td>
			    <td class="trow">${obj.mode1}</td>
				<td class="trow1"><a href="enroll/${obj.id}">Enroll Me</a></td>
			</tr>
			 </c:forEach> 
		</table>

	</div>


</body>
</html>