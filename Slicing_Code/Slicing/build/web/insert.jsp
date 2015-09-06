<%@ page import="java.sql.*" %>

<%
    String loggedUser = (String) session.getAttribute("loggedUser");
    loggedUser = (loggedUser == null ? "none" : loggedUser);
    if (!loggedUser.equals("none")) {
%>

<html>
    <head><title>Inserting Record</title></head>
    <body>
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
        <jsp:useBean id="dbfunc2" scope="page" class="web.dbfunction" />
        <%
            String option = request.getParameter("option");
            option = (option == null ? "none" : option);
            if (option.equals("create")) {        
        
                if (request.getParameter("insert") != null) {
                try {
                    dbfunc2.createConnection();

                    if (dbfunc2.updateRecord("INSERT INTO datasets(dsname,filename,status) VALUES ('" + request.getParameter("dsname") + "', '" + request.getParameter("dsfname") + "','" + request.getParameter("status") + "')")) {
                        out.println("<p><b>Inserting record success!</b></p>");
                    } else {
                        out.println("<p><b>Inserting record failed!</b></p>");
                    }

                    dbfunc2.closeConnection();
                } catch (Exception ex) {
                    out.println("<p><b>" + ex.toString() + "</b></p>");
                }
            }
          }         
             
          ResultSet rs2 = null;  
          if (request.getParameter("dsid") != null && request.getParameter("option").equals("update")) {
                dbfunc2.createConnection();    
                rs2 = dbfunc2.queryRecord("SELECT * FROM datasets WHERE dsid=" + request.getParameter("dsid") + "");
                

                if (rs2.next()) {  
        %>
        <form action="updatedatasets.jsp?option=update" method="POST">
            <input type="hidden" name="dsid" size="10" value="<%= rs2.getString("dsid")%>"></input>
            <table>                
                <tr><td>DataSet Name</td><td>:</td><td><input type="text" name="dsname" size="25" value="<%= rs2.getString("dsname")%>"></td></tr>
                <tr><td>DataSet FileName</td><td>:</td><td><input type="text" name="dsfname" size="15" value="<%= rs2.getString("filename")%>"></td></tr>
                <tr><td>DataSet Status</td><td>:</td><td><input type="text" name="status" size="15" value="<%= rs2.getString("status")%>"></td></tr>
            </table>
            <br>
            <input type="submit" name="insert" value="UPDATE">
        </form>
        <br>
        
    </center>
    <%}out.println("No Such DataSet Exists");}
      else
      {%>
      <form action="insert.jsp?option=create" method="POST">
            <table>                
                <tr><td>DataSet Name</td><td>:</td><td><input type="text" name="dsname" size="25" value=""></td></tr>
                <tr><td>DataSet FileName</td><td>:</td><td><input type="text" name="dsfname" size="15" value=""></td></tr>
                <tr><td>DataSet Status</td><td>:</td><td><input type="text" name="status" size="15" value=""></td></tr>
            </table>
            <br>
            <input type="submit" name="insert" value="INSERT">
        </form>
            <br></br>    
    <%}             

}%>
    <%@include file="viewalldatasets.jsp"%>
</body>
</html>
