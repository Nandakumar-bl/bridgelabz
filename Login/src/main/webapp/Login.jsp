

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-1.10.2.js"
	type="text/javascript"></script>
	<script src="resource/JS/logcheck.js" type="text/javascript">
</script>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="resource\CSS\Login.css" />

<pre>
<img src="resource\img\bl.png" class="bl"> 


<h3>WELCOME TO LOGIN PAGE</h3>

</pre></head>

<body background="resource\img\log4.png">



 <div class="boxed">
 <form action="log" method="post">
 
    <img src="resource\img\logo.png" class="logo"> 
    <h2 class="login" align="center"> LOGIN</h2>
    <br><br><br><br><br><br><br><br>
 <b class="user">Username:</b><br><input type="text" id="user" name="username" placeholder="username">
 <br>
 <b class="pass">Password:</b><br><input type="password" id="pass" name="password" placeholder="password">
 <br>
 			<button>Log in</button>		
 			
</form>
 
 <a >
    <br><br><br><br>
 <input type="submit" value="Register" onclick="window.location.href='registration.jsp'"  ></a>
 <br><br><br>	<a class="forgotpass" href="Forgot.jsp"> Forgot password?</a>
 </div>

</body>
</html> 