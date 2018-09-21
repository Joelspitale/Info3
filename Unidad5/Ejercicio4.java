package Unidad5;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String palabra=in.nextLine();
		ColaEnlazada c=new ColaEnlazada();
		PilaEnlazada p=new PilaEnlazada();
		 String x=" ";
			for(int i=0;i<palabra.length();i++) {
				 if(x.charAt(0)!=palabra.charAt(i))
		            {
		                c.encolar(palabra.charAt(i));
		                p.push(palabra.charAt(i));
		            }
			}
			int a=0;
			boolean estado=true;
			while(c.esVacia()==false) {
				try {
					char b=c.desencolar();
					char ca=p.pop();
					if(b!=ca)estado=false;
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			if(estado==false) {
				System.out.println("no son palindromos");
			}
			else {
				System.out.println("si son palindromos");
			}
		
		
	}

}
