<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="lti.quiz.bean.QuizBean" %>
    <%@page import="lti.quiz.bean.OptionBean" %>
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

<jsp:include page="banner.jsp"/>

<h1> hello</h1>

<div class="container">
<h3 class="alert alert-info" style="text-align:center">Take this quiz.</h3>
<%	QuizBean quiz = (QuizBean) request.getAttribute("Question"); %>
<form action="quiz.quiz">
<h4><%= quiz.getQuestion() %></h4>
<%	for(OptionBean option : quiz.getOptions()) { %>
	<input type="radio" name="choice" value="<%=option.getScore()%>"><%= option.getOption() %><br>
<%	} %>
<input type="submit" value="Submit Answer" class="btn btn-info">
</form>
<br>
<%@ include file="footer.html" %>
</div>
</body>
</html>