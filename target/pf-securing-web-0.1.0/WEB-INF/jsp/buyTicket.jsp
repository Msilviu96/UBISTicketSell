<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
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
<title>UBIS</title>
<style>
ul.dropdown-content.select-dropdown li span {
	color: red; /* no need for !important :) */
	font-weight: bold;
}
.select-dropdown{
font-weight: bold;
}
</style>
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
				<li class="active"><a href="/buyTicket"><b>Buy Ticket</b></a></li>
				<li><a href="/myTickets"><b>My tickets</b></a></li>

			</ul>


			<a href="#" data-activates="nav-mobile" class="button-collapse"><i
				class="material-icons">menu</i></a>
		</div>
	</nav>
	<div class="section no-pad-bot" id="index-banner">
		<div class="container">
			<br> <br>
			<h1 class="header center black-text">Buy Ticket</h1>

			<form action="/ubis/buy_ticket" method="post">

				<div class="lc-block">

					<div class="input-field col s12">
						<select name="eventId" id="Events">
						</select>
					</div>
					<br>
					<br>
					<div class="center">
						<input class="waves-effect waves-light btn red" type="submit"
							value="Buy Ticket" class="button red small" />
					</div>

				</div>
				<input type="hidden" name="${_csrf.parameterName}"
					value="${_csrf.token}" />
			</form>

			<div class="row center"></div>
			<br> <br>

		</div>
	</div>




	<footer class="page-footer red" id="footer">

		<div class="footer-copyright">
			<div class="container">
				<div class="right">
					Made by <b>Munteanu Silviu Constantin</b>
					<sec:authentication property="principal.username" />
					
				</div>
			</div>
		</div>
	</footer>


	<!--  Scripts-->
	<script
		src="<c:url value="https://code.jquery.com/jquery-2.1.1.min.js"/>"></script>
	<script src="<c:url value="js/materialize.js"/>"></script>
	<script src="<c:url value="js/init.js"/>"></script>

	<script type="text/javascript" src="<c:url value="js/buyTicket.js" />"></script>

</body>
</html>
