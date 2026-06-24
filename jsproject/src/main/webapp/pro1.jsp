<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<H1 ALIGN="center">ELC Products</H1>
<%! 
    String item[] = {"DVD", "CD", "MOBILE"};
    double price[] = {19.99, 12.99, 2.00};
    int quantity[] = {2, 9, 24};
%>
<TABLE ALIGN="center" BGCOLOR="pink" BORDER="3" WIDTH="75%">
<TR><TD>Item</TD>
<TD>Price</TD>
<TD>Quantity</TD>
<TD>Total Price</TD>
</TR>
<% for (int i=0; i<3; i++) { %> 
      <TR><TD><%= item[i] %></TD>
      <TD><%= price[i] %></TD>
      <TD><%= quantity[i] %></TD>
      <TD><%= price[i] * quantity[i] %></TD>
      </TR>
<% } //end for loop %>
</body>
</html>