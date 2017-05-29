<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1.0" />
<title>Starter Template - Materialize</title>

<!-- CSS  -->
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<link href="<c:url value="css/materialize.css"/>" type="text/css"
	rel="stylesheet" media="screen,projection" />
<link href="<c:url value="css/style.css"/>" type="text/css"
	rel="stylesheet" media="screen,projection" />
</head>
<body>
	<nav class="red " role="navigation">
		<div class="nav-wrapper container">
			<a id="logo-container" href="#" class="brand-logo">UBIS Tickets
				Sell</a>
			<ul class="right hide-on-med-and-down">
				<li><a href="/"><b>Home</b></a></li>
				<li><a href="/buyTicket"><b>Buy Ticket</b></a></li>
				<li><a href="/myTickets"><b>My tickets</b></a></li>
				<li><i class="material-icons left">perm_identity</i><%=session.getAttribute("user")%></li>

			</ul>


			<a href="#" data-activates="nav-mobile" class="button-collapse"><i
				class="material-icons">menu</i></a>
		</div>
	</nav>
	<div class="section no-pad-bot" id="index-banner">
		<div class="container">
			<br> <br>
			<h1 class="header center black-text">Starter Template</h1>
			<div class="row center">
				<h5 class="header col s12 light">A modern responsive front-end
					framework based on Material Design</h5>
			</div>
			<div class="row center">
				<a href="http://materializecss.com/getting-started.html"
					id="download-button"
					class="btn-large waves-effect waves-light black">Get Started</a>
			</div>
			<br> <br>

			<div class="row">
				<div class="col s12 m6">
					<div class="card">
						<div class="card-image">
							<img
								src="https://felix.vatuiu.com/wp-content/uploads/2016/02/dev_experience-2016.png">
							<span class="card-title">Card Title</span>
							<p>I am a very simple card. I am good at containing small
								bits of information. I am convenient because I require little
								markup to use effectively.</p>
						</div>
						<div class="card-action">
							<a href="#">This is a link</a> <a href="#">This is a link</a>
						</div>
					</div>
				</div>
				<div class="col s12 m6">
					<div class="card">
						<div class="card-image waves-effect waves-block waves-light">
							<img class="activator"
								src="https://felix.vatuiu.com/wp-content/uploads/2016/02/dev_experience-2016.png">

						</div>
						<div class="card-content">
							<span class="card-title activator grey-text text-darken-4">Card
								Title<i class="material-icons right">more_vert</i>
							</span>
						</div>
						<div class="card-action">
							<a href="#">Cancel ticket</a>
						</div>
						<div class="card-reveal">
							<span class="card-title grey-text text-darken-4">Card
								Title<i class="material-icons right">close</i>
							</span>
							<p>Here is some more information.</p>
						</div>
					</div>
				</div>
			</div>





		</div>
	</div>




	<footer class="page-footer red" id="footer">

		<div class="footer-copyright">
			<div class="container">
				<div class="right">
					Made by <b>Munteanu Silviu Constantin</b>
				</div>
			</div>
		</div>
	</footer>


	<!--  Scripts-->
	<script
		src="<c:url value="https://code.jquery.com/jquery-2.1.1.min.js"/>"></script>
	<script src="<c:url value="js/materialize.js"/>"></script>
	<script src="<c:url value="js/init.js"/>"></script>

</body>
</html>
