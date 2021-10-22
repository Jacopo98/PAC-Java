
import java.util.LinkedList;


public class Pila_ereditarietà extends LinkedList implements Pila {
	// isEmpty, push e pop sono già definite in LinkedList (o List) come le si vuole, quindi non è necessario riscriverle
	
	public Object top() {
		return this.getFirst();
	}
}
