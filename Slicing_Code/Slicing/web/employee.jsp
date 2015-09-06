<%@ page import="java.sql.*" %>

<%
    String loggedUser = (String) session.getAttribute("loggedUser");
    loggedUser = (loggedUser == null ? "none" : loggedUser);
    if (!loggedUser.equals("none")) {
%>

<html>
    <head>
        <jsp:useBean id="dbfunc" scope="page" class="web.dbfunction" />
        <%
            String option = request.getParameter("option");
            option = (option == null ? "none" : option);
            if (option.equals("viewself")) {
        %>

        <style type="text/css">
            body {
                font: normal 11px auto "Trebuchet MS", Verdana, Arial, Helvetica, sans-serif;
                color: #4f6b72;
                background: #E6EAE9;
            }

            a {
                color: #c75f3e;
            }

            #mytable {
                width: 700px;
                padding: 0;
                margin: 0;
            }

            caption {
                padding: 0 0 5px 0;
                width: 700px;	 
                font: italic 11px "Trebuchet MS", Verdana, Arial, Helvetica, sans-serif;
                text-align: right;
            }

            th {
                font: bold 11px "Trebuchet MS", Verdana, Arial, Helvetica, sans-serif;
                color: #4f6b72;
                border-right: 1px solid #C1DAD7;
                border-bottom: 1px solid #C1DAD7;
                border-top: 1px solid #C1DAD7;
                letter-spacing: 2px;
                text-transform: uppercase;
                text-align: left;
                padding: 6px 6px 6px 12px;
                background: #CAE8EA url(images/bg_header.jpg) no-repeat;
            }

            th.nobg {
                border-top: 0;
                border-left: 0;
                border-right: 1px solid #C1DAD7;
                background: none;
            }

            td {
                border-right: 1px solid #C1DAD7;
                border-bottom: 1px solid #C1DAD7;
                background: #fff;
                padding: 6px 6px 6px 12px;
                color: #4f6b72;
            }


            td.alt {
                background: #F5FAFA;
                color: #797268;
            }

            th.spec {
                border-left: 1px solid #C1DAD7;
                border-top: 0;
                background: #fff url(images/bullet1.gif) no-repeat;
                font: bold 10px "Trebuchet MS", Verdana, Arial, Helvetica, sans-serif;
            }

            th.specalt {
                border-left: 1px solid #C1DAD7;
                border-top: 0;
                background: #f5fafa url(images/bullet2.gif) no-repeat;
                font: bold 10px "Trebuchet MS", Verdana, Arial, Helvetica, sans-serif;
                color: #797268;
            }
        </style>

        <title>Viewing Table</title>
    </head>
    <body>
        <center>
            <%
                try {

                    dbfunc.createConnection();


                    ResultSet rs = dbfunc.queryRecord("SELECT * FROM users where userId='" + loggedUser + "'");

                    out.println("<table border='1'>");
                    out.println("<tr><th>User ID</th><th>Employee Name</th><th>Salary</th><th>Status</th></tr>");
                    while (rs.next()) {
                        if (!rs.getString(1).equalsIgnoreCase("admin")) {
                            out.println("<tr><td>" + rs.getString(1) + "</td><td>" + rs.getString(3) + "</td><td>" + rs.getString(8) + "</td><td>" + rs.getString(12) + "</td></tr>");
                        }
                    }
                    out.println("</table>");
                    out.println("<br>");
                    
                    dbfunc.closeConnection();
                } catch (Exception ex) {
                    out.println("<p><b>" + ex.toString() + "</b></p>");
                }
            %>
        </center>

        <%}%>



        <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml2/DTD/xhtml1-strict.dtd">
        <html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">

            <style type="text/css">

                .urbangreymenu{
                    width: 400px; /*width of menu*/
                }

                .urbangreymenu .headerbar{
                    font: bold 13px Verdana;
                    color: white;
                    background: #606060 url(arrowstop.gif) no-repeat 8px 6px; /*last 2 values are the x and y coordinates of bullet image*/
                    margin-bottom: 0; /*bottom spacing between header and rest of content*/
                    text-transform: uppercase;
                    padding: 7px 0 7px 31px; /*31px is left indentation of header text*/
                }

                .urbangreymenu .headerbar a{
                    text-decoration: none;
                    color: white;
                    display: block;
                }

                .urbangreymenu ul{
                    list-style-type: none;
                    margin: 0;
                    padding: 0;
                    margin-bottom: 0; /*bottom spacing between each UL and rest of content*/
                }

                .urbangreymenu ul li{
                    padding-bottom: 2px; /*bottom spacing between menu items*/
                }

                .urbangreymenu ul li a{
                    font: normal 14px Arial;
                    color: black;
                    background: #E9E9E0;
                    display: block;
                    padding: 5px 0;
                    line-height: 40px;
                    padding-left: 20px; /*link text is indented 8px*/
                    text-decoration: none;
                }

                .urbangreymenu ul li a:visited{
                    color: black;
                }

                .urbangreymenu ul li a:hover{ /*hover state CSS*/
                    color: white;
                    background: black;
                }

            </style>

            <body bgcolor="gray">
                <center>
                    <div style="width: 720px; margin:25px auto 0 auto; padding-top: 5px; text-align: left;">
                        <center><span style="color: #333; font-family:'Arial Black',Gadget,sans-serif; font-size: 35px; font-weight: bold; letter-spacing: -5px;"><a href="" style="color: #333; text-decoration: none;" title="">Publishing</a></span></center>
                        <center><span style="color: #333; font-family:'Arial Black',Gadget,sans-serif; font-size: 35px; font-weight: bold; letter-spacing: -5px;"><a href="" style="color: #333; text-decoration: none;" title="">And</a></span></center>
                        <center><span style="color: #333; font-family:'Arial Black',Gadget,sans-serif; font-size: 35px; font-weight: bold; letter-spacing: -5px;"><a href="" style="color: #333; text-decoration: none;" title="">Privacy Measures</a></span></center>
                    </div>
                    <div align="center" class="urbangreymenu">

                        <h3 class="headerbar"><a href="">Employee Menu</a></h3>
                        <ul class="submenu">
                            <li><a href="employee.jsp?option=viewself">View Self Details</a></li>
                                                       
                            <li><a href="logout.jsp">LogOut</a></li>
                        </ul>

                    </div>
                </center>
            </body>

        </html>
        <%} else {
                out.println("<br /><b>Please Login Properly</b>");
            }

        %>