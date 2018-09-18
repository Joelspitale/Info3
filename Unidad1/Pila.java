package Unidad1;

public class Pila {
	int tos;
	char vector [];
	
	
	public Pila(char i[]) {
		tos=-1;
		vector=i;
	}
	public void push(char a) throws Exception {
		if(estallena())
			throw new Exception("Pila llena, no se pudo insertar el dato"+a);
			vector[++tos]=a;	
		}
	public char top() throws Exception {
		if(isempty())
			throw new Exception("La pila esta vacia");
		return vector[tos--];
	}
	public char popandtop() throws Exception {
		if(isempty())
			throw new Exception("La pila esta vacia");
		return vector[tos--];
	}
	public void pop() throws Exception {
		if(isempty())
			throw new Exception("La pila esta vacia");
			tos --;
	}
	public boolean estallena() {
		return tos==vector.length-1;
	}
	public boolean isempty() {
		return tos==-1;
	}
	public void makeempty() {
		tos=-1;
	}
}
