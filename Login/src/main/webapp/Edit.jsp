<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="resource\CSS\Edit.css" />
<meta charset="UTF-8">
<title>Edit profile</title>
</head>
<%
   if(session.getAttribute("username")==null)
   {
		RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
		rd.forward(request, response);	
   }
%>
<font class="edit" color="skyblue">Edit Your Profile</font>
<button class="back" onclick="window.location.href='Welcome.jsp'">Back</button>
<form action="log-out" method="post">
<input type="submit" value="logout" class="logout"></form>
<body background="resource\img\photography-of-macbook-half-opened-on-white-wooden-surface-633409.jpg">

<div class="details">
<form action="editor" method="post">
FirstName:<input type="text" name="firstname" placeholder="firstname">&nbsp&nbsp&nbsp
LastName:<input type="text" name="lastname" placeholder="lastname"><br><br><br>
PassWord:<input type="password" name="password" placeholder="password">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
Email-ID:<input type="text" name="email" placeholder="mail"><br><br><br>
SecurityAns:<input type="text" name="securityans" placeholder="enter Email-id">
ContactNo:<input type="tel" name="mobilenumber" placeholder="mobile no"><br>
<br>
<input type="submit" value="update">
</form>
</div>
</body>
</html>