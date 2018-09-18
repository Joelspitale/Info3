package Unidad1;

import javax.swing.JOptionPane;

public class Ejercicio2 {
	public static void main(String[] args) {
		String a = null;
		int convertido;
		int vec []=new int[10];;
		PilaEjemplo p=new PilaEjemplo(vec);
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
	
	private static  void opciones(String a,PilaEjemplo p){
		int numero1,numero2;
		try {
		numero1=p.topAndPop();
		numero2=p.topAndPop();
		System.out.println(numero1+"es el primer elemento");
		System.out.println(numero2+"es el primer elemento");
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