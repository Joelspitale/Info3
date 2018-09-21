package Unidad5;

public class Nodo_String {
	 private String dato;
	    private Nodo_String next;

	    Nodo_String() {
	        next = null;
	    }

	    Nodo_String(String d) {
	        next = null;
	        dato = d;
	    }

	    Nodo_String(String d, Nodo_String n) {
	        next = n;
	        dato = d;
	    }

	    public String getDato() {
	        return dato;
	    }

	    public void setDato(String dato) {
	        this.dato = dato;
	    }

	    public Nodo_String getNext() {
	        return next;
	    }

	    public void setNext(Nodo_String next) {
	        this.next = next;
	    }

}
