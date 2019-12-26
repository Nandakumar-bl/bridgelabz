<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="resource/CSS/Welcome.css" />
<meta charset="UTF-8">
</head>

<body background="resource\img\welcome.png">
<form action="log-out" method="post">
<input type="submit" value="logout" class="logout">
</form>
 <%
   if(session.getAttribute("username")==null)
   {
		RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
		rd.forward(request, response);	
   }
%>
 <iframe src="https://www.bridgelabz.com"></iframe>
<h1>Hearty Welcome <%out.print(session.getAttribute("username")); %>!!</h1>


<div class="para">BridgeLabz is a live Lab environment nurturing Fresh Engineers through
 Startups for Tech Companies at Zero Cost. Bridgelabz works with Tech Companies to hire fresh 
 engineers and transforms them to industry ready hard-core developers. BridgeLabz Vision is to
 be a platform for seasoned professionals to develop their ideas with senior engineers who aspire
 to be co-founders. They in turn use the fresh engineers to develop the Apps who becomes qualified developer
 for a job with tech companies. BridgeLabz Mission is to fulfill the aspiration of fresh engineers to find jobs,
 tech companies to have qualified fresh talent, senior engineer to co-found startups & seasoned professionals to develop ideas.'</div>
 <font class="comp">Partner companies</font>
 <div class="img">
 <img width="175px" height="100px" src="resource\intellect_logo.webp">
 <img width="175px" height="100px" src="resource\Urban Ladder_logo.webp">
 <img width="175px" height="100px"  src="resource\yatra.webp">
 <form action="welcomes" method="post">
 <input class="edior" type="submit" value="Edit Profile">
 </form>
 </div>

</body>
</html>