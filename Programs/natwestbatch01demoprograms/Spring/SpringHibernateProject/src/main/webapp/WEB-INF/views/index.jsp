<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>User App</title>
  </head>
  <body>
  <form method="post" action="addUser">
  
  <div class="form-group">
    <label for="exampleInputName">Name</label>
    <input type="text" class="form-control" id="exampleInputName" name="name">
  </div>
  
  <div class="form-group">
    <label for="exampleInputEmail">Email</label>
    <input type="email" class="form-control" id="exampleInputEmail" name="email">
  </div>
  
  <div class="form-group">
    <label for="exampleInputCity">City</label>
    <input type="text" class="form-control" id="exampleInputCity" name="city">
  </div>
  <button type="submit" class="btn btn-primary">Add</button>
</form>
  
  
  <table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">Name</th>
      <th scope="col">City</th>
      <th scope="col">Email</th>
       <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach var="user" items="${userList}">
    <tr>
      <th scope="row">${user.name}</th>
      <td>${user.city}</td>
      <td>${user.email}</td>
      <td><div class="btn-group" role="group" aria-label="Basic example">
      <a href="<c:url value="/deleteUser/${user.email}"/>">
      <button type="button" class="btn btn-danger">Delete</button></a>
     </div></td>
    </tr>
    </c:forEach>
    </tbody>
    </table>


    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>


  </body>
</html>