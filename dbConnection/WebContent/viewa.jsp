<script>

function abc(val) {
	
	if(confirm("kharekhar delete karvu 6??"))
		{
		window.location.href="insert.php?a=1&id="+val;
		}
	
}
function abcd(val) {
	
	if(confirm("kharekhar medan ma avu 6??"))
		{
		window.location.href="insert.php?a=3&id="+val;
		}
	
}

</script>



<%@page import="com.project.model.userModel"%>
<%@page import="java.util.ArrayList"%>
<table border="1">

<tr>
<th>
SR NO.
</th>

<th>
FULLNAME
</th>

<th>
MOBILE NUMBER
</th>

<th>
GENDER
</th>

<th>
ADDRESS
</th>

<th>
HOBBIE
</th>

<th>
Action
</th>

</tr>
<%
int m =1; 
ArrayList<userModel> k =(ArrayList)request.getAttribute("list");
if(!k.isEmpty())
for(userModel l:k)
{
	
%>
<tr>
<td>
<input type="checkbox"/>
<%=m%>
</td>

<td>
<%=l.getFname() %>
</td>

<td>
<%=l.getNumber() %>
</td>

<td>
<%=l.getGender() %>
</td>

<td>
<%=l.getAddress() %>
</td>


<td>
<%

String hj = l.getHobbi();
String[] jm= hj.split(",");
for(String v:jm)
{
	%>
	<%=v %>
	<br/>
<% 
}
%>
</td>
<%
if(l.getActive_flag() == 0)
	{
	%>
<td>
<input type="button" onclick="abc(<%=l.getId() %>)" value="per delete"/>
</td>
<%
	}
else{
%>
<td style="background: red;">
<input type="button" onclick="abc(<%=l.getId() %>)" value="per delete"/>
<input type="button" onclick="abcd(<%=l.getId() %>)" value="retrive"/>
</td>
<%
}
%>
</tr>
<%
m++;
}
%>
</table>