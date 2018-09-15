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
<nav class="navbar navbar-inverse" style="background-color: black;color:white;opacity:1.0">
                <div class="container-fluid">
                  <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                      <span class="icon-bar"></span>
                      <span class="icon-bar"></span>
                      <span class="icon-bar"></span> 
                    </button>
                    <a class="navbar-brand" href="#">SuperHeroQuiz</a>
                  </div>
                  <div class="collapse navbar-collapse" id="myNavbar">
                    <ul class="nav navbar-nav">
                      <li ><a href="#">Home</a></li>
                      <li><a href="#">About Us</a></li>
                      <li><a href="#">Contact</a></li> 
                      <li><a href="#">Help</a></li> 
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                      <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
                      <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                    </ul>
                  </div>
                </div>
              </nav>
              <div class="container">
              
              <div>
            <span style="display:inline-block; width:50%;height:30% !important;width:49% !important">
            <h1>LOGIN FORM</h1><hr>
           <form action="user.quiz">
           <table>
           <tr> 
           <td><label> Email: </label></td> 
           <td><input type="text" name="email"></td> 
           </tr>
           
           <tr> 
           <td><label> Password: </label></td> 
           <td><input type="password" name="password"></td> 
           </tr>
           
           <tr> 
           <td><input type="submit" value="Submit"></td> 
           <td><input type="reset"></td> 
           </tr>
           
           
           </table>
           </form>
        </span>
        
               
        <span  style=" display: inline-block; height:30% !important;width:50% !important;position:absolute " >
                <img class="mySlides" src="images/Batman.jpg" style="width:100%">
                <img class="mySlides" src="images/ironman.jfif" style="width:100%">
                
                <img class="mySlides" src="images/spiderman.jfif" style="width:100%">
                <img class="mySlides" src="images/hulk.png" style="width:100%">
               
                <img class="mySlides" src="images/superman.jfif" style="width:100%">
                <img class="mySlides" src="images/deadpool.jpeg" style="width:100%">
        </span>
        
        </div>
              </div>
              
              <script>
                    var myIndex = 0;
                    carousel();
                    
                    function carousel() {
                        var i;
                        var x = document.getElementsByClassName("mySlides");
                        for (i = 0; i < x.length; i++) {
                           x[i].style.display = "none";  
                        }
                        myIndex++;
                        if (myIndex > x.length) {myIndex = 1}    
                        x[myIndex-1].style.display = "block";  
                        setTimeout(carousel, 2000); // Change image every 2 seconds
                    }
             </script>
        
<%@ include file="footer.html" %>

</body>
</html>

