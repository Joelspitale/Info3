package Unidad1;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		
		Cola c=new Cola(3);
		System.out.println(c.estalleno());
		try {
			System.out.println(c.desencolar());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			c.encolar(10);
			c.encolar(101);
			c.encolar(102);
			System.out.println(c.estalleno());
			c.encolar(1030);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println(c.desencolar());
			System.out.println(c.desencolar());
			System.out.println(c.desencolar());
			System.out.println(c.desencolar());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println(c.estalleno());
		System.out.println(c.isempty());
		
		
		/*
		int vec[]=new int[3];
		Pila p=new Pila(vec);
		System.out.println(p.estallena());
		System.out.println(p.isempty());
		try {
			p.push(18);
			p.push(10);
			p.push(5);
			p.push(1);
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(p.popandtop());
			System.out.println(p.popandtop());
			System.out.println(p.popandtop());
			System.out.println(p.popandtop());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}*/
	}
}
