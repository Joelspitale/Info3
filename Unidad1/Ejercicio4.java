package Unidad1;

import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		String words;
		int sumlla=0,sumcor=0,sumpar=0;
		words=JOptionPane.showInputDialog("Ingrese Funcion matematica que desea verificar");
		char vec []=new char[words.length()];
		Pila p=new Pila(vec);
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
				System.out.println("Estan mal distribuidos");
}
private static String fun(char a,Pila p,char b,char c) {
	char aux=0;
	while(a!=aux) {
		try {
		aux=p.top();
		if(aux==a)
		return "Estan bien equilibradas los "+a; 
		if(aux==c||aux==b)
			aux='(';
			return "esta mal equilibrado";
		} catch (Exception e) {
			aux='(';
		}
	}
	
	return "esta mal equilibrado los:"+a;
}
}
