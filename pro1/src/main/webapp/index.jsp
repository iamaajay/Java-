<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>MCA MCA</h2>

<table border="4" align="center">
<form action=index.jsp></form>
<tr><td><h2>ABES-EC</h2></td><td><h1>Login Page MCA Department</h1></td></tr><br>
<tr><td>User Name</td><td><input type="text" name="name" id="name" required></td></tr>
<tr><td>Password</td><td><input type="password" name="password" id="password" required></td></tr>
<tr><td>Click</td><td><input type="submit" value="Login"></td></tr>
</table>
<%
String name="Ajay" ;
int len=name.length();
int x=12;
int y=10;
int z=x+y;

%>
<%=z %>

<%=len %>
<%=name %>
</body>
</html>