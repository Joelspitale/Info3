package Unidad4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio2 {

		public static void main(String[] args) throws FileNotFoundException {
			Scanner f = new Scanner(new File("src/Ejercicio2/es.txt"));//utf8
			String aux  =f.useDelimiter("\\A").next();
			String []a = aux.split("\n");
			System.out.println("El vector tiene un tamanio de :"+a.length);
			for(String b:a) {
				System.out.println(b);
			}
			q(a,0,a.length-1);
			
		     for(String b:a) {
				System.out.println(b);
			}
		}
		
		 private static void q(String[] a, int i,int r) {
			  int izq=i;
			  int der=r;
			  String valor;
			  
			  while(izq<der) {
				  while(a[der].compareTo(a[izq])>0&&izq<der)der--;
				  if(izq<der) {
					  valor=a[der];
					  a[der]=a[izq];
					  a[izq]=valor;
					  izq++;
				  }
				  while(a[izq].compareTo(a[der])<0&&izq<der)izq++;
				  if(izq<der) {
					  valor=a[der];
					  a[der]=a[izq];
					  a[izq]=valor;
					  der--;
				  }  
			  }
			  if(r>izq)
				  q(a,izq+1,r);
			  if(i<der)
				  q(a,i,der-1);
			  
			  
		}
	}
