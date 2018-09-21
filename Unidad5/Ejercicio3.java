package Unidad5;

import javax.swing.JOptionPane;

public class Ejercicio3 {
	public static void main(String[] args) {
		String words;
		int sumlla=0,sumcor=0,sumpar=0;
		words=JOptionPane.showInputDialog("Ingrese Funcion matematica que desea verificar");
		char vec []=new char[words.length()];
		PilaEnlazada p=new PilaEnlazada();
		char aux;
		
			for(int i=0;i<words.length();i++) {
					aux=words.charAt(i);
					if('{'==aux)sumlla++;
					if('('==aux)sumpar++;
					if('['==aux)sumcor++;
					
					if('}'==aux)sumlla--;
					if(')'==aux)sumpar--;
					if(']'==aux)sumcor--;
			}
			aux=0;
			if(sumlla==0 && sumpar==0 && sumcor==0) {
			for(int i=0;i<words.length();i++) {
				aux=words.charAt(i);
				try {
					if(('}'==aux)||(']'==aux)||(')'==aux)) {
						switch(aux) {
							case '}': 
									System.out.println(fun('{',p,'(','['));
							break;
							case ']':
								System.out.println(fun('[',p,'{','('));
							break;
							case ')':
								System.out.println(fun('(',p,'[','{'));
							break;
							}
						}
					else {
						p.push(aux);
					}
					
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
			}
		}
			else
				System.out.println("Por favor escriba la sentencia correctamente");
}
private static String fun(char a,PilaEnlazada p,char b,char c) {
	char aux=0;
	try {
			while(a!=aux) {
				aux=p.top();
				if(aux==a)
				return "Estan bien equilibradas la ecuacion";
				else {
					if(aux==c||aux==b)
						throw new Exception("Por favor escriba la sentencia correctamente");
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		
	}
	
	return "Por favor escriba la sentencia correctamente";
}

}
