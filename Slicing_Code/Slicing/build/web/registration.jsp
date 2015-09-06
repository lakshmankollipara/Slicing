
<%
    String userId = request.getParameter("signup");        
     
    String userSignal=((userId==null || userId.length()==0)?"":"readonly");
    userId=((userId==null)?"":userId);
    
    
    String email = request.getParameter("email");        
    String emailSignal=((email==null || email.length()==0)?"":"readonly");
    email=((email==null)?"":email);
    
    
    String msg = request.getParameter("msg");
    out.println(msg==null?"":msg);
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en"><head>
        <meta charset="utf-8">
        <title>Registration form</title>
        <meta name="keywords" content="publishing" />
        <meta name="description" content="This document is JavaScript Form Validation using registration form. " />
        <link rel='stylesheet' href='css/js-form-validation.css' type='text/css' />
        <script src="sample-registration-form-validation.js"></script>
    </head>
    <body onload="document.registration.userid.focus();">
        <h1>Registration Form<font color='red'>&nbsp;(Details Required)</font></h1>
        <form name="registration" action='<%=web.Resource.getMyUrl()%>Registration' onSubmit="return formValidation();" method="post">
                    <input type="hidden" name="userId" value="<%=userId%>" />
            <ul>
                <li><label for="userid">Employee id:</label></li>
                <li><input type="text" <%=userSignal%> name="userid" size="12" value="<%=userId%>" /></li>
                <li><label for="passid">Password:</label></li>
                <li><input type="password" name="passid" size="12" /></li>
                <li><label for="username">Name:</label></li>
                <li><input type="text" name="username" size="50" /></li>
                <li><label for="address">Address:</label></li>
                <li><input type="text" name="address" size="50" /></li>
                <li><label for="country">City:</label></li>
                <li><select name="country">
                        <option selected="" value="Default">(Please select a city)</option>
                        <option value="Delhi">Delhi</option>
                        <option value="Kolkata">Kolkata</option>
                        <option value="Hyderabad">Hyderabad</option>
                        <option value="Banglore">Bangalore</option>
                        <option value="Chennai">Chennai</option>
                        <option value="Pune">Pune</option>
                        <option value="Mumbai">Mumbai</option>
                    </select></li>
                <li><label for="zip">ZIP Code:</label></li>
                <li><input type="text" name="zip" /></li>
                <li><label for="email">Email:</label></li>
                <li><input type="text" <%=emailSignal%> name="email" size="50" value="<%=email%>"/></li>
                <li><label for="salary">Salary:</label></li>
                <li><input type="text" name="salary" size="50" value=""/></li>
                <li><label id="gender">Sex:</label></li>
                <li><input type="radio" name="sex" value="Male" /><span>Male</span></li>
                <li><input type="radio" name="sex" value="Female" /><span>Female</span></li>
                <li><label>Language:</label></li>
                <li><input type="checkbox" name="en" value="en" checked /><span>English</span></li>
                <li><input type="checkbox" name="nonen" value="noen" /><span>Non English</span></li>
                <li><label for="desc">Designation:</label></li>
                <li><textarea name="desc" id="desc"></textarea></li>
                <li><input type="submit" name="submit" value="Next" /></li>
                <li><input type="submit" name="submit" value="Cancel" /></li>
            </ul>
        </form>
    </body>
</html>
