package Entità.it;

public class Giornalista {

	
	String nome_giornalista;
	String cognome_giornalista;
	
	public Giornalista() {}
	public Giornalista(String var1, String var2) {
		nome_giornalista=var1;
		cognome_giornalista=var2;
	}
	
	public void add_nome(String nome) {
		this.nome_giornalista=nome;
		
	}
	
	public void add_cognome(String cognome) {
		this.cognome_giornalista=cognome;
	}
	
	public String toString() {
		return ("nome: "+ nome_giornalista+ " cognome: "+ cognome_giornalista);
	}

}
