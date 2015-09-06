<%@page import="web.Resource"%>
<%@page import="lucene.external.Employee"%>
<%@page import="lucene.external.EmployeeDatabase"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    String loggedUser = (String) session.getAttribute("loggedUser");
    loggedUser = (loggedUser == null ? "none" : loggedUser);
    if (!loggedUser.equals("none")) {
%>

<html>
    <head>
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
        <jsp:useBean id="dbfunc" scope="page" class="web.dbfunction" />
    <center>
        <%
            String ename[];
            String salary[];
            String email[];
            String zip[];
            String sex[];

            EmployeeDatabase e = new EmployeeDatabase();
            e.formDatabase();
            Employee[] EMPS = EmployeeDatabase.getEmployee();

            // bucket filtration
            Employee[] EMPS2 = new Employee[EMPS.length];

            // array copy
            System.arraycopy(EMPS, 0, EMPS2, 0, EMPS.length);
            int bucketId = 0;
            for (int k = 0; k < EMPS2.length; k++) {
                bucketId++;
                for (int f = 0; f < EMPS.length; f++) {
                    if (EMPS2[k].getAbout().equals(EMPS[f].getAbout())) {
                    }

                }
            }
            String desig[]=null;            
            String sal[]=null;
            
            try {
                dbfunc.createConnection();


                ResultSet rset = dbfunc.queryRecord("select sum(salary) from users where userId!='admin'");

                boolean found = rset.next();

                if (found) {

                    out.println("<table border='1'>");
                    out.println("<caption>Slicing</caption>");
                    out.println("<tr><th>Employee Designation</th><th>Employee Salary</th><th>Email</th><th>Zip</th><th>Gender</th></tr>");

                  double sum = Double.parseDouble(rset.getString(1));
                  /* The commented code is for having same salary range for one designation */

                /*    rset = dbfunc.queryRecord("select distinct(about) from users where userId!='admin'");

                    boolean found2 = rset.next();
                    if (found2) {
                        rset.last();
                        int count = rset.getRow();
                        desig = new String[count];
                        sal = new String[count];
                        
                        int row = 0;
                        rset.beforeFirst();
                        while (rset.next()) {
                            desig[row]=rset.getString(1);
                            row++;                            
                        }                        
                        

                    } else {
                        String finalresult = "result-" + "No data Exists";
                        out.print(finalresult);
                    }
                                       
                     for(int i=0;i<desig.length;i++)
                                               {
                        for (int k = 0; k < EMPS2.length; k++) {
                            if(desig[i].equals(EMPS2[k].getAbout()))
                                                               {
                                sal[i] = EMPS2[k].getSalary();
                            }
                        }
                    } */           
                    
                    for (int i = 0; i < EMPS.length; i++) {
                        //String sals="";
                       // for(int j=0;j<desig.length;j++)
                           //                            {                            
                         //   if(EMPS[i].getAbout().equalsIgnoreCase(desig[j]))
                         //                                      {
                           //     sals=sal[j];
                           // }
                       // }                  
                             String emp=EMPS[i].getAbout();
                                                                   
                        out.println("<tr><td>" + emp + "</td><td>" + EMPS[i].getSalary() + "</td><td>" + Resource.sliceMail(EMPS[i].getEmail()) + "</td><td>" + Resource.sliceZip(EMPS[i].getZip()) + "</td><td>" + EMPS[i].getSex() + "</td></tr>");
                   
                    
                    
                    }
                   
                    out.println("<tr><td></td><td>Total Company Expenses<u><font color=red> " + sum + "</u></font></td><td></td><td></td><td></td></tr>");
                    out.println("</table>");
                } else {
                    out.println("No Data");
                }

            } catch (Exception ex) {
                out.println("<p><b>" + ex.toString() + "</b></p>");
            }
        %>
    </center>


    <%}%>