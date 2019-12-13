package Emma;
import java.sql.*;

import Entità.it.*;

import Control.GestioneVideo;

public class MainDAO {

	public static void main(String[] args) throws SQLException  {
		
		//INTRODUCO UNA VARIABILE GESTIONEVIDEO
		//QUELLA CHE MI PERMETTE DI ESEGUIRE LA FUNZIONE RICERCA SUI VIDEO
		GestioneVideo var=null;
		try {
		//ALLOCO UNA NUOVA VARIABILE GESTIONE VIDEO
		var= new GestioneVideo();
		
		String Nome_evento= "Partita1";
		String sport = "Calcio";
		Video v1= new Video(Nome_evento, "1", sport, "1");
		
		String Nome_2 = "Partita2";
		String sport1= "Pallavolo";
		Video v2= new Video(Nome_2, "2", sport1, "2");
		
		var.inserisci_video(v1);
		var.inserisci_video(v2);
		
		
		var.ricerca(sport1, Nome_evento);

	} catch (SQLException c) {
		c.printStackTrace();
	}
	}
}
