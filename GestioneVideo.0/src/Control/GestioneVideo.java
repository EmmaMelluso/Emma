package Control;
import Entità.it.*;
import gestionevideo.database.*;

import java.sql.SQLException;
import java.util.*;
public class GestioneVideo {

	
	ArrayList<Video> playlist ;
	
	
	public GestioneVideo() {
		playlist=new ArrayList<Video>();
		
	}

	
	public void inserisci_video(Video v) throws SQLException {
		playlist.add(v);
		VideoDAO.insert_video(v);
	}
	
	public void rimuovi_video(Video v) throws SQLException{
		playlist.remove(v);
		VideoDAO.remove_video(v);
	}
	
	public void ricerca(String sport, String nome) throws SQLException{
		for(Iterator<Video> i = playlist.iterator(); i.hasNext();) {
			Video nuovo= i.next();
			
			if (nuovo.get_sport()==sport || nuovo.get_nome()==nome) {
				System.out.println(nuovo.toString());
			
			} else {
				System.out.println("NO VIDEO");
			}
			
		}
		
		VideoDAO.ricerca_video(sport, nome);
		
	}
}
