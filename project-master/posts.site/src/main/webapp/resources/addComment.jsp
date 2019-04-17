<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  <meta name="Generator" content="EditPlus®">
  <meta name="Author" content="">
  <meta name="Keywords" content="">
  <meta name="Description" content="">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
 <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">

  <title>Add Comment</title>
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
margin-top:100px;
padding:80px;

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

  i{
  color:"blue";
  }
 </style>
 </head>
 <body>
	<form action="/app/addComment" method="post">
		<div class="container">
			<div class="main-w3layouts wrapper">

				<div class="main-agileinfo">


					<div class="wrap-login100">
						<h1>Comment Here</h1>

						<form class="form-inline">


<!-- 							<div class="input-group input-group-lg"> -->
<!-- 								<div class="input-group-prepend"> -->
<!-- 									<span class="input-group-text" id="inputGroup-sizing-lg">Comment -->
<!-- 										Id</span> -->
<!-- 								</div> -->
<!-- 								<input type="text" class="form-control" name="cid" -->
<!-- 									aria-label="Sizing example input" -->
<!-- 									aria-describedby="inputGroup-sizing-lg"> -->
<!-- 							</div> -->

<!-- 							<br> <br> -->


							<div class="input-group input-group-lg">
								<div class="input-group-prepend">
									<span class="input-group-text" id="inputGroup-sizing-lg">Comment
										Body</span>
								</div>
								<input type="text" class="form-control" name="cbody"
									aria-label="Sizing example input"
									aria-describedby="inputGroup-sizing-lg">
							</div>

							<br> <br>

							<div class="input-group input-group-lg">
								<div class="input-group-prepend">
									<span class="input-group-text" id="inputGroup-sizing-lg">User
										ID</span>
								</div>
								<input type="text" class="form-control" name="uid"
									aria-label="Sizing example input"
									aria-describedby="inputGroup-sizing-lg">
							</div>

							<br> <br>

							<div class="input-group input-group-lg">
								<div class="input-group-prepend">
									<span class="input-group-text" id="inputGroup-sizing-lg">Post
										ID</span>
								</div>
								<input type="text" class="form-control" name="pid"
									aria-label="Sizing example input"
									aria-describedby="inputGroup-sizing-lg">
							</div>
						</form>

						<br> <br> <input type="submit"
							class="btn btn-primary btn-sm" value="Add Comment"> <br>
						<a href="footer"></a>|

					</div>
				</div>
			</div>
		</div>
	</form>
</body>
</html>
    