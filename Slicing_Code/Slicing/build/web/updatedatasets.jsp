<%@page import="java.util.*"%>
<%@ page import="java.sql.*" %>
<html>
    <head><title>Updating Record</title></head>
    <body>
        <jsp:useBean id="dbfunc2" scope="page" class="web.dbfunction" />
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
    <center>
        <%
            try {
                ResultSet rs = null;

                dbfunc2.createConnection();

                if (request.getParameter("option") != null) {
                    if (dbfunc2.updateRecord("Update datasets set dsname='" + request.getParameter("dsname") + "', filename='" + request.getParameter("dsfname") + "', status= '" + request.getParameter("status") + "' where dsid=" + request.getParameter("dsid") + "")) {
                        out.println("<p><b>Updating record success!</b></p>");
                    } else {
                        out.println("<p><b>Updating record failed!</b></p>");
                    }
                }


                dbfunc2.closeConnection();
            } catch (Exception ex) {
                out.println("<p><b>" + ex.toString() + "</b></p>");
            }
        %>
        <br>
        <a href="admin.jsp">Back</a>
        <%@include file="viewalldatasets.jsp"%>
    </center>
</body>
</html>