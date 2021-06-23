<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.*"%>
<%@page import="com.servlet2.DetailsPerson" %>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" >
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js" ></script>
</head>
<body>
<form action="person.do" method="post">
   <table>
       <tr>
          <th>EmpID</th>
          <td><input type="text" name="EmpId"></td>
        </tr>
        <tr>
          <th>Name</th>
          <td><input type="text" name="Name"></td>
        </tr>
       <tr>
          <th>City</th>
          <td><input type="text" name="City"></td>
        </tr>
         <tr>
          <th>Designation</th>
          <td><input type="text" name="designation"></td>
        </tr>
        <tr>
          <td><input type="submit" value="Store Person Data" class="btn btn-primary"></td>
        </tr>
        </table>
        <table class="table table-hover">
      <thead>
           <tr>
                <th>EmpID</th>
                <th>Name</th>
                <th>City</th>
                <th>Designation</th>
            </tr>
      </thead>
       <tbody>
         <c:forEach items="${peoplelist}" var="x">
       <tr>
                <td> ${x.empId} </td>
                <td> ${x.name} </td>
                <td> ${x.city}</td>
                 <td> ${x.designation}</td>
       </tr>
   </c:forEach>
       

   
   
    <%
       List<DetailsPerson> list=(List<DetailsPerson>) request.getAttribute("peoplelist");
       for(DetailsPerson x:list)
       {
   %>
      <tr>
       <td> <%=x.getEmpId()%></td>
       <td> <%=x.getName()%></td>
       <td> <%=x.getCity()%></td>
       <td> <%=x.getDesignation()%></td>
       </tr>
       <%} %>
   </tbody>
   </table>

 
  
  
</form>

</body>
</html>