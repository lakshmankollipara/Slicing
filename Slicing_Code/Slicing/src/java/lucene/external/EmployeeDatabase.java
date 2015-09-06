package lucene.external;

import java.io.*;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import web.dbfunction;

public class EmployeeDatabase {

    private static Employee[] EMPS=null;
    private ResultSet rs1;
    private ResultSet rs2;
    public boolean formDatabase() {
        dbfunction dbfunc = new dbfunction();
        try {
            dbfunc.createConnection();


            ResultSet rs = dbfunc.queryRecord("select count(*) from users where userId != 'admin'");
            int users = 0;
            if (rs.next()) {
                users = Integer.parseInt(rs.getString(1));
            }
            
            EMPS = new Employee[users];
            
            rs1 = dbfunc.queryRecord("select userId,password,name,address,country,zip,email,sex,language,status from users where userId != 'admin' order by zip");
            rs2 = dbfunc.queryRecord("select about,salary from users where userId !='admin' order by RAND()");
            
            int g=0;
            while (rs1.next() && rs2.next()) {
                EMPS[g]=new Employee(rs1.getString(1),rs1.getString(2),rs1.getString(3),rs1.getString(4),rs1.getString(5),rs1.getString(6),rs1.getString(7),rs2.getString(2),rs1.getString(8),rs1.getString(9),rs1.getString(10),rs2.getString(1));
                g++;
            }
            
            dbfunc.closeConnection();
            
                        
            return true;

        } catch (Exception ex) {
            System.out.println("<p><b>" + ex.toString() + "</b></p>");
            JOptionPane.showMessageDialog(null, "Failed to create emp database : "+ex.toString());
            return false;
        }
    }
    
    

    public static Employee[] getEmployee() {
        return EMPS;
    }

    public static Employee getEmployee(String id) {
        for (Employee employee : EMPS) {
            if (id.equals(employee.getUserId())) {
                return employee;
            }
        }
        return null;
    }

    public void createDatabase() {
        dbfunction dbfunc2 = new dbfunction();
        try {
            dbfunc2.createConnection();

            File f = new File(web.Resource.getDataSet());

            if (f.exists()) {
                try {
                                       
                    FileInputStream fstream = new FileInputStream(f);
                    DataInputStream in = new DataInputStream(fstream);
                    BufferedReader br = new BufferedReader(new InputStreamReader(in));
                    String strLine;
                    int count = 0;
                                   
                    while ((strLine = br.readLine()) != null) {
                        count++;
                        if (count > 1) {
                            String[] tokens = strLine.split("[,]");
                            String query = "INSERT INTO users(userId,password,name,address,country,zip,email,salary,sex,language,about,status) VALUES ('" + tokens[0] + "','" + tokens[1] + "','" + tokens[2] + "','" + tokens[3] + "','" + tokens[4] + "','" + tokens[5] + "','" + tokens[6] + "','" + tokens[7] + "','" + tokens[8] + "','" + tokens[9] + "','" + tokens[10] + "','" + tokens[11] + "')";
                            System.out.println(query);
                            if (dbfunc2.updateRecord(query)) {
                                System.out.println("<p><b>Inserting record success!</b></p>");
                            } else {
                                System.out.println("<p><b>Inserting record failed!</b></p>");
                            }

                        }
                    }
                    dbfunc2.closeConnection();
                    in.close();
                } catch (Exception e) {
                    System.err.println("Error: " + e.getMessage());
                }
            }
        } catch (Exception ex) {
            System.out.println("<p><b>" + ex.toString() + "</b></p>");
        }
    }

    public static void main(String[] args) {
        EmployeeDatabase e = new EmployeeDatabase();
       e.createDatabase();
        e.formDatabase();
    }
}