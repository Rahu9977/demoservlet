<%
response.setHeader("Cache-Control", "no-cache, no-store"); // HTTP 1.1
response.setHeader("Pragma", "no-cache"); // HTTP 1.0
response.setDateHeader("Expires", 0); // Proxies.
	if(session.getAttribute("fn") == null)
	{
		response.sendRedirect("papa.mummy?a=0");
	}
%>
<h1>header</h1>
<h1>welcome,<%=session.getAttribute("fn") %></h1>

<a href="papa.mummy?a=1">insert first</a>
<a href="papa.mummy?a=5">insert tran table</a>
<a href="papa.mummy?a=4">insert country</a>
<a href="papa.mummy?a=9">view country</a>
<a href="papa.mummy?a=3">insert third</a>
<a href="papa.mummy?a=2">view employee first</a>
<a href="papa.mummy?a=6">view admin first</a>
<a href="insert.php?a=7">logout</a>

<div>

<%
if(request.getParameter("p") != null)
{
	String h = request.getParameter("p")+".jsp";
	%>
	<jsp:include page="<%=h%>"/>
	<% 
}
%>
</div>

<h1>footer</h1>