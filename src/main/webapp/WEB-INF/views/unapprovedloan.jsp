<%--
  Created by IntelliJ IDEA.
  User: suren
  Date: 17/04/23
  Time: 12:58 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ page isELIgnored="false" %>
<html>
<head>
  <title>ApprovedTable</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>
<table class="table">
  <thead class="thead-dark">
  <tr>
    <th scope="col">ID</th>
    <th scope="col">Full name</th>
    <th scope="col">address</th>
    <th scope="col">phoneNumber</th>
    <th scope="col">LoanAmount</th>
    <th scope="col">Time</th>
    <th scope="col">Action</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach var="loan" items="${loan_list}">
    <tr>
      <td>${loan.id}</td>
      <td>${loan.name}</td>
      <td>${loan.address}</td>
      <td>${loan.phoneNumber}</td>
      <td>${loan.loanAmount}</td>
      <td>${loan.tenure} years</td>
      <td><a href="editEmployee/${loan.id}" class="btn btn-warning">Approve</a></td>
    </tr>
  </c:forEach>
  </tbody>
  ${message}
</table>

</body>
<footer>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</footer>
</html>
