<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="bootstrap.min.css">
<script type="text/javascript" src="bootstrap.min.js"></script>
<script type="text/javascript" src="jquery-3.3.1.min.js"></script>
</head>
<body>

<div class="container">
<h1>Login Screen</h1><hr>
<% if(request.getParameter("invalid")!=null){%>
<div class="alert-danger"> Invalid user id or password</div>
	
<% }%>
<form action="Login.do">

User id: <input name="userid"><br>
Password: <input type="password" name="password"><br>
<input type="submit" value="login">


</form>
</div>

</body>
</html>