/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

/**
 *
 * @author angel
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Calix
 */
public class Conexion {
      public static Connection conection = null;
    public Connection getConexion() {
		try {
			
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conection=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=PROYECTO_MP", "sa", "123");
                        return conection;

		} catch (ClassNotFoundException | SQLException ex) {
			return null;
			
		}
                

	}
	
    
}
    


