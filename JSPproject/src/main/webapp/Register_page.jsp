<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
<!-- CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link
	href="C:\Users\tech\Desktop\ServletWorkspace\JSPproject\src\main\webapp\CSS\Mystyal.css"
	rel="stylesheet" type="text/css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script src='https://kit.fontawesome.com/a076d05399.js'
	crossorigin='anonymous'></script>

</head>
<body>

	<main class=" d-flex align-items-center bg-lightblue ">
		<div class="container"  >
			<div class="row">
				<div class="col-md-4 offset-md-4" >
					<div class="card " style="padding: 2px">
						<div class="card-header text-center" >
							<span class='fas fa-user-circle' style='font-size:36px'></span>
							<p>Register here</p>
						</div>
						<div class="card body">
						
						<form>
						
								<div class="form-group" style="padding: 2px">
									<label for="exampleInputEmail1">User Name</label> <input
										type="email" class="form-control" id="User_Name"
										aria-describedby="emailHelp" placeholder="Enter Name">
								</div>
						
								<div class="form-group" style="padding:2px">
									<label for="exampleInputEmail1">Email address</label> <input
										type="email" class="form-control" id="exampleInputEmail1"
										aria-describedby="emailHelp" placeholder="Enter email">
									<small id="emailHelp" class="form-text text-muted">We'll
										never share your email with anyone else.</small>
								</div>
								
								<div class="form-group" style="margin-left:2px ">
								<label class="gender"> Select Gender</label>
								<br>
								<input type="radio" id="gender" name="gender">Male
								<input type="radio" id="gender" name="gender">Female
								</div>
								
								<div class="form-group">
								<textarea name="about" class="form-control" rows="10" cols="30" placeholder="Enter about your self"></textarea>
								</div>
								
								
								<div class="form-group" style="padding:2px" >
									<label for="exampleInputPassword1">Password</label> <input
										type="password" class="form-control"
										id="exampleInputPassword1" placeholder="Password">
								</div>
								
								
								<div class="form-check" style="margin-left:2px " >
									<input type="checkbox" class="form-check-input"
										id="exampleCheck1"> <label class="form-check-label"
										for="exampleCheck1">Agree T&C</label>
								</div>
								
								<button type="submit" class="btn btn-primary" style="margin:2px; ">Submit</button>
							</form>
							
						</div>
						
					</div>

				</div>

			</div>

		</div>

	</main>



<!--JS-->
	<script type="text/javascript"
		src="C:\Users\tech\Desktop\ServletWorkspace\JSPproject\src\main\webapp\JS\Myjs.js"></script>

	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
	<script src="https://code.jquery.com/jquery-3.6.1.min.js"
		integrity="sha256-o88AwQnZB+VDvE9tvIXrMQaPlFFSUTR+nldQm1LuPXQ="
		crossorigin="anonymous"></script>


</body>
</html>