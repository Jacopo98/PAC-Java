import java.util.ArrayList;

public class main {

	static boolean trovato = false;
	static boolean verificaDuplicato(ArrayList lista) {
		for (int i=0; i<lista.size()-1;i++) {
			for (int y=(i+1); y<lista.size();y++) {
				System.out.println(((Studente) lista.get(i)).getName());
				System.out.println(((Studente) lista.get(y)).getName());
				
				if (((Studente)lista.get(i)).equals((Studente)lista.get(y))) {
					trovato = true;
					System.out.println("* Trovato *");
				}
				System.out.println("-----------");
			}
		}
		if (trovato == true) {
			return true;
		}else
			return false;
	
	}
	
	
	public static void main(String[] args) {
		
		Studente[] studenti = {
				new Studente("Jacopo","Boffelli","11/10/1998","UniBG"),
				new Studente("Martina","Boffelli", "06/06/2007", "Falcone"),
				new Studente("Jacopo","Boffelli","11/10/1998","UniBG"),
		};

		ArrayList<Studente> list = new ArrayList<Studente>();
		for(int u=0; u< studenti.length; u++) {
			list.add(studenti[u]);
		}
		
		
		boolean presenzadup = verificaDuplicato(list);
		
		System.out.println("Presenza duplicato: "+ presenzadup);
		
		
		
		
	}

}
