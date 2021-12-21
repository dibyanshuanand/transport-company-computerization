import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class javaconnect {
    Connection conn;
    
    public static Connection ConnecrDb() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/TransportCompany","root","sql2020");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
