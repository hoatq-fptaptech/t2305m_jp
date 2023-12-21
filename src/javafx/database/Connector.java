package javafx.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    private Connection conn;

    private static Connector _instance;
    
    private Connector() {
        // tạo kết nối với db
        String host = "jdbc:mysql://localhost:3306/t2305m";
        String user = "root";
        String pwd = "root";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            this.conn = DriverManager.getConnection(host,user,pwd);
        }catch (SQLException e){
            System.out.println(e.getErrorCode());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static Connector getInstance(){
        if(_instance == null){
            _instance = new Connector();
        }
        return _instance;
    }

    public Connection getConn() {
        return conn;
    }
}
