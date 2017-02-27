<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Courses</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</head>
<body>


<h5>Add courses for <%=request.getParameter("term")%>&nbsp; semester</h5><br><br>

Courses Enrolled are below:
<p>
<%
String[] lan=request.getParameterValues("course");
for(String temp : lan )
{
 out.println("<h5>" + temp + "<h5>");
 %> 
 <select name="dd">
 <option value="none">None</option>
  <option value="drop">Drop</option>
</select>

<% }	
%>
</p>
<form method="post" action="confirm.jsp"  onsubmit="redirect(this);">
   <input type="submit" class="btn btn-success" value="Register">
</form>
</body>
</html>