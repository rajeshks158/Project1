<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>document</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="signup.css" />
    <script src="main.js"></script>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
        crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr"
        crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">
</head>
<style>
    body{
        font-family: 'Raleway', sans-serif;
    }
    .bg-img{
            background-image: url("login3.jpg");
            height:100%;
            width:100%;
            background-repeat:round;
  background-size:cover;
  position:absolute;
           }
         
    .reg{
    
	color:black;
	margin-left: 300px;
	margin-right: 300px;
	margin-top: 50px;
	padding-bottom: 20px;
    padding-top: 20px;
    border-radius: 50px;
    font-weight: bold;
    }
    .a{
        background-color:rgba(0, 0, 0, 0.103);
    color: black;
    font-weight:bolder;
	margin-left: 330px;
	margin-right: 330px;
	margin-top: 10px;
	padding-bottom: 20px;
    padding-top: 10px;
	border-radius: 50px;
    margin-bottom: 80px;
    }
    .newacc{
        color: rgb(38, 9, 201);
        
           }
           
          
           .fb{
               font-size: 30px;
           }
           .gm{
            font-size: 30px;
            color:red;
           }
           .gplus{
            font-size: 30px;
            color: maroon;
           }
           .g{
            font-size: 30px;
            color: crimson;
           }
           .github{
            font-size: 30px;
            color: black;
           }
           .email{
               font-size: 17px;
           }
           
      </style>

<body>

 <form action="/app/Signup" method="POST" >

 <div class="bg-img">
    <div class="container" style="text-align: center">
     <a href="login.jsp"class="logout" style="float:right">Log Out</a>
      
        <p class="reg display-4 text-center">Register with us!!</p>

    <div class="a" style="text-align: center">
        <br>

        <i class="fas fa-users" style="font-size:100px"></i>
        <br>
        <br>

       
             <div class="firstname form-group"style="font-size:19px" >
                <label for="User_name" style="font-size:20px" >User Name</label>
                <input type="text" class="rounded-pill text-center" id="username" placeholder="enter username" style="font-size:17px"name="User_name">
            </div>
            <div class="firstname form-group"style="font-size:19px" >
                <label for="Firstname" style="font-size:20px" >First Name</label>
                <input type="text" class="rounded-pill text-center" id="firstname" placeholder="enter firstname" style="font-size:17px"name="firstname">
            </div>

            <div class=" lastname form-group "style="font-size:20px">
                <label for="Lastname">Last Name</label>
                <input type="text" class="rounded-pill text-center"id="lastname" height="30px" width="100px"placeholder="enter lastname" style="font-size:17px"name="lastname">

            </div>
            
            <div class="form-group" style="font-size:20px" >
                <label for="Email">Email</label>
                <input type="text" class=" email rounded-pill text-center" style="margin-left:50px" id="Email"style="font-size:17px" placeholder="enter email" name="email">
            </div>

            <div class="form-group" style="font-size:20px" >
                <label for="Pwd">Password</label>
                <input type="password"class=" email rounded-pill text-center" style="margin-left:10px" id="Pwd"style="font-size:17px" placeholder="enter password" name="password">
            </div>


            <div class="form-group" style="font-size:20px">
                <label for="Confirm Password">Confirm Pwd</label>
                <input type="password"class=" email rounded-pill text-center"id="confirm password"style="margin-left:0px"placeholder="re-type your password" style="font-size:17px"name="confirmpassword">
            </div>
            <!-- <div class="col-auto">
                <div class="form-check mb-2">
                    <input class="form-check-input" type="checkbox" id="autoSizingCheck">
                    <label class="form-check-label" for="autoSizingCheck">
                        Remember me
                    </label>
                </div>
            </div> -->
             <!--  <a href="login.jsp" class="newacc" style="text-decoration:underline" style=" font-size:20px"> Register</a> -->
             <input type="submit" value="Register">
              &nbsp;
            <a href="login.jsp" class="newacc" style="text-decoration:underline" style=" font-size:20px"> Cancel</a>
            <br>
            <br>
            <div class="text-center ">
                <a href="Signup.jsp" class="newacc" style="text-decoration:underline"style=" font-size:20px">Create another account</p>
            </div>

            <div class="text-center">
                <a href="login.jsp" class="newacc" style="text-decoration:underline" style=" font-size:20px"> Already have an existing
                    account?Sign in</a>
            </div>
            <br>
            <div class="text-center">
                <a href="https://www.facebook.com/">
                    <span class="fb"> <i class="fab fa-facebook-f"></i></span></a>
                    &nbsp;
                <a href="https://mail.google.com/mail/">
                    <span class="gm"><i class="fas fa-envelope"></i></span></a>
                    &nbsp;
                <a href="https://plus.google.com/discover">
                    <span class="gplus"><i class="fab fa-google-plus-g"></i></span></a>
                    &nbsp;
                <a href="https://www.google.com/">
                    <span class="g"><i class="fab fa-google"></i></span></a>
                    &nbsp;
                <a href="https://github.com/datacharmer/test_db">
                    <span class="github"><i class="fab fa-github"></i></span></a>
            </div>
        </div>
        </div>
    </div>
</form>
</body>

</html>