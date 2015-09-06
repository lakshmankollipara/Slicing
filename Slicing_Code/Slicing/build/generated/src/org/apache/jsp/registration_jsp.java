package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');

    String userId = request.getParameter("signup");        
     
    String userSignal=((userId==null || userId.length()==0)?"":"readonly");
    userId=((userId==null)?"":userId);
    
    
    String email = request.getParameter("email");        
    String emailSignal=((email==null || email.length()==0)?"":"readonly");
    email=((email==null)?"":email);
    
    
    String msg = request.getParameter("msg");
    out.println(msg==null?"":msg);

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\"><head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Registration form</title>\n");
      out.write("        <meta name=\"keywords\" content=\"publishing\" />\n");
      out.write("        <meta name=\"description\" content=\"This document is JavaScript Form Validation using registration form. \" />\n");
      out.write("        <link rel='stylesheet' href='css/js-form-validation.css' type='text/css' />\n");
      out.write("        <script src=\"sample-registration-form-validation.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"document.registration.userid.focus();\">\n");
      out.write("        <h1>Registration Form<font color='red'>&nbsp;(Details Required)</font></h1>\n");
      out.write("        <form name=\"registration\" action='");
      out.print(web.Resource.getMyUrl());
      out.write("Registration' onSubmit=\"return formValidation();\" method=\"post\">\n");
      out.write("        <!--<form name=\"registration\" action='");
      out.print(web.Resource.getMyUrl());
      out.write("imageregistration.jsp' method=\"post\">-->\n");
      out.write("            <input type=\"hidden\" name=\"userId\" value=\"");
      out.print(userId);
      out.write("\" />\n");
      out.write("            <ul>\n");
      out.write("                <li><label for=\"userid\">Employee id:</label></li>\n");
      out.write("                <li><input type=\"text\" ");
      out.print(userSignal);
      out.write(" name=\"userid\" size=\"12\" value=\"");
      out.print(userId);
      out.write("\" /></li>\n");
      out.write("                <li><label for=\"passid\">Password:</label></li>\n");
      out.write("                <li><input type=\"password\" name=\"passid\" size=\"12\" /></li>\n");
      out.write("                <li><label for=\"username\">Name:</label></li>\n");
      out.write("                <li><input type=\"text\" name=\"username\" size=\"50\" /></li>\n");
      out.write("                <li><label for=\"address\">Address:</label></li>\n");
      out.write("                <li><input type=\"text\" name=\"address\" size=\"50\" /></li>\n");
      out.write("                <li><label for=\"country\">City:</label></li>\n");
      out.write("                <li><select name=\"country\">\n");
      out.write("                        <option selected=\"\" value=\"Default\">(Please select a city)</option>\n");
      out.write("                        <option value=\"Delhi\">Delhi</option>\n");
      out.write("                        <option value=\"Kolkata\">Kolkata</option>\n");
      out.write("                        <option value=\"Hyderabad\">Hyderabad</option>\n");
      out.write("                        <option value=\"Banglore\">Banglore</option>\n");
      out.write("                        <option value=\"Chennai\">Chennai</option>\n");
      out.write("                        <option value=\"Pune\">Pune</option>\n");
      out.write("                        <option value=\"Mumbai\">Mumbai</option>\n");
      out.write("                    </select></li>\n");
      out.write("                <li><label for=\"zip\">ZIP Code:</label></li>\n");
      out.write("                <li><input type=\"text\" name=\"zip\" /></li>\n");
      out.write("                <li><label for=\"email\">Email:</label></li>\n");
      out.write("                <li><input type=\"text\" ");
      out.print(emailSignal);
      out.write(" name=\"email\" size=\"50\" value=\"");
      out.print(email);
      out.write("\"/></li>\n");
      out.write("                <li><label for=\"salary\">Salary:</label></li>\n");
      out.write("                <li><input type=\"text\" name=\"salary\" size=\"50\" value=\"\"/></li>\n");
      out.write("                <li><label id=\"gender\">Sex:</label></li>\n");
      out.write("                <li><input type=\"radio\" name=\"sex\" value=\"Male\" /><span>Male</span></li>\n");
      out.write("                <li><input type=\"radio\" name=\"sex\" value=\"Female\" /><span>Female</span></li>\n");
      out.write("                <li><label>Language:</label></li>\n");
      out.write("                <li><input type=\"checkbox\" name=\"en\" value=\"en\" checked /><span>English</span></li>\n");
      out.write("                <li><input type=\"checkbox\" name=\"nonen\" value=\"noen\" /><span>Non English</span></li>\n");
      out.write("                <li><label for=\"desc\">About:</label></li>\n");
      out.write("                <li><textarea name=\"desc\" id=\"desc\"></textarea></li>\n");
      out.write("                <li><input type=\"submit\" name=\"submit\" value=\"Next\" /></li>\n");
      out.write("                <li><input type=\"submit\" name=\"submit\" value=\"Cancel\" /></li>\n");
      out.write("            </ul>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
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
