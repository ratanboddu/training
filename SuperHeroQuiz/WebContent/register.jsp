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
<style>
body{
    background: url("images/a+j1.jfif") no-repeat fixed center; 
    background-size: 100%;
}
</style>
</head>
<body>

<jsp:include page="banner.jsp"/>

<div class="container">

<h1 style="color:white">Registration Form</h1>
        <form action="user.quiz">
            <div id = "form1">
                <table align=center cellspacing="4px" width=80%>
               

                <tr><td style="color:white;">Email: </td>
                    <td><input  class="space" type= "email" name="email" placeholder="something@company.domain" 
                        required="" type= "email" pattern= "[a-z0-9._%+-]+@[a-z0-9]+\.[a-z]{2,3}$"></td></tr>

                <tr><td style="color:white;">Favourite SuperHero: </td>
                    <td><input type= "text" placeholder="Favourite SuperHero:" name="superhero" class="space"></td></tr>
               
               

                <tr><td style="color:white;">Password: </td>
                    <td><input  class="space" placeholder="Enter Password" type= "password" name="password" 
                    ></td></tr>
                </table>
                <input style="margin-left: 200px" type= "submit" class="button button1" value="submit" >
            </div>
          
        </form>
        </div>

</body>
</html>