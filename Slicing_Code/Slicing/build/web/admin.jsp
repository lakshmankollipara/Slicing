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
            if (option.equals("viewall")) {
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
               

                    ResultSet rs = dbfunc.queryRecord("SELECT * FROM users");

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

        <%}
            if (option.equals("update")) {%>

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

                        ResultSet rs = dbfunc.queryRecord("SELECT * FROM users");

                        out.println("<table border='1'>");
                        out.println("<tr><th>User ID</th><th>Employee Name</th><th>Salary</th><th>Status</th><th colspan='2'>Operations</th></tr>");
                        while (rs.next()) {
                            if (!rs.getString(1).equalsIgnoreCase("admin")) {
                                out.println("<tr><td>" + rs.getString(1) + "</td><td>" + rs.getString(3) + "</td><td>" + rs.getString(8) + "</td><td>" + rs.getString(12) + "</td><td><a href='update.jsp?id=" + rs.getString(1) + "'>Update</a></td></tr>");
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
            
            <%
            if (option.equals("delete")) {%>

        <script language="javascript" type="text/javascript">
            function confirmDelete(url){
                if(confirm("Are you sure want to delete this record?")){
                    location.href=url;
                }
            }
        </script>
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

                        if (request.getParameter("delete") != null) {
                            if (dbfunc.updateRecord("DELETE FROM users WHERE userId='" + request.getParameter("delete") + "'")) {
                                out.println("<p><b>Deleting record success!</b></p>");
                            } else {
                                out.println("<p><b>Deleting record failed!</b></p>");
                            }
                        }

                        ResultSet rs = dbfunc.queryRecord("SELECT * FROM users");

                        out.println("<table border='1'>");
                        out.println("<tr><th>User ID</th><th>Employee Name</th><th>Salary</th><th>Status</th><th colspan='2'>Operations</th></tr>");
                        while (rs.next()) {
                            if (!rs.getString(1).equalsIgnoreCase("admin")) {
                                out.println("<tr><td>" + rs.getString(1) + "</td><td>" + rs.getString(3) + "</td><td>" + rs.getString(8) + "</td><td>" + rs.getString(12) + "</td><td><a href=javascript:confirmDelete('admin.jsp?option=delete&delete=" + rs.getString(1) + "')>Delete</a></td></tr>");
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

            <%}

            %>
            <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml2/DTD/xhtml1-strict.dtd">
            <html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">

                <style type="text/css">

                    .urbangreymenu{
                        width: 190px; /*width of menu*/
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
                        font: normal 12px Arial;
                        color: black;
                        background: #E9E9E9;
                        display: block;
                        padding: 5px 0;
                        line-height: 17px;
                        padding-left: 8px; /*link text is indented 8px*/
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

                <body>
                    <center>
                    <div align="center" class="urbangreymenu">

                        <h3 class="headerbar"><a href="admin.jsp">Admin Menu</a></h3>
                        <ul class="submenu">
                            <li><a href="admin.jsp?option=viewall">View All Users</a></li>
                            <li><a href="admin.jsp?option=update">Update Users</a></li>
                            <li><a href="admin.jsp?option=delete">Delete Users</a></li>                          
                            <li><a href="plain.jsp">Non Anonymized Data</a></li>                            
                            <li><a href="expenses.jsp">View Corporate Expenses (Generalization)</a></li>
                            <li><a href="expense2.jsp">View Corporate Expenses(Bucketization)</a></li>                                                  
                            <li><a href="expenses3.jsp">View Corporate Expenses(Slicing)</a></li>
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