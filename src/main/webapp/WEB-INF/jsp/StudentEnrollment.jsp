<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Student Enrollment</h2>
<c:url var="stAction" value="/insertSt"/>
<form:form action="${stAction}" method="post" modelAttribute="studentForm">
<table >
	<tr>
		<td>Student Name:</td>
		<td><form:input type="text" path="name"/><font color="red"><form:errors path="name"/></font></td>
		</tr>
		<tr>
		<td>Student Age:</td>
		<td><form:input type="text" path="age"/><font color="red"><form:errors path="age"/></font></td>
		</tr>
		<tr>
		<td>Address:</td>
		<td><form:input type="text" path="address"/><font color="red"><form:errors path="address"/></font></td>
		</tr>
		<tr>
		<td>Gender:</td>
		<td><form:radiobutton path="gender" value="male"/>Male
		<td><form:radiobutton path="gender" value="female"/>Female
		<font color="red"><form:errors path="gender"/></font></td>
		</tr>
		<tr>
		<td>Date of Birth:</td>
		<td><form:input type="date" path="dob"/>
		<font color="red"><form:errors path="dob"/></font></td>
		</tr>
		<tr>
		<td>Email:</td>
		<td><form:input type="email" path="email"/>
		<font color="red"><form:errors path="email"/></font></td>
		</tr>
		<tr>
		<td><input type="submit" value="Add Student"/>
		<td><input type="reset" value="Cancel"/>
		</td>
		
</table>
</form:form>
</body>
</html>