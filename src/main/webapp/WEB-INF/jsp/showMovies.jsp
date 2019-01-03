<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Employees</title>
<style type="text/css">
.form11 {
	margin: 10px;
}

:root {
	background-color: greenyellow;
}

.heading {
	background-color: darkgreen;
	padding: 10px;
}
</style>
</head>
<style>
table {
	margin: auto;
	padding: 10px;
	border: 2px solid black;
	overflow: scroll;
}

td, th {
	padding: 10px;
	border: 1px solid black;
}
</style>
<body>
	<div class="heading">
	<h1 align="center">Employee Details</h1>
	</div>
	<div class="form11">
	<table>
		<thead>
			<th>Movie Id</th>
			<th>Movie Name</th>
			<th>Genre</th>
			<th>boxOffice</th>
		</thead>

		<tbody>
			<c:forEach var="mov" items="${mov}">
				<tr>
					<td>${mov.movieId}</td>
					<td>${mov.name}</td>
					<td>${mov.genre}</td>
					<td>${mov.boxOffice}</td>
				</tr>
			</c:forEach>
		</tbody>
		<br>
		</tr>
	</table>
	</div>
	<div style="text-align: center">
		<a href="index">Go back to first page</a>
	</div>
	€‹
</body>
</html>