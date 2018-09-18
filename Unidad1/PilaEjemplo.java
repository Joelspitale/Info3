package Unidad1;

public class PilaEjemplo {
	private int [] vector;
	int top;
	public PilaEjemplo(int vector[]) {
		this.vector = vector;
		this.top = -1;
	}
	public void push(int a) throws Exception {
		if(estaLlena()) 
			 throw new Exception("Pila llena: " + a);
			
		vector[++top]=a;
	}
	public int top() throws Exception {
		if(isEmpty()) 
			 throw new Exception("Pila vacia: ");
		
		return vector[top];	
	}
	public void pop() throws Exception {
		if(isEmpty()) 
			 throw new Exception("Pila vacia: ");
		top--;
		
	}
	public int topAndPop() throws Exception {
		if(isEmpty()) 
			 throw new Exception("Pila vacia: ");
		return vector[top--];
	}
	public boolean isEmpty() {
			return top==-1;
	}
	public boolean estaLlena() {
		return top==vector.length-1;
	}
	public void makeEmpty() {
		top=-1;
	}
	
	

}

