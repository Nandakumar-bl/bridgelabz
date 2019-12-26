<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Forgot password</title>
<link rel="stylesheet" href="resource\CSS\Forgot.css" />
</head>

<font> Password Change</font>
<body background="resource/img/brown-paper-clips-1097930.jpg">

<button onclick="window.location.href='Login.jsp'" >Go Back </button>
<form action="passwordch" method="post">
<img src="resource\img\forgot.jpeg" class="logo">
<div class="forgot">
Enter username:
<input type="text" name="username" placeholder="username"><br><br>
<label class="sq">Security Question?</label><br><br>
What is your EmailId?<br>
<input type="text" name="securityans" placeholder="Answer"><br><br>
New Password:<br>
<input type="password" name="password" placeholder="Answer"><br><br>
Repeat Password:<br>
<input type="password" name="passwordcheck" placeholder="Answer"><br><br>
<input type="submit"   name="submit" value="Reset">
</div>
</form>

</body>
</html>