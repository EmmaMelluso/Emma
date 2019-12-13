package Entità.it;

import java.util.*;

public class VideoApprofondimento extends Video {

	
	ArrayList<Giornalista> giornalisti= new ArrayList<Giornalista>();
	
	
	public VideoApprofondimento() {
		super();
	}
	
	public VideoApprofondimento(String x, String y, String z, String m) {
		super(x,y,z,m);
	}
	
	
	
	
	//ASSOCIO AD UN VIDEO DI APPROFONDIMENTO UNO O PIU GIORNALISTI
	public void add_giornalista(Giornalista g) {
		giornalisti.add(g);
	}
	
	public void get_giornalisti() {
		for(Iterator<Giornalista> i = giornalisti.iterator(); i.hasNext();) {
			Giornalista var= i.next();
			
			System.out.println(var.toString());
		}
	}
	
	
	
	//OVERRIDING METODO TO STRING
	public String to_String() {
		return (super.toString()+ "GIORNALISTA: " + giornalisti );
	}
}
