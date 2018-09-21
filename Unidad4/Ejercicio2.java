package Unidad4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio2 {

		public static void main(String[] args) throws FileNotFoundException {
			Scanner f = new Scanner(new File("src/Unidad4/es.txt"));//utf8
			String aux  =f.useDelimiter("\\A").next();
			String []a = aux.split("\n");
			String [] b=a;
			String [] c=a;
			System.out.println("El vector tiene un tamanio de :"+a.length);
			long time_start, time_end;
			time_start = System.currentTimeMillis();
			q(a,0,a.length-1);
			time_end = System.currentTimeMillis();
			System.out.println("El metodo quicshort toma un tiempo: "+ ( time_end - time_start ) +" milisegundos");
			time_start=0;
			time_end=0;
			time_start = System.currentTimeMillis();
			insercion(b);
			time_end = System.currentTimeMillis();
			System.out.println("El metodo de insercion toma un tiempo: "+ ( time_end - time_start ) +" milisegundos");
			/*for(String w:b) {
				System.out.println(w);
			}*/
			time_start=0;
			time_end=0;
			time_start = System.currentTimeMillis();
			shell(c,c.length-1);
			time_end = System.currentTimeMillis();
			System.out.println("El metodo shell toma un tiempo: "+ ( time_end - time_start ) +" milisegundos");
			
		}
		
		private static void insercion(String[] b) {
			int i,j;
			for(i=1;i<b.length;i++) {
				String valor=b[i];
				for(j=i;( j>0 && valor.compareTo(b[j-1])<0 );j--) b[j]=b[j-1];
					b[j]=valor;
			}
		}
		private static void shell(String a[],int tamanio) {
			  String valor;
			  for(int gap=tamanio/2;gap>0;gap/=2) {
				  for(int i=gap;i<tamanio;i++) {
					  for(int j=i-gap;(j>=0 &&(a[j+gap].compareTo(a[j])<0));j-=gap) {
						  valor=a[j+gap];
						  a[j+gap]=a[j];
						  a[j]=valor;
					  }
				  }
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
