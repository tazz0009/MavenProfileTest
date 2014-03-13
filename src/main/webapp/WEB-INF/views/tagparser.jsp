<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page contentType = "text/html;charset=utf-8" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8" />
	<title>SLiPP QUnit Test Suite</title>
	<link rel="stylesheet" media="screen" href="./resources/stylesheets/qunit.css">
	<script type="text/javascript" src="./resources/javascripts/qunit.js"></script>
	<script type="text/javascript" src="./resources/javascripts/tagparser.js"></script>
	<script type="text/javascript" src="./resources/javascripts/tagparser_test.js"></script>
</head>
<body>
	<h1 id="qunit-header">SLiPP QUnit Test Suite</h1>
	<h2 id="qunit-banner"></h2>
	<div id="qunit-testrunner-toolbar"></div>
	<h2 id="qunit-userAgent"></h2>
	<ol id="qunit-tests"></ol>
	<div id="qunit-fixture">test markup</div>
</body>
</html>
