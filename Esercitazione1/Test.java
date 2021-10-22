// @author Rota Matteo - 1053065 - 15/10/2021

package es3;


public class Test {
	public static void main(String[] args) {
		String a = "a";
		String b = "b";
		String c = "c";
		String d = "d";
		
		
		Pila pila = new Pila_composizione();
		//Pila pila = new Pila_ereditarietà(); // cambiare il "tipo" di pila cambiando il nome della classe del new
		
		System.out.println("Pila vuota? " + pila.isEmpty() + "\n"); // true
		
		pila.push(a);
		pila.push(b);
		pila.push(c);
		pila.push(d);
		
		System.out.println("Elementi nella pila:\n");
		for(Object e : ((Pila_composizione)pila).pila)
		//for(Object e : (Pila_ereditarietà)pila)
			System.out.println(e.toString() + "\n"); // d c b a
		
		System.out.println("Rimosso primo elemento dalla pila (" + pila.pop() + ")\n"); // d
		
		System.out.println("Il primo elemento della pila adesso è " + pila.top() + "\n"); // c
	
		System.out.println("Elementi nella pila:\n");
		for(Object e : ((Pila_composizione)pila).pila)
		//for(Object e : (Pila_ereditarietà)pila)
			System.out.println(e.toString() + "\n"); // c b a
	}
}