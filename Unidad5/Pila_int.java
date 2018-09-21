package Unidad5;

public class Pila_int {
		Nodo_int tos=null;
		
		public Pila_int() {
			tos=null;
		}
		public void push(int a) {
				tos=new Nodo_int(a,tos);
			
		}
		public void pop() throws Exception {
			if(isemply())
				throw new Exception("No hay elementos que eliminar");
			tos=tos.getNext();
		}
		public int topandpop() throws Exception {
			if(isemply())
				throw new Exception("No hay elementos que eliminar");
			int aux=tos.getDato();
			tos=tos.getNext();
			return aux;
		}
		public int top() throws Exception {
			if(isemply())
				throw new Exception("No hay elementos que eliminar");
			return tos.getDato();
		}
		public boolean isemply() {
			return tos==null;
		}
		public void makemply() {
			tos=null;
		}
	}