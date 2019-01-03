<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MVC</title>
<style type="text/css">
a{
margin: right;
font-weight: bold;
}
.menu{
     text-align: center;
     margin: auto;
}
.heading{
	background-color: darkgreen;
	padding: 10px;
}
:root{
    background-color: greenyellow;
}
</style>
</head>
<body>
<div class = "heading">
<h1 style="text-align: center; font-weight: bold;">${message}</h1><br>
</div>
<div class = "menu">
<table id="table1"; cellspacing="5px" cellpadding="5%"; align="center">  
       <tr>
       		<td><a href="addGenre">Add Genre</a></td>
       </tr>
       <tr>
       		<td><a href="addActor">Add Actor</a></td>
       </tr>
       <tr>
       		<td><a href="addMovie">Add Movie</a></td>
       </tr>
       <tr>
       		<td><a href="showMovieByGenre">List of movies by Genre</a></td>
       </tr>
       <tr>
       		<td><a href="showTopGross">List of top grossing movies</a></td>
       </tr>
       <tr>
       		<td><a href="updateMovie">Update box office of a movie.</a></td>
       </tr>
</div>
</body>
</html>