<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Home Page</title>
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
        <link href="https://fonts.googleapis.com/css?family=Merriweather" rel="stylesheet">
    <style>
 h1{
    font-family: 'Merriweather', serif;
    }
    .a{
        margin-top: 60px;
        color:azure;
        
    }
    .bg-img {
background-image: url("image3.jpg");
height:100%;
width:100%;
background-repeat:round;
background-size:cover;
position:absolute;
}
.b{
    font-size:25px;
    text-align: center;
}
.btn{
font-size:20px;
color:rgb(228, 146, 39);
}
.fas{
    color:rgb(210, 247, 155);
    font-size: 110px;
    text-align: center;
}
.list{
    width:600px;
    background-color: rgba(0, 0, 0, 0.301);
 
}
.tab{
  margin-left:250px;
    justify-content: center;
    text-align:center;
}
.link{
    color: rgb(228, 146, 39);
    font-weight: bold;
}
.logout{
    color:rgb(228, 146, 39);
    /* background-color: rgba(0, 0, 0, 0.301); */
 
}
  </style>

<body>
<form action="/app/Home" method="GET">
    <div class="bg-img">
    <div class=" a container"style="text-align: center">
       <a href="login.jsp"class="logout" style="float:right">Log Out</a>
        <br>
        <br>
        
     <h1>
                <i class="fas fa-book-reader"></i>
        </h1>
        <br>
    
        <div class="tab">
                
            <a href="http://localhost:8080/app/resources/ViewAllPosts.jsp"class="link">View All Posts</a>
            <br>
            
         
           <a href="http://localhost:8080/app/resources/AddPost.jsp"class="link">Add a Post</a><br>
               
                  
               
                 <a href="http://localhost:8080/app/resources/EditPost.jsp"class="link">Edit Post</a><br>
              <a href="http://localhost:8080/app/resources/DeletePost.jsp"class="link">Delete a Post</a><br>
                 <a href="http://localhost:8080/app/resources/SearchPost.jsp"class="link">Search a Post</a><br>
              </div>
    </div>
</div>
</form>
</body>
</html>