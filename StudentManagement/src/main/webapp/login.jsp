<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style >
.h1{
background-color: gray;
padding: 2%;
margin:2%;
color: red;
font-size: xx-large;
}
.form{
background-color: pink;
color: light lime;
margin-bottom: 2%;
margin-left: 40%;
margin-right: 40%;
margin-top: 2%;
font-size: large;
}
</style>
</head>
<body>
<div class="h1">
<h1 align="center" >Student management System</h1>
</div>
<h1 align="center">Login Here</h1>
<div class="form">
<form action="login" method="post">
<table border="0" align="center">
<tr><td>Email Id</td><td><input type="email" name="email1" required></td></tr>
<tr><td><br>Password</td><td><br><input type="password" name="PWD" required></td></tr>
<tr><td></td><td><br><input type="submit" value="Login"></td></tr>
<tr><td></td><td><br><a href="registration.jsp">Registration Click Here</td></tr>
</table>

</form>
</div>
</body>
</html>