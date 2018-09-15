<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@page import="lti.quiz.bean.RegisterBean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="bootstrap.min.css">
<script type="text/javascript" src="bootstrap.min.js"></script>
<script type="text/javascript" src="jquery-3.3.1.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<h1> SuperQuiz.com >> Invoke your inner hero.</h1>

<% RegisterBean user = (RegisterBean) session.getAttribute("USER"); 
if(user !=null){%>
<div> Welcome <%= user.getEmail() %> | <a href="user.quiz?logout=yes">Logout</a></div>
<% } else{ %>
<div> Welcome Guest</div>
<% } %>

</body>
</html>