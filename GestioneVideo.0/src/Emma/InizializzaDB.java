package Emma;

import java.sql.*;
public class InizializzaDB {

	public static void main(String[] args) throws SQLException{
		
		try {
			
			//STRINGA CHE MI PERMETTE DI STABILIRE LA CONNESSIONE
			Connection conn= DriverManager.getConnection("jdbc:h2:C:\\Users\\emmam\\eclipse-workspace\\GestioneVideo.0\\database", "sa", "");
			
			String query;
			
			query= "CREATE TABLE VIDEO("
					+ "NOME VARCHAR(50) ,"
					+ "ID INT NOT NULL PRIMARY KEY,"
					+ "SPORT VARCHAR(50),"
					+ "DATA VARCHAR(30)"
					+ ")";
			
			
			//MI PERMETTE DI SCRIVERE QUERY IN JAVA E PASSARLE AL DATABASE
			//CON EXECUTEUPDATE ME LA ESEGUE NEL DATABASE
			try(PreparedStatement stmt= conn.prepareStatement(query)){
				stmt.executeUpdate();
			}
			
			
			conn.close();
		} catch (SQLException x) {
			x.printStackTrace();
		}
		
	
	}

}
