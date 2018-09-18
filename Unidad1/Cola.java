package Unidad1;

public class Cola {
	int vec[];
	int item;
	int in;
	int out;
	int cant;
	
	public Cola(int a) {
		vec=new int[a];
		in=0;
		out=0;
	    cant=0;
	}
	public void encolar(int valor) throws Exception {
		if(estalleno())
			throw new Exception("No se puede encolar aun el numero"+ valor);
		else {
			cant++;
			vec[in]=valor;
			in=incre(in);
		}
	}
	public int desencolar() throws Exception{
		if(isempty())
			throw new Exception("No se pueden sedencolar porque ya no hay elementos");
		else {
			int aux=vec[out];
			cant--;
			out=incre(out);
			return aux;
		}
		
	}
	public int incre(int a) {
		return (a+1)%vec.length;
	}
	public boolean isempty() {
		return ((in==out)&&cant==0);
	}
	
	public boolean estalleno() {
		return ((in==out)&&cant>0);
	}
	public void makeempty() {
		in=0;
		out=0;
	}
}
