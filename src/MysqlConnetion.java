import java.sql.DriverManager;
        
import java.sql.*;
import javax.swing.*;

public class MysqlConnetion {
    Connection conn= null;
    public static Connection connectdb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantproject","root","root");
            JOptionPane.showMessageDialog(null, "Connection Establised");
            return conn;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
            
        }
    }
}
