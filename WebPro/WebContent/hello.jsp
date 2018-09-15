<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<body>
<fmt:setLocale value="${param.loc }" />
<fmt:setBundle basename="labels" />

<h1><fmt:message key="greeting" /> !</h1><hr>
<h2><fmt:message key="welcome" /></h2>
<h2><fmt:message key="date" />: <%=LocalDate.now()%></h2>

<%! int visitor=1200; %>
<h2><fmt:message key="count" />: <%= visitor++ %> </h2>

<hr>
<a href="hello.jsp?loc=en">English</a> | <a href="hello.jsp?loc=hi">Hindi</a> | 
<a href="hello.jsp?loc=fr">French</a> | <a href="hello.jsp?loc=sp">Spanish</a>

</body>
</html>