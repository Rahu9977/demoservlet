<%@page import="com.project.model.countryModel"%>
<script>

function abc(val) {
	
	if(confirm("kharekhar delete karvu 6??"))
		{
		window.location.href="insert.php?a=2&id="+val;
		}
	
}

</script>



<%@page import="java.util.ArrayList"%>
<table border="1">

<tr>
<th>
SR NO.
</th>

<th>
COUNTRY
</th>

<th>
CHOR <br/> CHORI NO TIME <br/> CHORI NU GHAR
</th>

<th>
Action
</th>

</tr>
<%
int m = 1;
ArrayList<countryModel> k =(ArrayList)request.getAttribute("list");
if(!k.isEmpty())
for(countryModel l:k)
{
%>
<tr>
<td>
<input type="checkbox"/>
<%=m%>
</td>

<td>
<%=l.getCname() %>
</td>

<td>
<%=l.getUname() %>
<br/>
<%=l.getCreated_by_date() %>
<br/>
<%=l.getCreated_mac() %>
</td>

<td>

<input type="button" onclick="abc(<%=l.getCid() %>)" value="delete"/>

</td>

</tr>
<%
m++;
}
%>
</table>