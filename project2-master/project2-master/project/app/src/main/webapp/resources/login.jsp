<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login Page</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
        crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf"
        crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">
    <style>
    body{
    background-image: url("img.png");
    }
        h1{
            font-family: 'Raleway', sans-serif;
	}
.a {
background-color:rgba(0, 0, 0, 0.103);
    color:black;
    font-weight: bolder;
	margin-left: 450px;
	margin-right: 450px;
	margin-top: 180px;
	padding-bottom: 100px;
	border-radius: 50px;
	padding-top: 0px;
}
.b{
border-radius:50px;
padding-top:10px;
}
.bg-img {
  background-image: url("login3.jpg");
height:100%;
width:100%;
background-repeat:round;
  background-size:cover;
  position:absolute;
}
.fas{
    font-size:25px;
}
.k{
    height: 35px;
    font-size: 17px;
}
.btn{
    color:white;
}
</style>
</head>

   

<body>
 <form action="/app/login" method="post">
    <div class="bg-img">
        <div class="a" style="text-align: center">
<div class="container">
 
            <h1 class="b">
                <i class="fas fa-user" style="font-size:100px"></i><br> Login
            </h1>
            <br> <br>

           
            
   <i class="fas fa-at" style="color:black"></i>
 <input type="text" class="k rounded-pill text-center" style="width: 250px" placeholder="enter user name" name="User_name">
                <br> <br>

                <input type="password" class=" k rounded-pill text-center " style="width: 250px" placeholder="enter password" name="Password">
                <br> <br><br>
                <input type="submit" value="login">
             <!--      <a href="Home.jsp">Login</a> -->
         
                  <a href="http://localhost:8080/app/resources/Signup.jsp">Sign Up</a>
          <!--    <input type="submit" value="signup" <a href="Home.jsp"></a>> -->
        </div>
    </div>
</div>
 </form>
</body>

</html>