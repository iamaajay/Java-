<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.h1{
background-color: lime;
color: pink;
font-size: xx-large;
}
.form{
background-color: orange;
color: blue;
font-size: x-large;
margin-bottom: 1%;
margin-left: 40%;
margin-right: 40%;
margin-top: 3%;
}
</style>
</head>
<body>
<div class="h1">
<h1 align="center">Registration here</h1></div>
<div class="form">
<form action="registration" method="post">
<table border="0" align="center">
<tr><td>Name </td><td><input type="text" name="text1"></td></tr>
<tr><td><br>Email Id</td><td><br><input type="email" name="email1"></td></tr>
<tr><td><br>Mobile No</td><td><br><input type="tel" name="tel1"></td></tr>
<tr><td><br>DOB</td><td><br><input type="date" name="date1"></td></tr>
<tr><td></td><td><br><input type="submit" value="Save">    <input type="submit" value="Search"></td></tr>
</table>
</form>
</div>
<div class="href"><a href="login.jsp">Home Page Click Here
</div>
</body>
</html>