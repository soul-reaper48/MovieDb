<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Actor-add</title>
</head>
<body>
    <div class = "menu">
    <form id="form1" action="actionAddActor.html" method="post">
                          
    <h2 align="center"> Enter Actor details:</h2><hr>  
    <table id="table1"; cellspacing="5px" cellpadding="5%"; align="center">  
       <tr>  
              <td  align="right" class="style1">Actor iD:</td>  
              <td class="style1"><input type="text" name="actorId" /></td>  
       </tr>
       <tr>  
              <td  align="right" class="style1">Actor name:</td>  
              <td class="style1"><input type="text" name="name" /></td>  
       </tr> 
       <tr>  
              <td  align="right" class="style1">Actor age:</td>  
              <td class="style1"><input type="text" name="age" /></td>  
       </tr>  
       <tr>  
              <td align="right">Gender:</td>  
              <td><input type="text" name="gender" /></td>  
       </tr>
        <tr>  
        <td> <input type="submit" value="Submit" align="right"/>  
        <td> <input type="reset" value="Reset" />         
        </td>  
        </tr>  
</table>   

    </form>  
	</div>
</body>  

</html>