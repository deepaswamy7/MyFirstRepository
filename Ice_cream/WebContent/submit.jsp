<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Order</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<style>
h4 {
    //color: #00BFFF;
    color: blue;
}
h5 {
    color: #FFA07A;
}

</style>

</head>
<body>
<h4>Review order of your items</h4>
<h5>Type of Ice cream:&nbsp;&nbsp; <%=request.getParameter("types") %></h5>
<h5>Number of scoops:&nbsp;&nbsp; <%=request.getParameter("scoops")%></h5>
<h5>Selected Flavors: </h5>

 <ul>
<%
String[] lan=request.getParameterValues("flavor");
for(String temp : lan){
 out.println("<li>" + temp + "</li>");
}
%>
</ul>
<h5>Quantity:&nbsp;&nbsp;&nbsp;&nbsp;<%=request.getParameter("quantity")%></h5>
<h5>Price of your selected items: &nbsp;&nbsp;

<%
int price=Integer.parseInt(request.getParameter("quantity"))*5;
out.println("$"+price);
%> 
</h5>

<h5>Type of milk:&nbsp;&nbsp; <%=request.getParameter("milk")%></h5>
<h5>Selected Flavors: </h5>

 <p>
<%
String[] shk=request.getParameterValues("flavor");
for(String temp2 : shk){
 out.println(temp2);
}
%>
</p></h5>

<h5><i>Only cash on delivery is available!!</i></h5>
<p id="demo"> </p> 

<h5>Coupon code:</h4><input id="myTextarea" type="text">

<button type="button" class="btn btn-info" onclick="myFunction()">Apply code</button>

<p id="demo">Coupon code: COUPON20<br>Coupon applicable on orders above $10 </p>

<script>
function myFunction()
{
    var x = document.getElementById("myTextarea").value;
   // document.getElementById("demo").innerHTML = x;
	
	if(x.toLowerCase()=="coupon20".toLowerCase())
	{
		
		document.getElementById("demo").innerHTML = "Coupon  applied successfully";
		
	}
		else
		{
			
			document.getElementById("demo").innerHTML = "Coupon not applied!";
		}
}
</script>

<h5>
<%	
	int p=Integer.parseInt(request.getParameter("quantity"))*5;
	double d;
	d=p-(p*0.20); 
	 if(p>=10)
		 out.println("Price with discount:  $"+d);
	else
		out.println("Price without discount:  $"+p);
	%></h5>
<br>

<form method="post" action="order.jsp"  onsubmit="redirect(this);">
   <input type="submit" class="btn btn-success" value="Submit">
</form>

</body>
</html>