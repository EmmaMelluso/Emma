package gestionevideo.database;


import java.sql.*;


import Entità.it.*;
public class VideoDAO {

	public VideoDAO() {
		
	}

	//INIZIALIZZO L'OGGETTO VIDEO
	public static Video create_video(String nome, String ID, String sport, String data) throws SQLException {
		Video x= new Video(nome,ID,sport,data);
		insert_video(x);
		return x;
		
	}
	
	//STABILIRE CONNESSIONE CON DATABASE
	//INSERIMENTO ELEMENTI NELLA TABELLA CREATA NEL MAIN (INIZIALIZZA DB)
	public static void insert_video(Video v) throws SQLException {
	
	Connection conn= DriverManager.getConnection("jdbc:h2:C:\\Users\\emmam\\eclipse-workspace\\GestioneVideo.0\\database", "sa", "");
	
	String query1;
	query1= ("INSERT INTO VIDEO (NOME,"
			+ "ID,"
			+ "SPORT,"
			+ "DATA) VALUES (?,?,?,?)");
	try (PreparedStatement stmt=conn.prepareStatement(query1))
	{
	 //TRAMITE SETSTRING SOSTITUISCO AL POSTO DEI PUNTI INTERROGATIVI LE VARIABILI EFFETTIVE 
	stmt.setString(1, v.get_nome());
	stmt.setString(2, v.get_id());
	stmt.setString(3, v.get_sport());
	stmt.setString(4, v.get_data());
	
	
	stmt.executeUpdate();
	
	} catch (SQLException c) {
		c.printStackTrace();
	}
	
	
}
	
	public static void remove_video(Video v) throws SQLException {
		Connection conn=DriverManager.getConnection("jdbc:h2:C:\\Users\\emmam\\eclipse-workspace\\GestioneVideo.0\\database", "sa", "");
		
		String query2;
		query2= ("DELETE FROM VIDEO WHERE NOME=?");
		
		try(PreparedStatement stmt=conn.prepareStatement(query2)){
			stmt.setString(1, v.get_nome());
			
			stmt.executeUpdate();
		} catch (SQLException c) {
			c.printStackTrace();
		}
	}
	
	public static Video ricerca_video(String sport, String nome) throws SQLException {
		
		Video v= new Video();
		
		Connection conn= DriverManager.getConnection("jdbc:h2:C:\\Users\\emmam\\eclipse-workspace\\GestioneVideo.0\\database","sa", "");
		
		String query3;
		 query3= ("SELECT ID,DATA FROM VIDEO WHERE SPORT=? AND NOME=?");
		 
		 try(PreparedStatement stmt= conn.prepareStatement(query3)){
			stmt.setString(1, nome);
			stmt.setString(3, sport);
			
			
		try (ResultSet r= stmt.executeQuery()){
			while(r.next()) {
				String id1 = r.getString(2);
				String data1= r.getString(4);
				
				v=new Video(nome, id1, sport, data1 );
			}
			
		}
		} catch (SQLException c) {
			 c.printStackTrace();
		 }
		 
		 return v;
		
	}
	}
	


