<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<%@ taglib uri="/struts-tags" prefix="s" %>  
<html>
  <head>
    <meta http-equiv="contentType" content="text/html"; charset="UTF-8">
    <title>Online Electronics Store</title>
	<link rel="stylesheet" href="./style.css">
  </head>
<body>
<br>
<h1>Login as Existing User</h1>
<br>
<hr>
<s:form action="loginAction">  
<s:textfield name="username" label="Username"></s:textfield>  
<s:password name="password" label="Password"></s:password>
<s:textfield name="shipping" label="Shipping Address"></s:textfield>
<s:textfield name="paymethod" label="Payment Method"></s:textfield>   
  
<s:submit value="Login"></s:submit>  
  
</s:form> 
<hr>
 </body>
</html> 