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
<% RegisterBean user = (RegisterBean) session.getAttribute("USER"); %>

<body >

<jsp:include page="banner.jsp"/>

<h2> Email : <%= user.getEmail() %></h2>
<img src="<%= user.getProfile() %>" height="200" width="200">
<hr>
<h2>Ever wondered which Super Hero you are ! !</h2>
<a href="quiz.quiz" class="btn btn-info"> Take Quiz to discover</a>

</body>
</html>