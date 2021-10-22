import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Test {
	
	public static void main(String[] args) {		
		List<Studente> S_noDup = new LinkedList <Studente>();
		S_noDup.add(new Studente("UniBG", "0", "A", "A"));
		S_noDup.add(new Studente("UniMI", "0", "A", "A"));
		S_noDup.add(new Studente("UniBG", "0", "A", "B"));
		S_noDup.add(new Studente("UniBG", "1", "A", "A"));
		
		List<Studente> S_dup = new LinkedList<Studente>();
		S_dup.add(new Studente("UniBG", "0", "A", "A"));
		S_dup.add(new Studente("UniMI", "0", "A", "A"));
		S_dup.add(new Studente("UniBG", "0", "A", "A"));
		S_dup.add(new Studente("UniBG", "1", "A", "A"));
		S_dup.add(new Studente("UniBG", "0", "A", "A"));
		
		VerificaDup test_verificaDup = new VerificaDuplicatoListIT();
		System.out.println(test_verificaDup.verificaDup(S_noDup)); // false
		System.out.println(test_verificaDup.verificaDup(S_dup)); // true
		
		
		
		// ARRAY E ARRAYLIST
		Studente[] studenti = { new Studente("Jacopo", "Boffelli", "11/10/1998", "UniBG"),
								new Studente("Martina", "Boffelli", "06/06/2007", "Falcone"),
								new Studente("Jacopo", "Boffelli", "11/10/1998", "UniBG"), };

		ArrayList<Studente> list = new ArrayList<Studente>();
		for (int u = 0; u < studenti.length; u++) {
			list.add(studenti[u]);
		}
				
		VerificaDup test_verificaDuplicatoIT = new VerificaDuplicato();
		boolean presenzadup = test_verificaDuplicatoIT(list);
		System.out.println("Presenza duplicato: " + presenzadup);

		
		
	}
}
