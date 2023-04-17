<%--
  Created by IntelliJ IDEA.
  User: suren
  Date: 17/04/23
  Time: 12:14 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>This is Loan Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>
<form action="insertlona" method="post">
    <div class="form-group">
        <label for="exampleInputEmail1">Name</label>
        <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Name" name="name">
    </div>
    <div class="form-group">
        <label for="exampleInputPassword1">Address</label>
        <input type="text" class="form-control" id="exampleInputPassword1" placeholder="Address" name="address">
    </div>
    <div class="form-group">
        <label for="exampleInputPhoneNumber">PhoneNumber</label>
    <input type="text" class="form-control" id="exampleInputPhoneNumber" placeholder="PhoneNumber" name="phoneNumber">
    </div>

    <div class="form-group">
        <label for="exampleInputloanamount">LoanAmount</label>
        <input type="text" class="form-control" id="exampleInputloanamount" placeholder="LoanAmount" name="LoanAmount">
    </div>

    <div class="form-group">
        <label for="exampleInputTime">LoanTime</label>
        <input type="text" class="form-control" id="exampleInputTime" placeholder="LoanTime" name="tenure">
    </div>

    <div class="form-check">
        <input type="checkbox" class="form-check-input" id="exampleCheck1">
        <label class="form-check-label" for="exampleCheck1">Check me out</label>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
<footer>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</footer>
</html>
