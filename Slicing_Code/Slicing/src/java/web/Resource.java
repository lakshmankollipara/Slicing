
package web;

import java.io.InputStream;
import java.util.Properties;
import java.util.Random;

public class Resource {

    public static Properties props = new Properties();

    static {
        try {
            InputStream is = Resource.class.getClassLoader().getResourceAsStream("data.properties");
            props = new Properties();
            props.load(is);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static String getBackGround() {
        Random r = new Random();
        int Low = 1;
        int High = 5;
        int R = r.nextInt(High - Low) + Low;

        return "bg4.jpg";
    }

    public static String getMyUrl() {
        String myUrl = props.getProperty("myip");
        return myUrl;

    }

    public static String getmyIp() {
        String myUrl = props.getProperty("myip");
        return myUrl;

    }

    public static String getdbDriver() {
        String myUrl = props.getProperty("forName");
                return myUrl;
    }

    public static String getDbUrl() {
        String myUrl = props.getProperty("dburl");
        return myUrl;
    }

    public static String getDbUser() {
        String myUrl = props.getProperty("dbuser");
        return myUrl;
    }

    public static String getDbPass() {
        String myUrl = props.getProperty("dbpass");
        return myUrl;
    }

    public static String getDataSet() {
        String myUrl = props.getProperty("datapath");
        return myUrl;
    }

    public static String sliceString(String mail) {
        return "*";
    }

    public static String sliceMail(String mail) {
        String parts[] = mail.split("@");
        String pre = "";
        for (int i = 0; i < parts[0].length(); i++) {
            pre += "*";
        }
        return pre + "@" + parts[1];
    }

    public static String sliceZip(String zip) {
        char pre[] = zip.toCharArray();
        
        pre[5]='*';
        String rez = "";
        for(int i=0;i<6;i++)
        {
            
            rez+=pre[i];
        }
        return rez;
    }
}