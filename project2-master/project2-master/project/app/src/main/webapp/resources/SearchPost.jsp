<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
   <%@page import="java.util.List"%>
<%@page import="dao.PostDAOImpl"%>
<%@page import="model.Post"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Search Post</title>
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
    font-size:20px;
    text-align: center;
}
.btn{
font-size:20px;
        
}
    </style>

<body>
<form action="/app/SearchPost" method="GET">
    <div class="bg-img">
        <div class=" a container" style="text-align: center">
         <a href="login.jsp"class="logout" style="float:right">Log Out</a>
            <h1>
                Want to find a post?<br> Search here!!
            </h1>
            <br>

            <br>
            <input type="text" class=" b form-group" style="width:400px" placeholder="Enter id of the post to be searched"name="Post_id"><br>
            <br>
            <input type="submit"  value="search">
            <br>
            <br>
     <%
	PostDAOImpl pImpl = new PostDAOImpl();
		List<Post> postlist=(List<Post>) request.getAttribute("list");
		
	
	%>

	<div clas="container">
	<table class="table table-bordered">
		
	
		<tr>
			<th>User ID</th>
			<th>Post ID</th>
			<th>TITLE</th>
			<th>BODY</th>
		
			
		</tr>

		<%
		if(postlist!=null){
		for (Post post : postlist) {
		%>
		<tr>
		<td><%=post.getUser_id()%></td>
			<td><%=post.getPost_id()%></td>
			<td><%=post.getTitle()%></td>
			<td><%=post.getBody()%></td>
			
			
			
		</tr>
		<%
		}
			}
		%>
	</table>
       
       
        
    </div>
    </form>
</body>

</html>