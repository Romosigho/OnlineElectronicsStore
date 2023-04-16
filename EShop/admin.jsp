<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<%@ taglib uri="/struts-tags" prefix="s" %>  
<html>
  <head>
    <meta http-equiv="contentType" content="text/html"; charset="UTF-8">
    <title>Online Electronics Store - Admin</title>
	<link rel="stylesheet" href="./style.css">
  </head>
<body>
<br>
<h1>Login as Admin</h1>
<br>
<hr>
<s:form action="ADloginAction">  
<s:textfield name="username" label="Username"></s:textfield>  
<s:password name="password" label="Password"></s:password>   
  
<s:submit value="Login"></s:submit>  
  
</s:form> 
<hr>

<div class="parent_div">
<a href="index.html"> <button class="button-m" role="button">Go Back</button></a>
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

 </body>
</html> 