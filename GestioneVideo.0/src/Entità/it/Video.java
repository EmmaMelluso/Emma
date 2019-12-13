package Entità.it;

public class Video {
	
	private String nome;
	private String ID;
	private String sport;
	private String data;
	
	
	//COSTRUTTORE DI DEFALUT
	public Video() {
		nome="";
		ID="";
		sport="";
		data="";
	}
	
	
	//COSTRUTTORE CON PARAMETRI
	
	public Video(String a, String b, String c, String d) {
		nome=a;
		ID=b;
		sport=c;
		data=d;
	}
	
	//INSERIMENTO NOME ID SPORT
	
	public String get_nome() {
		return this.nome;
		
	}
	
	public String get_id() {
		return this.ID;
	}
	
	public String get_sport() {
		return this.sport;
	}
	
	public String toString() {
		return (nome + " " + ID + " " + sport+ " " + data);
	}
	
	public String get_data() {
		return this.data;
	}
	
	public void set_nome(String nome) {
		this.nome=nome;
	}
	
	public void set_ID(String id) {
		this.ID=id;
	}
	
	public void set_sport(String sport) {
		this.sport=sport;
	}
	
	public void set_data(String data) {
		this.data=data;
	}

}
