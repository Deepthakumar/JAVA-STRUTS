<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" >
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js" ></script>
</head>
<body>
<form action="book.do" method="post">
   <table>
       <tr>
          <th>Book ID</th>
          <td><input type="text" name="bid"></td>
        </tr>
        <tr>
          <th>Book Name</th>
          <td><input type="text" name="name"></td>
        </tr>
       <tr>
          <th>Price</th>
          <td><input type="text" name="price"></td>
        </tr>
         <tr>
        
          <th>Author Name</th>
          <td>
          <select name = "authourid">
                <c:forEach items="${Alist}" var="x">
                <option value="${x.authourid }">${x.name}</option> 
                </c:forEach>
               </select>
               </td>
          
        </tr>
        <tr>
          <th>Pages</th>
          <td><input type="text" name="pages"></td>
        </tr>
         
        <tr>
          <td><input type="submit" value="Store Person Data" class="btn btn-primary"></td>
        </tr>
        </table>
        <table class="table table-hover">
      <thead>
           <tr>
                <th>BookID</th>
                <th>Name</th>
                <th>Price</th>
                <th>AuthourID</th>
                <th>Pages</th>
               
               
            </tr>
      </thead>
       <tbody>
         <c:forEach items="${Blist}" var="y">
       <tr>
                <td> ${y.bid} </td>
                <td> ${y.name} </td>
                <td> ${y.price}</td>
                 <td> ${y.authourid}</td>
                  <td> ${y.pages}</td>
       </tr>
   </c:forEach>
       

   
   </tbody>
   </table>

</body>
</html>