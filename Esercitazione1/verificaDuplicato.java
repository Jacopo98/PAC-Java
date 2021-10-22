import java.util.ArrayList;

public class main {

	// LIST ITERATOR
	public class VerificaDuplicatoListIT implements VerificaDup {
		// implementazione verificaDup da interfaccia VerificaDup
		public boolean verificaDup(List S) {
			ListIterator LI_est = S.listIterator(); // ListIterator esterno
			while (LI_est.hasNext()) {
				Object e_est = LI_est.next();

				ListIterator LI_int = S.listIterator(LI_est.nextIndex()); // ListIterator interno, scorre gli elementi
																		// successivi a quello su cui quello esterno
																		// si è fermato
				while (LI_int.hasNext()) {
					Object e_int = LI_int.next();

					if (e_int.equals(e_est))
						return true;
				}
			}

			return false;
		}
	}

	// CICLO FOR
	static boolean trovato = false;

	static boolean verificaDuplicatoIT(ArrayList lista) {
		for (int i = 0; i < lista.size() - 1; i++) {
			for (int y = (i + 1); y < lista.size(); y++) {
				System.out.println(((Studente) lista.get(i)).getName());
				System.out.println(((Studente) lista.get(y)).getName());

				if (((Studente) lista.get(i)).equals((Studente) lista.get(y))) {
					trovato = true;
					System.out.println("* Trovato *");
				}
				System.out.println("-----------");
			}
		}
		if (trovato == true) {
			return true;
		} else
			return false;

	}
}
