package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');

    String loggedUser = (String) session.getAttribute("loggedUser");
    loggedUser = (loggedUser == null ? "none" : loggedUser);
    if (!loggedUser.equals("none")) {

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        ");
      web.dbfunction dbfunc = null;
      synchronized (_jspx_page_context) {
        dbfunc = (web.dbfunction) _jspx_page_context.getAttribute("dbfunc", PageContext.PAGE_SCOPE);
        if (dbfunc == null){
          dbfunc = new web.dbfunction();
          _jspx_page_context.setAttribute("dbfunc", dbfunc, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");

            String option = request.getParameter("option");
            option = (option == null ? "none" : option);
            if (option.equals("viewall")) {
        
      out.write("\n");
      out.write("        \n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            body {\n");
      out.write("                font: normal 11px auto \"Trebuchet MS\", Verdana, Arial, Helvetica, sans-serif;\n");
      out.write("                color: #4f6b72;\n");
      out.write("                background: #E6EAE9;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            a {\n");
      out.write("                color: #c75f3e;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #mytable {\n");
      out.write("                width: 700px;\n");
      out.write("                padding: 0;\n");
      out.write("                margin: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            caption {\n");
      out.write("                padding: 0 0 5px 0;\n");
      out.write("                width: 700px;\t \n");
      out.write("                font: italic 11px \"Trebuchet MS\", Verdana, Arial, Helvetica, sans-serif;\n");
      out.write("                text-align: right;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            th {\n");
      out.write("                font: bold 11px \"Trebuchet MS\", Verdana, Arial, Helvetica, sans-serif;\n");
      out.write("                color: #4f6b72;\n");
      out.write("                border-right: 1px solid #C1DAD7;\n");
      out.write("                border-bottom: 1px solid #C1DAD7;\n");
      out.write("                border-top: 1px solid #C1DAD7;\n");
      out.write("                letter-spacing: 2px;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                text-align: left;\n");
      out.write("                padding: 6px 6px 6px 12px;\n");
      out.write("                background: #CAE8EA url(images/bg_header.jpg) no-repeat;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            th.nobg {\n");
      out.write("                border-top: 0;\n");
      out.write("                border-left: 0;\n");
      out.write("                border-right: 1px solid #C1DAD7;\n");
      out.write("                background: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            td {\n");
      out.write("                border-right: 1px solid #C1DAD7;\n");
      out.write("                border-bottom: 1px solid #C1DAD7;\n");
      out.write("                background: #fff;\n");
      out.write("                padding: 6px 6px 6px 12px;\n");
      out.write("                color: #4f6b72;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            td.alt {\n");
      out.write("                background: #F5FAFA;\n");
      out.write("                color: #797268;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            th.spec {\n");
      out.write("                border-left: 1px solid #C1DAD7;\n");
      out.write("                border-top: 0;\n");
      out.write("                background: #fff url(images/bullet1.gif) no-repeat;\n");
      out.write("                font: bold 10px \"Trebuchet MS\", Verdana, Arial, Helvetica, sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            th.specalt {\n");
      out.write("                border-left: 1px solid #C1DAD7;\n");
      out.write("                border-top: 0;\n");
      out.write("                background: #f5fafa url(images/bullet2.gif) no-repeat;\n");
      out.write("                font: bold 10px \"Trebuchet MS\", Verdana, Arial, Helvetica, sans-serif;\n");
      out.write("                color: #797268;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <title>Viewing Table</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <center>\n");
      out.write("            ");

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
                    //out.println("<a href='insert.jsp'>INSERT RECORD</a>");

                    dbfunc.closeConnection();
                } catch (Exception ex) {
                    out.println("<p><b>" + ex.toString() + "</b></p>");
                }
            
      out.write("\n");
      out.write("        </center>\n");
      out.write("\n");
      out.write("        ");
}
            if (option.equals("update")) {
      out.write("\n");
      out.write("\n");
      out.write("        <script language=\"javascript\" type=\"text/javascript\">\n");
      out.write("            function confirmDelete(url){\n");
      out.write("                if(confirm(\"Are you sure want to delete this record?\")){\n");
      out.write("                    location.href=url;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            body {\n");
      out.write("                font: normal 11px auto \"Trebuchet MS\", Verdana, Arial, Helvetica, sans-serif;\n");
      out.write("                color: #4f6b72;\n");
      out.write("                background: #E6EAE9;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            a {\n");
      out.write("                color: #c75f3e;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #mytable {\n");
      out.write("                width: 700px;\n");
      out.write("                padding: 0;\n");
      out.write("                margin: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            caption {\n");
      out.write("                padding: 0 0 5px 0;\n");
      out.write("                width: 700px;\t \n");
      out.write("                font: italic 11px \"Trebuchet MS\", Verdana, Arial, Helvetica, sans-serif;\n");
      out.write("                text-align: right;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            th {\n");
      out.write("                font: bold 11px \"Trebuchet MS\", Verdana, Arial, Helvetica, sans-serif;\n");
      out.write("                color: #4f6b72;\n");
      out.write("                border-right: 1px solid #C1DAD7;\n");
      out.write("                border-bottom: 1px solid #C1DAD7;\n");
      out.write("                border-top: 1px solid #C1DAD7;\n");
      out.write("                letter-spacing: 2px;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                text-align: left;\n");
      out.write("                padding: 6px 6px 6px 12px;\n");
      out.write("                background: #CAE8EA url(images/bg_header.jpg) no-repeat;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            th.nobg {\n");
      out.write("                border-top: 0;\n");
      out.write("                border-left: 0;\n");
      out.write("                border-right: 1px solid #C1DAD7;\n");
      out.write("                background: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            td {\n");
      out.write("                border-right: 1px solid #C1DAD7;\n");
      out.write("                border-bottom: 1px solid #C1DAD7;\n");
      out.write("                background: #fff;\n");
      out.write("                padding: 6px 6px 6px 12px;\n");
      out.write("                color: #4f6b72;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            td.alt {\n");
      out.write("                background: #F5FAFA;\n");
      out.write("                color: #797268;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            th.spec {\n");
      out.write("                border-left: 1px solid #C1DAD7;\n");
      out.write("                border-top: 0;\n");
      out.write("                background: #fff url(images/bullet1.gif) no-repeat;\n");
      out.write("                font: bold 10px \"Trebuchet MS\", Verdana, Arial, Helvetica, sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            th.specalt {\n");
      out.write("                border-left: 1px solid #C1DAD7;\n");
      out.write("                border-top: 0;\n");
      out.write("                background: #f5fafa url(images/bullet2.gif) no-repeat;\n");
      out.write("                font: bold 10px \"Trebuchet MS\", Verdana, Arial, Helvetica, sans-serif;\n");
      out.write("                color: #797268;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <title>Viewing Table</title>\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("            \n");
      out.write("            <center>\n");
      out.write("                ");

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
                        //out.println("<a href='insert.jsp'>INSERT RECORD</a>");

                        dbfunc.closeConnection();
                    } catch (Exception ex) {
                        out.println("<p><b>" + ex.toString() + "</b></p>");
                    }
                
      out.write("\n");
      out.write("            </center>\n");
      out.write("\n");
      out.write("            ");
}
      out.write("\n");
      out.write("            \n");
      out.write("            ");

            if (option.equals("delete")) {
      out.write("\n");
      out.write("\n");
      out.write("        <script language=\"javascript\" type=\"text/javascript\">\n");
      out.write("            function confirmDelete(url){\n");
      out.write("                if(confirm(\"Are you sure want to delete this record?\")){\n");
      out.write("                    location.href=url;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            body {\n");
      out.write("                font: normal 11px auto \"Trebuchet MS\", Verdana, Arial, Helvetica, sans-serif;\n");
      out.write("                color: #4f6b72;\n");
      out.write("                background: #E6EAE9;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            a {\n");
      out.write("                color: #c75f3e;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #mytable {\n");
      out.write("                width: 700px;\n");
      out.write("                padding: 0;\n");
      out.write("                margin: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            caption {\n");
      out.write("                padding: 0 0 5px 0;\n");
      out.write("                width: 700px;\t \n");
      out.write("                font: italic 11px \"Trebuchet MS\", Verdana, Arial, Helvetica, sans-serif;\n");
      out.write("                text-align: right;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            th {\n");
      out.write("                font: bold 11px \"Trebuchet MS\", Verdana, Arial, Helvetica, sans-serif;\n");
      out.write("                color: #4f6b72;\n");
      out.write("                border-right: 1px solid #C1DAD7;\n");
      out.write("                border-bottom: 1px solid #C1DAD7;\n");
      out.write("                border-top: 1px solid #C1DAD7;\n");
      out.write("                letter-spacing: 2px;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                text-align: left;\n");
      out.write("                padding: 6px 6px 6px 12px;\n");
      out.write("                background: #CAE8EA url(images/bg_header.jpg) no-repeat;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            th.nobg {\n");
      out.write("                border-top: 0;\n");
      out.write("                border-left: 0;\n");
      out.write("                border-right: 1px solid #C1DAD7;\n");
      out.write("                background: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            td {\n");
      out.write("                border-right: 1px solid #C1DAD7;\n");
      out.write("                border-bottom: 1px solid #C1DAD7;\n");
      out.write("                background: #fff;\n");
      out.write("                padding: 6px 6px 6px 12px;\n");
      out.write("                color: #4f6b72;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            td.alt {\n");
      out.write("                background: #F5FAFA;\n");
      out.write("                color: #797268;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            th.spec {\n");
      out.write("                border-left: 1px solid #C1DAD7;\n");
      out.write("                border-top: 0;\n");
      out.write("                background: #fff url(images/bullet1.gif) no-repeat;\n");
      out.write("                font: bold 10px \"Trebuchet MS\", Verdana, Arial, Helvetica, sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            th.specalt {\n");
      out.write("                border-left: 1px solid #C1DAD7;\n");
      out.write("                border-top: 0;\n");
      out.write("                background: #f5fafa url(images/bullet2.gif) no-repeat;\n");
      out.write("                font: bold 10px \"Trebuchet MS\", Verdana, Arial, Helvetica, sans-serif;\n");
      out.write("                color: #797268;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <title>Viewing Table</title>\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("            \n");
      out.write("            <center>\n");
      out.write("                ");

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
                        //out.println("<a href='insert.jsp'>INSERT RECORD</a>");

                        dbfunc.closeConnection();
                    } catch (Exception ex) {
                        out.println("<p><b>" + ex.toString() + "</b></p>");
                    }
                
      out.write("\n");
      out.write("            </center>\n");
      out.write("\n");
      out.write("            ");
}

            
      out.write("\n");
      out.write("            <!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml2/DTD/xhtml1-strict.dtd\">\n");
      out.write("            <html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\">\n");
      out.write("\n");
      out.write("                <script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("                <script type=\"text/javascript\" src=\"ddaccordion.js\">\n");
      out.write("\n");
      out.write("                </script>\n");
      out.write("\n");
      out.write("                <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("                    ddaccordion.init({\n");
      out.write("                        headerclass: \"headerbar\", //Shared CSS class name of headers group\n");
      out.write("                        contentclass: \"submenu\", //Shared CSS class name of contents group\n");
      out.write("                        revealtype: \"mouseover\", //Reveal content when user clicks or onmouseover the header? Valid value: \"click\", \"clickgo\", or \"mouseover\"\n");
      out.write("                        mouseoverdelay: 200, //if revealtype=\"mouseover\", set delay in milliseconds before header expands onMouseover\n");
      out.write("                        collapseprev: true, //Collapse previous content (so only one open at any time)? true/false\n");
      out.write("                        defaultexpanded: [0], //index of content(s) open by default [index1, index2, etc] [] denotes no content\n");
      out.write("                        onemustopen: true, //Specify whether at least one header should be open always (so never all headers closed)\n");
      out.write("                        animatedefault: false, //Should contents open by default be animated into view?\n");
      out.write("                        persiststate: true, //persist state of opened contents within browser session?\n");
      out.write("                        toggleclass: [\"\", \"selected\"], //Two CSS classes to be applied to the header when it's collapsed and expanded, respectively [\"class1\", \"class2\"]\n");
      out.write("                        togglehtml: [\"\", \"\", \"\"], //Additional HTML added to the header when it's collapsed and expanded, respectively  [\"position\", \"html1\", \"html2\"] (see docs)\n");
      out.write("                        animatespeed: \"normal\", //speed of animation: integer in milliseconds (ie: 200), or keywords \"fast\", \"normal\", or \"slow\"\n");
      out.write("                        oninit:function(headers, expandedindices){ //custom code to run when headers have initalized\n");
      out.write("                            //do nothing\n");
      out.write("                        },\n");
      out.write("                        onopenclose:function(header, index, state, isuseractivated){ //custom code to run whenever a header is opened or closed\n");
      out.write("                            //do nothing\n");
      out.write("                        }\n");
      out.write("                    })\n");
      out.write("\n");
      out.write("                </script>\n");
      out.write("\n");
      out.write("                <style type=\"text/css\">\n");
      out.write("\n");
      out.write("                    .urbangreymenu{\n");
      out.write("                        width: 190px; /*width of menu*/\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    .urbangreymenu .headerbar{\n");
      out.write("                        font: bold 13px Verdana;\n");
      out.write("                        color: white;\n");
      out.write("                        background: #606060 url(arrowstop.gif) no-repeat 8px 6px; /*last 2 values are the x and y coordinates of bullet image*/\n");
      out.write("                        margin-bottom: 0; /*bottom spacing between header and rest of content*/\n");
      out.write("                        text-transform: uppercase;\n");
      out.write("                        padding: 7px 0 7px 31px; /*31px is left indentation of header text*/\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    .urbangreymenu .headerbar a{\n");
      out.write("                        text-decoration: none;\n");
      out.write("                        color: white;\n");
      out.write("                        display: block;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    .urbangreymenu ul{\n");
      out.write("                        list-style-type: none;\n");
      out.write("                        margin: 0;\n");
      out.write("                        padding: 0;\n");
      out.write("                        margin-bottom: 0; /*bottom spacing between each UL and rest of content*/\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    .urbangreymenu ul li{\n");
      out.write("                        padding-bottom: 2px; /*bottom spacing between menu items*/\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    .urbangreymenu ul li a{\n");
      out.write("                        font: normal 12px Arial;\n");
      out.write("                        color: black;\n");
      out.write("                        background: #E9E9E9;\n");
      out.write("                        display: block;\n");
      out.write("                        padding: 5px 0;\n");
      out.write("                        line-height: 17px;\n");
      out.write("                        padding-left: 8px; /*link text is indented 8px*/\n");
      out.write("                        text-decoration: none;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    .urbangreymenu ul li a:visited{\n");
      out.write("                        color: black;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    .urbangreymenu ul li a:hover{ /*hover state CSS*/\n");
      out.write("                        color: white;\n");
      out.write("                        background: black;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                </style>\n");
      out.write("\n");
      out.write("                <body>\n");
      out.write("\n");
      out.write("                    <div class=\"urbangreymenu\">\n");
      out.write("\n");
      out.write("                        <h3 class=\"headerbar\"><a href=\"\">Admin Menu</a></h3>\n");
      out.write("                        <ul class=\"submenu\">\n");
      out.write("                            <li><a href=\"admin.jsp?option=viewall\">View All Users</a></li>\n");
      out.write("                            <li><a href=\"admin.jsp?option=update\">Update Users</a></li>\n");
      out.write("                            <li><a href=\"admin.jsp?option=delete\">Delete Users</a></li>                          \n");
      out.write("                            <li><a href=\"logout.jsp\">LogOut</a></li>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </body>\n");
      out.write("\n");
      out.write("            </html>\n");
      out.write("            ");
} else {
                    out.println("<br /><b>Please Login Properly</b>");
                }

            
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
