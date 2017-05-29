<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link href="<spring:url value="css/app.css" />" rel="stylesheet"
	type="text/css">
<script type="text/javascript" src="<c:url value="js/date.js" />"></script>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
<script type="text/javascript" src="<c:url value="js/date.js" />"></script>

<script type="text/javascript" src="<c:url value="js/myTickets.js" />"></script>

<title>UBIS Tickets Sell</title>
</head>
<body class="security-app">
	<div class="lc-block">
		<h1>Welcome!</h1>


		<h3>All events:</h3>

		<div id="tickets"></div>


	</div>
</body>
</html>