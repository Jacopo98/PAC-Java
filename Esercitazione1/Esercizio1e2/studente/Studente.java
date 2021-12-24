// ###########################################
// @author Jacopo Boffelli - Matricola 1053217
// ###########################################

package studente;

public class Studente implements Comparable<Object> {

	//Attributi
	private String nome;
	private String cognome;
	private String data;
	private String universita;
	
	//Costruttore
	public Studente(String nome, String cognome, String data, String universita) {
		this.nome=nome;
		this.cognome =cognome;
		this.data=data;
		this.universita=universita;
	}
	
	//Metodi accessori
	public String getName() { return nome; }
	public String getSurname() { return cognome; }
	public String getDate() { return data; }
	public String getUni() { return universita; }
	
	
	public boolean equals(Studente studente) {
		if (this.getName() == studente.getName()) {
			return true;
		}
		else
		return false;
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
