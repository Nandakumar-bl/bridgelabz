<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="resource\CSS\registration.css" />
<meta charset="UTF-8">
<title>Registration</title>
<script src="https://code.jquery.com/jquery-1.10.2.js"
	type="text/javascript"></script>
	<script src="resource\JS\register.js" type="text/javascript">
</script>
</head>

<body background="resource\img\gray-laptop-computer-showing-html-codes-in-shallow-focus-160107.png">
<button class="back" onclick="window.location.href='Welcome.jsp'">Back</button>

<div class="details">
<form action="regist" method="post">
<img src="resource\img\register.png">

FirstName:<input type="text" id="" name="firstname" placeholder="firstname"><br>
lastName:<input type="text" name="lastname" placeholder="lastname"><br>
UserName:<input type="text" id="userName" name="username" placeholder="username">
<p style="color:red" id="ServletResponse" ></p>
PassWord:<input type="password" name="password" placeholder="password"><br>
Email:<input type="text" name="email" placeholder="mail"><br>
SecurityAns:<input type="text" name="securityans" placeholder="enter email-id"><br>
ContactNo:<input type="tel" name="mobilenumber" placeholder="mobile no"><br>
<br>

<input type="submit" value="Submit">
</form>
</div>

</body>
</html>