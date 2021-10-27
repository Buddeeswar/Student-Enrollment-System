<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
h1{text-align:center;}
table{margin-left:auto;margin-right:auto;}
table,tr,th,td{border:1px solid black;}
</style>
<script>
function deleteStudent(id){
	if(confirm("do you want to delete Student?")){
		var url="deleteSt/" + id;
		window.location.href=url;
	}
}

</script>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
<h1 >Employee Details</h1>
<table >
<tr>
    <th>Employee Id</th>
    <th>Name</th>
    <th>Age</th>
    <th>Address</th>
    <th>Gender</th>
    <th>Date of Join</th>
    <th>Email</th>
    <th>Action</th>
    
</tr>
<c:forEach items="${stList}" var="s">
<tr>
    <td>${s.stid}</td>
    <td>${s.name}</td>
    <td>${s.age}</td>
    <td>${s.address}</td>
    <td>${s.gender}</td>
    <td>${s.dob}</td>
    <td>${s.email}</td>
       <td><a href="<c:url value='/fetchById/${ s.stid}'/>">Edit</</a></td>
    
        <td><a href="<c:url value='/deleteSt/${ s.stid}'/>">Delete</</a></td>
    
</tr>
</c:forEach>
</table>
</body>
</html>