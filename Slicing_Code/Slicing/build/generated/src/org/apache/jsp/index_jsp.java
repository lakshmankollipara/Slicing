package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("\n");

    String msg = request.getParameter("msg");

      out.write("\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("<title>Information</title>\n");
      out.write("\n");
      out.write("<!-- stylesheets -->\n");
      out.write("  \t<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("  \t<link rel=\"stylesheet\" href=\"css/slide.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("\t\n");
      out.write("  \t<!-- PNG FIX for IE6 -->\n");
      out.write("  \t<!-- http://24ways.org/2007/supersleight-transparent-png-in-ie6 -->\n");
      out.write("\t<!--[if lte IE 6]>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/pngfix/supersleight-min.js\"></script>\n");
      out.write("\t<![endif]-->\n");
      out.write("\t \n");
      out.write("    <!-- jQuery - the core -->\n");
      out.write("\t<script src=\"js/jquery-1.3.2.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<!-- Sliding effect -->\n");
      out.write("\t<script src=\"js/slide.js\" type=\"text/javascript\"></script>\n");
      out.write("        \n");
      out.write("<!-- Panel -->\n");
      out.write("<center>\n");
      out.write("    <span style=\"font-size: 40px\"><h1>Welcome to Anonymized Data Publishing</h1>\n");
      out.write("        </br><h1> Slicing</h1></span>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</center>\n");
      out.write("\t\t\t<div class=\"left\">\n");
      out.write("\t\t\t\t<!-- Login Form -->\n");
      out.write("                                <center>\n");
      out.write("                                <form class=\"clearfix\" action=\"");
      out.print(web.Resource.getMyUrl());
      out.write("Signin\" method=\"post\">\n");
      out.write("                                </br><h2>Employee Login</h2>\n");
      out.write("\t\t\t\t\t<label class=\"grey\" for=\"log\">Username:</label>\n");
      out.write("\t\t\t\t\t<input class=\"field\" type=\"text\" name=\"log\" id=\"log\" value=\"\" size=\"23\" /></br>\n");
      out.write("\t\t\t\t\t<label class=\"grey\" for=\"pwd\">Password:</label>\n");
      out.write("\t\t\t\t\t<input class=\"field\" type=\"password\" name=\"pwd\" id=\"pwd\" size=\"23\" /></br>\n");
      out.write("\t           \n");
      out.write("        \t\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t\t\t\t<input type=\"submit\" name=\"submit\" value=\"Login\" class=\"bt_login\" />\n");
      out.write("                                </center>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"left right\"><center>\t\t\t\n");
      out.write("\t\t\t\t<!-- Register Form -->\n");
      out.write("\t\t\t\t<form action=\"");
      out.print(web.Resource.getMyUrl());
      out.write("registration.jsp\" method=\"post\">\n");
      out.write("                                </br><h2>Not a member yet? Sign Up!</h2>\t\t\t\t\n");
      out.write("\t\t\t\t\t<label class=\"grey\" for=\"signup\">Username:</label>\n");
      out.write("\t\t\t\t\t<input class=\"field\" type=\"text\" name=\"signup\" id=\"signup\" value=\"\" size=\"23\" /></br>\n");
      out.write("\t\t\t\t\t<label class=\"grey\" for=\"email\">Email:</label>\n");
      out.write("\t\t\t\t\t<input class=\"field\" type=\"text\" name=\"email\" id=\"email\" size=\"23\" /></br>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<input type=\"submit\" name=\"submit\" value=\"Register\" class=\"bt_register\" />\n");
      out.write("\t\t\t\t</form> </center>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\t\n");
      out.write("<style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write("\n");
      out.write("body {\n");
      out.write("\tbackground-color: #EDEDED;\n");
      out.write("        background: url(images/");
      out.print(web.Resource.getBackGround());
      out.write(") repeat 0 0;\n");
      out.write("\tfont-family: Helvetica, Arial, sans-serif;\n");
      out.write("\tfont-size: 13px;\n");
      out.write("\tmargin: 0px;\n");
      out.write("\tpadding: 0px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("div#content {\n");
      out.write("\twidth: 1024px;\n");
      out.write("\tmargin: 50px auto 0px auto;\n");
      out.write("\ttext-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#bubble {\n");
      out.write("\tlist-style: none;\n");
      out.write("\tmargin: 0px;\n");
      out.write("\tpadding: 0px;\n");
      out.write("}\n");
      out.write("#bubble li {\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("\tmargin: 0px;\n");
      out.write("\tpadding: 0px;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("#bubble li a.icon {\n");
      out.write("\tbackground: url(images/sprites.png) no-repeat;\n");
      out.write("\tborder: none;\n");
      out.write("\tdisplay: block;\n");
      out.write("\twidth: 128px;\n");
      out.write("\theight: 128px;\n");
      out.write("\ttext-indent: -9999px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#bubble li a.feed {\n");
      out.write("\tbackground-position: -139px -12px;\n");
      out.write("}\n");
      out.write("#bubble li a.feed:hover {\n");
      out.write("\tbackground-position: -13px -12px;\n");
      out.write("}\n");
      out.write("#bubble li a.email {\n");
      out.write("\tbackground-position: -139px -149px;\n");
      out.write("}\n");
      out.write("#bubble li a.email:hover {\n");
      out.write("\tbackground-position: -13px -149px;\n");
      out.write("}\n");
      out.write("#bubble li a.twitter {\n");
      out.write("\tbackground-position: -139px -283px;\n");
      out.write("}\n");
      out.write("#bubble li a.twitter:hover {\n");
      out.write("\tbackground-position: -13px -283px;\n");
      out.write("}\n");
      out.write("#bubble li a.facebook {\n");
      out.write("\tbackground-position: -139px -422px;\n");
      out.write("}\n");
      out.write("#bubble li a.facebook:hover {\n");
      out.write("\tbackground-position: -13px -422px;\n");
      out.write("}\n");
      out.write("#bubble li a.delicious {\n");
      out.write("\tbackground-position: -139px -559px;\n");
      out.write("}\n");
      out.write("#bubble li a.delicious:hover {\n");
      out.write("\tbackground-position: -13px -559px;\n");
      out.write("}\n");
      out.write("#bubble li a.technorati {\n");
      out.write("\tbackground-position: -139px -698px;\n");
      out.write("}\n");
      out.write("#bubble li a.technorati:hover {\n");
      out.write("\tbackground-position: -13px -698px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("#bubble2 {\n");
      out.write("\tlist-style: none;\n");
      out.write("\tmargin: 20px 0px 0px;\n");
      out.write("\tpadding: 0px;\n");
      out.write("}\n");
      out.write("#bubble2 li {\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("\tmargin: 0px 5px;\n");
      out.write("\tpadding: 0px;\n");
      out.write("\twidth: 72px;\n");
      out.write("\theight: 72px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#bubble2 li a img {\n");
      out.write("\tposition: relative;\n");
      out.write("\tborder: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#bubble2 li a img.large {\n");
      out.write("\tdisplay: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#bubble2 li a:hover img.small {\n");
      out.write("\tdisplay: none;\n");
      out.write("\tz-index: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#bubble2 li a:hover img.large {\n");
      out.write("\tdisplay: block;\n");
      out.write("\tmargin-top: -28px;\n");
      out.write("\tmargin-left: -28px;\n");
      out.write("\tz-index: 1000;\n");
      out.write("}\n");
      out.write("\n");
      out.write("-->\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<!--[if IE 7]>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("#bubble li, #bubble2 li {\n");
      out.write("    display: inline;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<![endif]-->\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<h2><center><font face=\"Comic Sans MS\" color=\"#000000\">");
      out.print((msg == null)?"":msg);
      out.write("</font></center></h2><br></br>\n");
      out.write("<div style=\"position: relative; height: 50px;\">\n");
      out.write("\t<div style=\"width: 720px; margin:25px auto 0 auto; padding-top: 5px; text-align: left;\">\n");
      out.write("            </div>\n");
      out.write("</div>\n");
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
