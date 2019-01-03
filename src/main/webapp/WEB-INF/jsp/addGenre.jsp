<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Genre-add</title>
</head>
<body>
	<form id="form1" action="actionAddGenre.html" method="post">
		<div></div>
		<h2 align="center">Enter Genre Details:</h2>
		<hr>
		<table id="table1" ; cellspacing="5px" cellpadding="5%"; align="center">
			<tr>
				<td align="right" class="style1">Genre Id:</td>
				<td class="style1"><input type="text" name="genreId" /></td>
			</tr>
			<tr>
				<td align="right" class="style1">Genre name:</td>
				<td class="style1"><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" align="right" />
				<td><input type="reset" value="Reset" /></td>
			</tr>
		</table>
	</form>
</body>

</html>