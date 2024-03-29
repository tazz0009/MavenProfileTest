<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page contentType = "text/html;charset=utf-8" %>
<html>
<head>
<meta charset="UTF-8" />
<link rel="stylesheet" media="screen" href="./resources/stylesheets/qunit.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.9/jquery.validate.js"></script>
<script type="text/javascript" src="./resources/javascripts/qunit.js"></script>
<script type="text/javascript" src="./resources/javascripts/slipp.js"></script>
<script type="text/javascript">
(function() {
	"use strict";
	
	Slipp.namespace("Utils");

	Slipp.Utils = function() {	    
	}
	
	Slipp.Utils.prototype = {
		validateByElement: function(validator, $element, value) {
		    $element.val(value);
			return validator.element($element);
		}
	};  
}());

$(document).ready(function() {
    var utils = new Slipp.Utils();
    
	test("Test Validation Pluglin", function() {
	    var options = {
            submitHandler: function(form) {
            	console.log('this is submit!');
            },
    		rules: {
    		    name: {
    		        required: true
    		    },
    		    email: {
    		        required: true,
    		        email: true
    			},
    			url: {
    		        required: true,
    		        number: true
    			}
    		},
    		messages: {
    		    name: {
    		        required: "이름을 입력하세요."
    		    },
    		    email: {
    				required: "이메일을 입력하세요.",
    				email: "이메일 형식에 맞지 않습니다."
    			},
    			url: {
    		        required: "url을 입력하세요.",
    		        number: "숫자만 넣으세요."
    			}
    		}	    	
	    };
	    
	    var validator = $("#commentForm").validate(options); 
	    $email = $("#cemail");
	    equal(utils.validateByElement(validator, $email), false);
	    equal(utils.validateByElement(validator, $email, "javajigi"), false);
	    equal(utils.validateByElement(validator, $email, "javajigi@gmail.com"), true);
	});
});
</script>
</head>
<body>
<h1 id="qunit-header">XLGames Login</h1>
<h2 id="qunit-banner"></h2>
<h2 id="qunit-userAgent"></h2>
<ol id="qunit-tests"></ol>
<div id="qunit-fixture"></div>
<br/>
<div>
	<form class="cmxform" id="commentForm" method="get" action="" novalidate="novalidate">
	 <fieldset>
	   <legend>A simple comment form with submit validation and default messages</legend>
	   <p>
	     <label for="cname">Name</label>
	     <em>*</em><input id="cname" type="text" name="name" size="25">
	   </p>
	   <p>
	     <label for="cemail">E-Mail</label>
	     <em>*</em><input id="cemail" type="text" name="email" size="25">
	   </p>
	   <p>
	     <label for="curl">URL</label>
	     <em>&nbsp; </em><input id="curl" name="url" size="25" value="">
	   </p>
	   <p>
	     <label for="ccomment">Your comment</label>
	     <em>*</em><textarea id="ccomment" name="comment" cols="22"></textarea>
	   </p>
	   <p>
	     <input class="submit" type="submit" value="Submit">
	   </p>
	 </fieldset>
	 </form>
</div>
</body>
</html>