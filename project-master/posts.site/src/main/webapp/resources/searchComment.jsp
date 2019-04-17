<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.List"%>
<%@page import="dao.CommentsDAOImpl"%>
<%@page import="model.Comments"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Comment</title>
  <style>
                button{
 text-align:center;
 width:50%;
 border-radius:10%;
 color:"white";
 
 letter-spacing: 4px;
 }
 
        button:hover {
            -webkit-transition: .5s all;
            -moz-transition: .5s all;
            -o-transition: .5s all;
            -ms-transition: .5s all;
            transition: .5s all;
            background: #8DC26F;
        }
        .wrap-login100 {
            width: 500px;
            border-radius: 10px;
            overflow: hidden;
            padding: 55px 55px 37px 55px;
            
            background: #0C202F;
        }
  .main-agileinfo {
            width: 50%;
            margin: 1em auto;
        }
        .main-w3layouts {
      padding: 1em 0 0;
    }
    .wrapper {
    position: relative;
    overflow: hidden;
  }
  .container{
    text-align:center;
margin-top:50px;
color:"white";
}
  button{
  width:35%;
  }
  .i{
  width:50%;
  }
  h1{
    
      color:white;
  }
  .form-group{
margin:30px;
text-align:center;
}
 </style>
</head>
<body>
<form action="/app/searchComment" method="get">
   <div class="container">
    <div class="main-w3layouts wrapper">

        <div class="main-agileinfo">


            <div class="wrap-login100" >
                    <h1>Search Comments</h1>
    
                    <form class="form-inline" >
  <div class="form-group" style="color:white">
    <label for="inputPassword6">Enter Post ID</label>
    <input type="text" id="inputPassword6"  style="text-align: center" name="pid" class="form-control mx-sm-3">

  </div>
  </form>
  <br>

<br>
<jsp:include page="footer.jsp"></jsp:include>
</div>
</div>
            <%
	CommentsDAOImpl cImpl = new CommentsDAOImpl();
		List<Comments> commentlist=(List<Comments>) request.getAttribute("list");
		
	
	%>
	<%
	if(commentlist!=null){
	%>

	<div clas="container">
	<table class="table table-bordered">
		
	
		<tr>
			<th>Comment ID</th>
			<th>Comment Body</th>
			<th>User ID</th>
			<th>Post ID</th>
			
		</tr>

		<%
		
		for (Comments c : commentlist) {
		%>
		
		<tr>
			<td><%=c.getCid()%></td>
			<td><%=c.getCbody()%></td>
			<td><%=c.getUid()%></td>
			<td><%=c.getPid()%></td>
			
			
		</tr>
		<%
		}
			}
		%>
             </div>
             <input type="submit" class="btn btn-primary btn-sm" value="Search">
    </div>
            
</form>
</body>
</html>