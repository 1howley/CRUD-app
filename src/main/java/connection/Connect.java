package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    
    private static final String url = "DB url";
    private static final String user = "your DB user";
    private static final String password = "your DB Pass";
    
    private static Connection conn;
    
    public static Connection getConexao() {
        
        try {
            if (conn == null) {
                conn = DriverManager.getConnection(url, user, password);
                return conn;
                
            } else {
                return conn;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        
    }
    
}
