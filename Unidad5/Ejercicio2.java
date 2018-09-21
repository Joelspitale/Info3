package Unidad5;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		String a = null;
		int convertido;
		Pila_int p=new Pila_int();
		do {
		
			a=JOptionPane.showInputDialog("Ingrese simbolo o x para salir");
			try {
				convertido=Integer.parseInt(a);	
				try {
					p.push(convertido);
					System.out.println("se ha almacenado correctamente");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}catch(NumberFormatException  e) {
				System.out.println(e.getMessage());
				opciones(a,p);
				}
		
		}while(a.equals("x")==false);
			
	}
	
	private static  void opciones(String a,Pila_int p){
		int numero1,numero2;
		try {
		numero1=p.topandpop();
		numero2=p.topandpop();
		System.out.println("el primer numero que de desapila es:"+numero1);
		System.out.println("el segundo numero que de desapila es:"+numero2);
		switch(a) {
		case "+": 
			p.push(numero1+numero2);
			System.out.println(numero1+numero2);
			break;
		case "-": 
			p.push(numero1-numero2);
			System.out.println(numero1-numero2);
			break;
		case "/": 
			p.push(numero1/numero2);
			System.out.println(numero1/numero2);
			break;
		case "*": 
			p.push(numero1*numero2);
			System.out.println(numero1*numero2);
			break;			  
				}
		}
		catch(Exception e) {
			System.out.println(e.getMessage()+" no ha ingresado elementos");
		}	
	}	
}
