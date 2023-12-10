package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	private static String usuario = "root";
	private static String password = "testpw";
	private static String url = "jdbc:mysql://localhost:3306/inventrack";
	
	public static Connection conectar() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, usuario, password);
			if (conn != null) {
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error de conexión");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Error de Driver");
			e.printStackTrace();
		}
		
		return conn;
		
	}

}
