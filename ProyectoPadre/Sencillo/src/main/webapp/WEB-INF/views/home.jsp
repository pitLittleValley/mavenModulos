<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p>This is the homepage!</p>
        
        <h2>List of Students</h2>  
	    <table>
	        <tr>
	            <td>NAME</td><td>Age</td><td></td><td></td><td></td>
	        </tr>
	        <c:forEach items="${students}" var="student">
	            <tr>
	            <td>${student.name}</td>
	            <td>${student.age}</td>	 
	            <td></td>           
	            <td><a href="<c:url value='/edit-${student.id}-student' />">Edit</a></td>
	            <td><a href="<c:url value='/delete-${employee.id}-student' />">Delete</a></td>
	            </tr>
	        </c:forEach>
	    </table>
    <br/>
    <a href="<c:url value='/new' />">Add New student</a>
    </body>
</html>
