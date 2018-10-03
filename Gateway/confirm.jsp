<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="<c:url value="/css/bootstrap.min.css" />">
<script src="<c:url value="/js/jquery.2.2.4.min.js" />"></script>
</head>
<body>
<%	String param = request.getParameter("status");
	if(param.equalsIgnoreCase("invalid")) { %>
		<h1 class="alert alert-danger">Sorry! Payment failed due to invalid card details.</h1>
<%	} else if(param.equalsIgnoreCase("insufficient")) { %>
		<h1 class="alert alert-warning">Sorry! Payment failed due to insufficient balance.</h1>
<%	} else if(param.equalsIgnoreCase("failed")) { %>
		<h1 class="alert alert-danger">Sorry! Payment failed, Please try again later.</h1>
<%	} else { %>
	<h1  class="alert alert-success">Payment successful</h1>
	<%	response.sendRedirect("saveorder.do"); %>
<%	} %>

<a href="index.jsp">Go back to home</a>
</body>
</html>