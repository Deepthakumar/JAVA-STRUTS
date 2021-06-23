<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" >
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js" ></script>

</title>
</head>
<body>
<div class="alert alert-info">
   <h3>Number of requests made in this session ::${sessionScope.count}</h3>
   <h3>Number of requests made since server start ::${applicationScope.count}</h3>
</div>
<tbody>
         <c:forEach items="${peoplelist}" var="x">
       <tr>
                <td> ${x.empId} </td>
                <td> ${x.name} </td>
                <td> ${x.city}</td>
                 <td> ${x.designation}</td>
       </tr>
       <form action="person.do" method="post">
<table>
       <tr>
          <th>EmpId</th>
          <td><input type="text" name="empID"></td>
        </tr>
        <tr>
          <th>Name</th>
          <td><input type="text" name="name"></td>
        </tr>
       <tr>
          <th>City</th>
          <td><input type="text" name="city"></td>
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
       
   </c:forEach>
   </tbody>
   </table>
  
</form>

       

       

</body>
</html>