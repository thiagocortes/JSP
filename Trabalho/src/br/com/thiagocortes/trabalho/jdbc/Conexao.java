package br.com.thiagocortes.trabalho.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	private static String user="postgres";
	private static String pass="admin";
	private static String url = "jdbc:postgresql://localhost:5432/trabalho";
	
	
	
	public static Connection conexao(){
		Connection con = null;
		try{
			con = DriverManager.getConnection(url,user,pass);
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return con;
	}
}
