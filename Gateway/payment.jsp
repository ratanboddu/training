<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Payment</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="<c:url value="/css/bootstrap.min.css" />">
<script src="<c:url value="/js/jquery.2.2.4.min.js" />"></script>
</head>
<body>
<div class="container" style="margin-top:50px">
<form action="http://192.168.100.172:8780/Fidelis27-Latest/process.go">
<input type="hidden" name="upi" value="9874563210@Fidelis">
<table class="table table-bordered">
	<tr><th colspan="2">Payment Gateway</th></tr>
	<tr><td>Amount</td>
		<td><input readonly name="amount" value="100"></td>
	</tr>
	<tr><td>Card No</td>
		<td><input name="card"></td>
	</tr>
	<tr><td>Pin</td>
		<td><input type="password" name="pin"></td>
	</tr>
	<tr><th colspan="2">
		<input type="submit" value="Make Payment">
	</th></tr>
</table>
</form>
</div>
</body>
</html>