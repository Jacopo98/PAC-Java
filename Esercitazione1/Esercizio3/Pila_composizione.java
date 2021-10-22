// @author Rota Matteo - 1053065 - 15/10/2021

package es3;


import java.util.LinkedList;
import java.util.List;


public class Pila_composizione implements Pila {
	public List pila; // private se fosse una vera classe, ma devo testarla accedendo dal main a questo parametro
	
	public Pila_composizione() {
		pila = new LinkedList();
	}

	
	public boolean isEmpty() {
		return pila.isEmpty();
	}
	
	public void push(Object e) {
		pila.add(0, e);
	}
	
	public Object pop() {
		return pila.remove(0);
	}
	
	public Object top() {
		return pila.get(0);
	}
}
