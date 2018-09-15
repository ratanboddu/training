<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<h1> Change your Password</h1>
<hr>
<form action="user.quiz">
            <div >
                <table align=center cellspacing="4px" width=80%>
               

                <tr><td >Email: </td>
                    <td><input  class="space" type= "email" name="email" placeholder="something@company.domain" 
                        required="" type= "email" pattern= "[a-z0-9._%+-]+@[a-z0-9]+\.[a-z]{2,3}$"></td></tr>

               <tr><td >New Password: </td>
                    <td><input type="password" name="password"></td></tr>
                    
                     <tr><td >Confirm Password: </td>
                    <td><input type="password" ></td></tr>
                    
                <tr><td><input  type= "submit" class="button button1" value="submit" ></td>
                <td> <input type="reset"></td>
                </tr>
            </div>
            
        </form>

</body>
</html>