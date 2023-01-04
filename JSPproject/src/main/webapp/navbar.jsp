<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Navbar</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="index.jsp"><span class="fa fa-asterisk"></span> Techblog </a>
		<!--  <span class="fa fa-asterisk"> use for add icone -->
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active">
				<a class="nav-link" href="#"><span
						class="fa fa-book"></span> Learn Code <span class="sr-only">(current)</span></a>
				</li>

				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> <span class="fa fa-anchor"></span>
						Categories
				</a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="https://www.javatpoint.com/"><span
							class="fa fa-location-arrow"></span> Programming Language</a> <a
							class="dropdown-item"
							href="https://www.geeksforgeeks.org/computer-science-projects/"><span
							class="fa fa-location-arrow"></span> Project Implementation</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="https://www.programiz.com/dsa"><span
							class="fa fa-location-arrow"></span> Data structure/Algorithm</a>
					</div></li>
				<li class="nav-item"><a class="nav-link" href="#"><span
						class="	fa fa-address-book"></span> Contact</a></li>
				
	<a class="nav-link" href="login_page.jsp"><span class="fa fa-user-circle-o"></span> Login </a>
		<a class="nav-link" href="Register_page.jsp"><span class="fa fa-user-plus"></span> Signup </a>
				
				</ul>
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="search"
					placeholder="Search" aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			</form>
		</div>
	</nav>
</body>
</html>