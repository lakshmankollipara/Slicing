package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Collections;
import java.util.Arrays;
import java.sql.ResultSet;
import web.Resource;

public final class expense2_jsp extends org.apache.jasper.runtime.HttpJspBase
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

            try {
                dbfunc.createConnection();


                ResultSet rset = dbfunc.queryRecord("select name,salary,email,zip,sex,about from users where userId!='admin' order by salary");

                boolean found = rset.next();

                if (found) {
                    rset.last();
                    int count = rset.getRow();

                    ename = new String[count];
                    salary = new String[count];
                    email = new String[count];
                    zip = new String[count];
                    sex = new String[count];
                    about = new String[count];


                    int row = 0;
                    rset.beforeFirst();
                    while (rset.next()) {
                        ename[row] = rset.getString(1);
                        salary[row] = rset.getString(2);
                        email[row] = rset.getString(3);
                        zip[row] = rset.getString(4);
                        sex[row] = rset.getString(5);                        
                        about[row] = rset.getString(6);                        
                        row++;
                    }                  

                    rset = dbfunc.queryRecord("select min(cast(salary as decimal(8,2))) as min,max(cast(salary as decimal(8,2))) as max from users where userId!='admin'");
                    String min="";
                    String max="";
                    if(rset.next())
                                               {
                        min=rset.getString(1);
                        max=rset.getString(2);
                    }
                    double half = Double.parseDouble(max)/2;
                    
                    String range1 = "["+min+"-"+half+"]";
                    String range2 = "["+half+"-"+max+"]";
                    
                    out.println("<table border='1'>");
                    out.println("<caption>Bucketization-I</caption>");
                    out.println("<tr><th>Employee Designation</th><th>Employee Salary</th><th>Email</th><th>Zip</th><th>Gender</th></tr>");
                    
                    //Collections.shuffle(Arrays.asList(ename));
                    //Collections.shuffle(Arrays.asList(salary));
                    //Collections.shuffle(Arrays.asList(email));
                    //Collections.shuffle(Arrays.asList(zip));
                    //Collections.shuffle(Arrays.asList(sex));
                    Collections.shuffle(Arrays.asList(about));
                    
                    double sum = 0.0;
                    for(int i=0;i<ename.length;i++)
                    {
                        out.println("<tr><td>" + about[i] + "</td><td>" + (Double.parseDouble(salary[i])<=half?range1:range2) + "</td><td>" + email[i] + "</td><td>" + zip[i] + "</td><td>" + sex[i] + "</td></tr>");
                        sum += Double.parseDouble(salary[i]);
                    }
                    out.println("<tr><td></td><td>Total Company Expenses<u><font color=red> " +sum + "</u></font></td><td></td><td></td><td></td></tr>");
                    out.println("</table>");

                } else {
                    //out.println("<br><b>No data Exists</b>");
                    String finalresult = "result-" + "No data Exists";
                    out.print(finalresult);
                    out.flush();

                }
                out.println("<br>");                

                dbfunc.closeConnection();
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
