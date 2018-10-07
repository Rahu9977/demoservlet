<%
response.setHeader("Cache-Control", "no-cache, no-store"); // HTTP 1.1
response.setHeader("Pragma", "no-cache"); // HTTP 1.0
response.setDateHeader("Expires", 0); // Proxies.


	if(session.getAttribute("fn") != null)
	{
		response.sendRedirect("papa.mummy?a=44");
	}

   if(session.getAttribute("msg") != null)
   {
	   out.print("<span style=color:red>"+session.getAttribute("msg")+"</span>");
       session.removeAttribute("msg");
   }
    

%>


<form action="insert.php" method="post">

<input type="text" name="uname" autofocus="autofocus" autocomplete="off" placeholder="Enter username" />
<br/>
<input type="password" name="pass" autocomplete="off" placeholder="Enter password.." />
<br/>
<input type="hidden" name="acd" value="login"/>
<input type="submit" value="Login" />
<br/>

</form>