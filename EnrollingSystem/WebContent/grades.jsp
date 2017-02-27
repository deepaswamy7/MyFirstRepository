<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Student Grades</title>
</head>
<body>
<h2>Calculate your grades</h2>
<form action="" method="post">
<table>
<tr>
<td></td>
<td>
Select Term <select name="term">
<option value="select">select</option>
<option value="spring">Spring</option>
<option value="summer">Summer</option>
<option value="fall">Fall</option>
</select><br><br>
</td>
</tr>
</table>
<table>
<tr>
<th>Course</th>
<th>Obtained Marks</th>
<th>Total Marks</th>
</tr>
<tr>
<td align="center">Course 1</td>
<td align="center"><input type="text" size="3"  pattern="[0-9]{2,3}" name="course1" required/></td>
<td align="center">100</td>
</tr>
<tr>
<td align="center">Course 2</td>
<td align="center"><input type="text" size="3"  pattern="[0-9]{2,3}" name="course2" required/></td>
<td align="center">100</td>
</tr>
<tr>
<td align="center">Course 3</td>
<td align="center"><input type="text" size="3"  pattern="[0-9]{2,3}" name="course3" required/></td>
<td align="center">100</td>
</tr>

<tr>
<td></td>
</tr>
<tr>
<td></td>
</tr>
<tr><td></td><td align="center"><input type="submit" value="submit"/></td></tr>
</table>
</form>
<%
String c1 = request.getParameter("course1");
String c2 = request.getParameter("course2");
String c3 = request.getParameter("course3");

if(!(c1 == null || c1.isEmpty()))
{
    int c1marks = Integer.parseInt(c1);
    int c2marks = Integer.parseInt(c2);
    int c3marks = Integer.parseInt(c3);

    int total = c1marks+c2marks+c3marks;
    int avg = (total)/3;
    int percent = avg;
    String grade ="";

    if(percent>=90 && percent<=100){
        grade = "A";
        //request.setAttribute("grade", grade);
    }
    else if(percent >= 80 && percent <=89){
        grade = "B";
    }
    else if(percent >=70 && percent <=79){
        grade = "C";
    }
    else if(percent >=60 && percent <=69){
        grade = "D";
    }
    else if(percent >=50 && percent<=59){
        grade = "E";
    }
    else if(percent <=49){
        grade = "F";
    }
    request.setAttribute("Grade", grade);
    %>    
    <table>
    <tr>
    <td><b>Course</b></td><td></td>
    <td align="center"><%=request.getParameter("term") %>
    </tr>
    <tr>
    <td><b>Aggregate Marks</b></td><td></td>
    <td align="center"><%=total %></td>
    </tr>
    <tr>
    <td><b>Grade</b></td><td></td>
    <td align="center"><%=grade %></td>    
    </tr>
    </table>
    <%    
}
%>

</body>
</html>
