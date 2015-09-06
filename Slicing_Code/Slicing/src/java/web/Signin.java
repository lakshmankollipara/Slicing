
package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Signin extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String button = request.getParameter("submit");

            if (button.equalsIgnoreCase("Register")) {
             response.sendRedirect(web.Resource.getmyIp()+"registration.jsp");
            }
            
            if (button.equalsIgnoreCase("Login")) {
                String userId = request.getParameter("log");
                String pass = request.getParameter("pwd");          
                
                
                Class.forName(web.Resource.getdbDriver());

                Connection conn = DriverManager.getConnection(web.Resource.getDbUrl(), web.Resource.getDbUser(), web.Resource.getDbPass());
                conn.setAutoCommit(false);
                Statement stmt = conn.createStatement();                
                
                String queryz = "select userId,status from users where userId='"+userId+"' and password = '"+pass+"'";
                ResultSet rsett = stmt.executeQuery(queryz);
                if (rsett.next()) {
                    if(rsett.getString(2).trim().equalsIgnoreCase("no"))
                    {
                        response.sendRedirect(web.Resource.getmyIp()+"index.jsp?msg=Admin yet to validate your account. Please wait...");
                    }    
                    if(rsett.getString(2).trim().equalsIgnoreCase("yes"))
                    {
                        out.println("-------Operations---------");
                        if(userId.equals("admin"))
                        {
                             HttpSession session = request.getSession(true);
                             session.setAttribute("loggedUser", userId);
                             session.setMaxInactiveInterval(60*60);

        
                             response.sendRedirect(web.Resource.getmyIp()+"admin.jsp");                                        
                        }   
                        else
                        {    
                             HttpSession session = request.getSession(true);
                             session.setAttribute("loggedUser", userId);
                             session.setMaxInactiveInterval(60*60);
                            
                             response.sendRedirect(web.Resource.getmyIp()+"employee.jsp");                                        
                        }
                    }
                                    }
                else
                {
                    response.sendRedirect(web.Resource.getmyIp()+"index.jsp?msg="+"<br><b>Invalid user id. Plz Register.");                                        
                    return;
                }    
                
             
            }
            
        } catch (SQLException e) {
            out.println("SQLException=" + e.toString());
            response.sendRedirect(web.Resource.getmyIp()+"registration.jsp?msg=" + e.toString());
        } catch (ClassNotFoundException e) {
            out.println(" ClassNotFoundException =" + e.toString());
            response.sendRedirect(web.Resource.getmyIp()+"registration.jsp?msg=" + e.toString());
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
