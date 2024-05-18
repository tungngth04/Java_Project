/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connect;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Administrator
 */
public class ConnectDataBase {
    public static void main(String[] args) {
        try {
			
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://ADMIN:1433;databaseName=QLSach;encrypt=true;trustServerCertificate=true";
            String userName = "sa";
            String password = "123456789";
			
            Connection connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Kết nối thành công");
	}catch(Exception e) {
            e.printStackTrace();
	}
    }
}
