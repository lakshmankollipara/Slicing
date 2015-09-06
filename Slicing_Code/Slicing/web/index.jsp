<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%
    String msg = request.getParameter("msg");
%>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Information</title>


  	<link rel="stylesheet" href="css/style.css" type="text/css" media="screen" />
  	<link rel="stylesheet" href="css/slide.css" type="text/css" media="screen" />
	
<center>
    <span style="font-size: 40px"><h1>Welcome to Anonymized Data Publishing</h1>
        </br><h1> Slicing</h1></span>
				
			</center>
			<div class="left">
                                <center>
                                <form class="clearfix" action="<%=web.Resource.getMyUrl()%>Signin" method="post">
                                </br><h2>Employee Login</h2>
					<label class="grey" for="log">Username:</label>
					<input class="field" type="text" name="log" id="log" value="" size="23" /></br>
					<label class="grey" for="pwd">Password:</label>
					<input class="field" type="password" name="pwd" id="pwd" size="23" /></br>
	           
        			<div class="clear"></div>
					<input type="submit" name="submit" value="Login" class="bt_login" />
                                </center>
				</form>
			</div>
			<div class="left right"><center>			
			
				<form action="<%=web.Resource.getMyUrl()%>registration.jsp" method="post">
                                </br><h2>Not a member yet? Sign Up!</h2>				
					<label class="grey" for="signup">Username:</label>
					<input class="field" type="text" name="signup" id="signup" value="" size="23" /></br>
					<label class="grey" for="email">Email:</label>
					<input class="field" type="text" name="email" id="email" size="23" /></br>					
					<input type="submit" name="submit" value="Register" class="bt_register" />
				</form> </center>
			</div>
		</div>	
<style type="text/css">
<!--

body {
	background-color: #EDEDED;
        background: url(images/<%=web.Resource.getBackGround()%>) repeat 0 0;
	font-family: Helvetica, Arial, sans-serif;
	font-size: 13px;
	margin: 0px;
	padding: 0px;
}

div#content {
	width: 1024px;
	margin: 50px auto 0px auto;
	text-align: center;
}

#bubble {
	list-style: none;
	margin: 0px;
	padding: 0px;
}
#bubble li {
	display: inline-block;
	margin: 0px;
	padding: 0px;

}

#bubble li a.icon {
	background: url(images/sprites.png) no-repeat;
	border: none;
	display: block;
	width: 128px;
	height: 128px;
	text-indent: -9999px;
}

#bubble li a.feed {
	background-position: -139px -12px;
}
#bubble li a.feed:hover {
	background-position: -13px -12px;
}
#bubble li a.email {
	background-position: -139px -149px;
}
#bubble li a.email:hover {
	background-position: -13px -149px;
}
#bubble li a.twitter {
	background-position: -139px -283px;
}
#bubble li a.twitter:hover {
	background-position: -13px -283px;
}
#bubble li a.facebook {
	background-position: -139px -422px;
}
#bubble li a.facebook:hover {
	background-position: -13px -422px;
}
#bubble li a.delicious {
	background-position: -139px -559px;
}
#bubble li a.delicious:hover {
	background-position: -13px -559px;
}
#bubble li a.technorati {
	background-position: -139px -698px;
}
#bubble li a.technorati:hover {
	background-position: -13px -698px;
}





#bubble2 {
	list-style: none;
	margin: 20px 0px 0px;
	padding: 0px;
}
#bubble2 li {
	display: inline-block;
	margin: 0px 5px;
	padding: 0px;
	width: 72px;
	height: 72px;
}

#bubble2 li a img {
	position: relative;
	border: none;
}

#bubble2 li a img.large {
	display: none;
}

#bubble2 li a:hover img.small {
	display: none;
	z-index: 0;
}

#bubble2 li a:hover img.large {
	display: block;
	margin-top: -28px;
	margin-left: -28px;
	z-index: 1000;
}

-->
</style>

</head>

<body>
<h2><center><font face="Comic Sans MS" color="#000000"><%=(msg == null)?"":msg%></font></center></h2><br></br>
<div style="position: relative; height: 50px;">
	<div style="width: 720px; margin:25px auto 0 auto; padding-top: 5px; text-align: left;">
            </div>
</div>

</body>
</html>
