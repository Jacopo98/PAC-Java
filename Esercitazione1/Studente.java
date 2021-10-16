public class Studente implements Comparable<Object> {

	//Attributi
	String nome;
	String cognome;
	String data;
	String universita;
	
	//Costruttore
	public Studente(String nome, String cognome, String data, String universita) {
		this.nome=nome;
		this.cognome =cognome;
		this.data=data;
		this.universita=universita;
	}
	
	//Metodi accessori
	String getName() { return nome; }
	String getSurname() { return cognome; }
	String getDate() { return data; }
	String getUni() { return universita; }
	
	
	public boolean equals(Studente studente) {
		if (this.getName() == studente.getName()) {
			return true;
		}
		else {
		return false;
		}
	}
	
	
	public int compareTo(Studente o) throws ClassCastException {
		if (this.nome.compareTo(o.getName())<0) return -1;
		if (this.nome.compareTo(o.getName())>0) return 1;
		else return 0;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
}
