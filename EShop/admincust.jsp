<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<%@ taglib uri="/struts-tags" prefix="s" %>  
<html>
  <head>
  <%@page import="java.sql.DriverManager"%>
  <%@page import="java.sql.ResultSet"%>
  <%@page import="java.sql.Statement"%>
  <%@page import="java.sql.Connection"%>
    <meta charset="UTF-8">
    <title>Online Electronics Store - Admin</title>
	<link rel="stylesheet" href="./style.css">
  </head>
  <body>
  <%
    String driver = "com.mysql.jdbc.Driver";
    String connectionUrl = "jdbc:mysql://localhost:3306/";
    String database = "estore";
    String userid = "root";
    String password = "root";
 
    try
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
	Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
  %> 
<h1>Customer Search Results</h1>
<table border="1">
<tr>
<td>ID</td>
<td>Username</td>
<td>Password</td>
<td>Shipping</td>
<td>Payment Method</td>

</tr>

<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from user";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr>
<td><%=resultSet.getString("ID") %></td>
<td><%=resultSet.getString("username") %></td>
<td><%=resultSet.getString("password") %></td>
<td><%=resultSet.getString("shipping") %></td>
<td><%=resultSet.getString("paymethod") %></td>
</tr>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
<div class="parent_div">
<a href="admintasks.html"> <button class="button-m" role="button">Go Back</button></a>
<div class="parent_div">
  </body>
  
  <style>
  .parent_div {
position: absolute;
bottom: 5px;
width: 100%;
}
.parent_div input {
margin: 0 auto;
}
</style>
  
  </html>