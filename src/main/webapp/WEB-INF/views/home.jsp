<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<style type="text/css">

@font-face {
   font-family: GmarketSansTTFMedium;
   src: url('/resources/css/font/GmarketSansTTFMedium.ttf');
}

.GmarketSansTTFMedium {
   font-family: "GmarketSansTTFMedium", serif;
}

</style>
</head>
<body>
<h1 class="GmarketSansTTFMedium">recipeCollection</h1>
	
	<div class="warp">
		
		${totalCount }
		${testList }
		
		
	</div>
	
</body>
</html>
