package howispentmoney;

import java.sql.*;

public class DatabaseConnection {

    public static String login_check(String user, String password) {
        Connection connect = null;
        Statement s = null;
        String userid = null;
        try {
            
            connect = DriverManager.getConnection("jdbc:derby:C:\\Users\\tang-pc\\Documents\\NetBeansProjects\\HowISpentMoney\\.derby\\db_hism", "", "");
            s = connect.createStatement();
            String sql = "select * FROM APP.USERID WHERE USERNAME = '"+user+"' AND PASSWORD = '"+ password+"'";
            ResultSet rec = s.executeQuery(sql);//row data
            
            while (rec.next()) {
//                System.out.print(rec.getString(1));
//                System.out.println(rec.getString(2));
                userid = rec.getString(1);//select col
            }
            
// To do something
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        try {
            if (connect != null) {
                s.close();
                connect.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        System.out.println("login success");
        return userid;
    }
    public static void main(String[] args) {
        
        System.out.println(login_check("admin", "password"));
    }
}
