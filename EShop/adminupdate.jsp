<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<%@ taglib uri="/struts-tags" prefix="s" %>  
<html>
  <head>
  <%@page import="java.sql.DriverManager"%>
  <%@page import="java.sql.ResultSet"%>
  <%@page import="java.sql.Statement"%>
  <%@page import="java.sql.Connection"%>
  <%@page import="java.sql.PreparedStatement"%>
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
    int ID = Integer.parseInt(request.getParameter("ID"));
	int quantity = Integer.parseInt(request.getParameter("quantity"));
	
    try
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
	Connection connection = null;
    ResultSet resultSet = null;
  %> 

<div class="center">
<h4>Inventory Update Successful</h4>
</div class="center">

<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
String sql = "update products set quantity ='"+quantity+"' where ID ='"+ID+"'";
PreparedStatement ps = connection.prepareStatement(sql);
int res = ps.executeUpdate();
if(res != 0){

}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
<div class="parent_div">
<a href="adminprod.jsp"> <button class="button-m" role="button">Go Back</button></a>
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

<style>
.center {
  margin: auto;
  width: 50%;
  border: 3px solid green;
  padding: 10px;
}
</style>
  
  </html>