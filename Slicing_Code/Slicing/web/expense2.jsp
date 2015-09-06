<%@page import="java.util.Collections"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="web.Resource"%>
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
                    out.println("<caption>Bucketization</caption>");
                    out.println("<tr><th>Employee Designation</th><th>Employee Salary</th><th>Email</th><th>Zip</th><th>Gender</th></tr>");
                    
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
                    String finalresult = "result-" + "No data Exists";
                    out.print(finalresult);
                    out.flush();

                }
                out.println("<br>");                

                dbfunc.closeConnection();
            } catch (Exception ex) {
                out.println("<p><b>" + ex.toString() + "</b></p>");
            }
        %>
    </center>


    <%}%>