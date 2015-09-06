package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.ResultSet;

public final class insert_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/viewalldatasets.jsp");
  }

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
      out.write("    <head><title>Inserting Record</title></head>\n");
      out.write("    <body>\n");
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
      out.write("    <center>\n");
      out.write("        ");
      web.dbfunction dbfunc2 = null;
      synchronized (_jspx_page_context) {
        dbfunc2 = (web.dbfunction) _jspx_page_context.getAttribute("dbfunc2", PageContext.PAGE_SCOPE);
        if (dbfunc2 == null){
          dbfunc2 = new web.dbfunction();
          _jspx_page_context.setAttribute("dbfunc2", dbfunc2, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");

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
        
      out.write("\n");
      out.write("        <form action=\"updatedatasets.jsp?option=update\" method=\"POST\">\n");
      out.write("            <input type=\"hidden\" name=\"dsid\" size=\"10\" value=\"");
      out.print( rs2.getString("dsid"));
      out.write("\"></input>\n");
      out.write("            <table>                \n");
      out.write("                <tr><td>DataSet Name</td><td>:</td><td><input type=\"text\" name=\"dsname\" size=\"25\" value=\"");
      out.print( rs2.getString("dsname"));
      out.write("\"></td></tr>\n");
      out.write("                <tr><td>DataSet FileName</td><td>:</td><td><input type=\"text\" name=\"dsfname\" size=\"15\" value=\"");
      out.print( rs2.getString("filename"));
      out.write("\"></td></tr>\n");
      out.write("                <tr><td>DataSet Status</td><td>:</td><td><input type=\"text\" name=\"status\" size=\"15\" value=\"");
      out.print( rs2.getString("status"));
      out.write("\"></td></tr>\n");
      out.write("            </table>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"submit\" name=\"insert\" value=\"UPDATE\">\n");
      out.write("        </form>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("    </center>\n");
      out.write("    ");
}out.println("No Such DataSet Exists");}
      else
      {
      out.write("\n");
      out.write("      <form action=\"insert.jsp?option=create\" method=\"POST\">\n");
      out.write("            <table>                \n");
      out.write("                <tr><td>DataSet Name</td><td>:</td><td><input type=\"text\" name=\"dsname\" size=\"25\" value=\"\"></td></tr>\n");
      out.write("                <tr><td>DataSet FileName</td><td>:</td><td><input type=\"text\" name=\"dsfname\" size=\"15\" value=\"\"></td></tr>\n");
      out.write("                <tr><td>DataSet Status</td><td>:</td><td><input type=\"text\" name=\"status\" size=\"15\" value=\"\"></td></tr>\n");
      out.write("            </table>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"submit\" name=\"insert\" value=\"INSERT\">\n");
      out.write("        </form>\n");
      out.write("            <br></br>    \n");
      out.write("    ");
}             

}
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>   \n");
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

                    try {
                        dbfunc.createConnection();                        

                        ResultSet rs = dbfunc.queryRecord("SELECT * FROM datasets");

                        out.println("<table border='1'>");
                        out.println("<tr><th>DataSet ID</th><th>DataSet Name</th><th>DataSet FileName</th><th>Status</th><th colspan='2'>Operations</th></tr>");
                        while (rs.next()) {
                            
                                out.println("<tr><td>" + rs.getString(1) + "</td><td>" + rs.getString(2) + "</td><td>" + rs.getString(3) + "</td><td>" + rs.getString(4) + "</td><td><a href='insert.jsp?option=update&dsid=" + rs.getString(1) + "'>Update</a></td></tr>");
                            
                        }
                        out.println("</table>");
                        out.println("<br>");
                        //out.println("<a href='insert.jsp'>INSERT RECORD</a>");

                        dbfunc.closeConnection();
                    } catch (Exception ex) {
                        out.println("<p><b>" + ex.toString() + "</b></p>");
                    }
                
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
