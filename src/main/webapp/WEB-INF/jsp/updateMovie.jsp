<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update-boxOffice</title>
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
<body>
	<div class="form11">
	<form id="form1" action="actionUpdate.html" method="post">
		<div class="heading">
		<h2 align="center">Update box office:</h2>
		</div>
		<table id="table1" ; cellspacing="5px" cellpadding="5%"
			; align="center">

			<tr>
				<td align="right" class="style1">Movie Id:</td>
				<td class="style1"><input type="text" name="movieId" /></td>
			</tr>
			<tr>
				<td align="right" class="style1">Movie Name:</td>
				<td class="style1"><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td align="right" class="style1">Genre:</td>
				<td class="style1"><input type="text" name="genre_genreId" /></td>
			</tr>
			<tr>
				<td align="right">Actors:</td>
				<td><input type="text" name="actor" /></td>
			</tr>
			<tr>
				<td align="right">Type:</td>
				<td><input type="text" name="type" /></td>
			</tr>
			<tr>
				<td align="right">Box Office:</td>
				<td><input type="text" name="boxOffice" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" align="right" />
				<td><input type="reset" value="Reset" /></td>
			</tr>
		</table>
	</form>
	</div>
</body>

</html>