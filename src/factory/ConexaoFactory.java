package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoFactory {
    
    public static Connection con;
    
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        
        if ( con == null ) {
           
             Class.forName( "org.apache.derby.jdbc.ClientDriver" );
            
       
        
            String url = "jdbc:derby://localhost:1527/Academia";
            String user = "root";
            String pass = "root";
        
      
            con = DriverManager.getConnection( url, user, pass);
            
            return con;
             
       
        } else {
            return con;
        }
    }
    
}
