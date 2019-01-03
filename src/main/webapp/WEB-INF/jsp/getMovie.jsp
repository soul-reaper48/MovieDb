<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
	<div class = "form11">
	<form id="form1" action="actionGetMovieByGenre.html" method="post">
		<div class ="heading">
		<h2 align="center">Enter Genre:</h2>
		</div>
		<table id="table1" ; cellspacing="5px" cellpadding="5%"
			; align="center">
			<tr>
				<td align="right" class="style1">Genre:</td>
				<td class="style1"><input type="text" name="genre_genreId" /></td>
			</tr>
			<td><input type="submit" value="Submit" align="right" />
			<td><input type="reset" value="Reset" /></td>
			</tr>
		</table>
	</form>
	</div>
</body>
</html>