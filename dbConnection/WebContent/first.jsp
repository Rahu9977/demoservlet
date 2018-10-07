
<%@page import="com.project.model.countryModel"%>
<%@page import="java.util.ArrayList"%>
<form action="insert.php" method="post">

<input type="text" name="fname" autofocus="autofocus" autocomplete="off" placeholder="Enter name.." />
<br/>

<input type="text" name="number" placeholder="Enter number.." />
<br/>
<input type="text" name="bdate" placeholder="Enter birthdate.." />
<br/>
<input type="radio" name="gender" value="male"  />Male
<input type="radio" name="gender" value="female"  />Female
<br/>
<select name="cid">
<option value="0">select country</option>
<%
ArrayList<countryModel> k =(ArrayList)request.getAttribute("list");
if(!k.isEmpty())
for(countryModel l:k)
{
%>
<option value="<%=l.getCid()%>"><%=l.getCname()%></option>
<%
}
%>
</select>
<br/>

<input type="checkbox" name="hob" value="installment ugharavani"  />installment ugharavani
<input type="checkbox" name="hob" value="baka baka bolvani"  />baka baka bolvani
<input type="checkbox" name="hob" value="ramvani"  />ramvani
<input type="checkbox" name="hob" value="kudavani"  />kudvani

<input type="hidden" name="acd" value="papu"/>
<br/>
<textarea name="address"></textarea>
<br/>
<input type="submit" value="Add" />
<br/>

</form>
