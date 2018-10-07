<form action="insert.php" method="post">

<input type="text" name="fname" autofocus="autofocus" autocomplete="off" placeholder="Enter name.." />
<br/>
<input type="hidden" name="acd" value="mummy"/>
<input type="text" name="number" placeholder="Enter number.." />
<br/>
<input type="radio" name="gender" value="male"  />Male
<input type="radio" name="gender" value="female"  />Female
<br/>
<select name="country">
<option value="0">select country</option>
<option value="1">INDIA</option>
<option value="2">PAKISTAN</option>
<option value="3">JAMNAGAR</option>
</select>
<br/>
<input type="checkbox" name="hob" value="installment ugharavani"  />installment ugharavani
<input type="checkbox" name="hob" value="baka baka bolvani"  />baka baka bolvani
<input type="checkbox" name="hob" value="ramvani"  />ramvani
<input type="checkbox" name="hob" value="kudavani"  />kudvani


<br/>
<textarea name="address"></textarea>
<br/>
<input type="submit" value="Add" />
<br/>

</form>