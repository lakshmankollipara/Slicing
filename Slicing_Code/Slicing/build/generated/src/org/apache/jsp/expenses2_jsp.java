package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import web.Resource;
import lucene.external.Employee;
import lucene.external.EmployeeDatabase;
import java.util.Collections;
import java.util.Arrays;
import java.sql.ResultSet;

public final class expenses2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String loggedUser = (String) session.getAttribute("loggedUser");
    loggedUser = (loggedUser == null ? "none" : loggedUser);
    if (!loggedUser.equals("none")) {

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
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
      out.write("    <center>\n");
      out.write("        ");

            String ename[];
            String salary[];
            String email[];
            String zip[];
            String sex[];
            String about[];
            
            EmployeeDatabase e = new EmployeeDatabase();        
            e.formDatabase();
            Employee[] EMPS = EmployeeDatabase.getEmployee();
            
            try{    
                    dbfunc.createConnection();


                ResultSet rset = dbfunc.queryRecord("select sum(salary) from users where userId!='admin'");

                boolean found = rset.next();

                if (found) {
                    
                    out.println("<table border='1'>");
                    out.println("<caption>Bucketization-II</caption>");
                    out.println("<tr><th>Employee Designation</th><th>Employee Salary</th><th>Email</th><th>Zip</th><th>Gender</th></tr>");
                    
                    double sum = Double.parseDouble(rset.getString(1));
                    
                    for(int i=0;i<EMPS.length;i++)
                    {
                        out.println("<tr><td>" + EMPS[i].getAbout() + "</td><td>" + EMPS[i].getSalary() + "</td><td>" + Resource.sliceMail(EMPS[i].getEmail()) + "</td><td>" + EMPS[i].getZip() + "</td><td>" + EMPS[i].getSex() + "</td></tr>");                        
                    }
                    out.println("<tr><td>Total Company Expenses<u><font color=red> " +sum + "</u></font></td><td></td><td></td><td></td><td></td></tr>");
                    out.println("</table>");
                 }
                 else
                     out.println("No Data");
            
            } catch (Exception ex) {
                out.println("<p><b>" + ex.toString() + "</b></p>");
            }
        
      out.write("\n");
      out.write("    </center>\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");
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
