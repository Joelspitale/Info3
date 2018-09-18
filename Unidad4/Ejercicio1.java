package Unidad4;

public class Ejercicio1 {

	public static void main(String[] args) {
		int enteros[] = {10,13,25,1,2};
		double[] dou={10.1,13.4,25.1,1.9,2.22,25.9};
		char [] letra= {'A','a' ,'3','t','R','d'};
		
		
		System.out.println("vector desordenado de enteros");
		for(int a:enteros) {
			System.out.print(a+"\t");
			
		}
		System.out.println();
		System.out.println("Ordenar el vector de los enteros");
		insercion(enteros);
		
		System.out.println("vector ordenado de enteros");
		for(int a:enteros) {
			System.out.print(a+"\t");
			
		}
		
		
		
		System.out.println();
		System.out.println("vector desordenado de decimales");
		for(double a:dou) {
			System.out.print(a+"\t");
			
		}
		shell(dou,dou.length);
		System.out.println();
		System.out.println("el vector ordenado");
	    for(double a:dou) {
		    System.out.print(a+"\t");	
    	}
	    
	    
	    System.out.println();
	    
	    System.out.println("El vector de caracteres desordenado");
	    for(char a:letra) {
	    	System.out.print(a);
	    }
	    System.out.println();
	    q(letra,0,(letra.length-1));
	    System.out.println("El vector de caracteres ordenado");
	    for(char a:letra) {
	    	System.out.print(a);
	    }
	    
	    
	    
	}
	  private static void q(char[] a, int i,int r) {
		  int izq=i;
		  int der=r;
		  char valor;
		  
		  while(izq<der) {
			  while(a[izq]<a[der]&&izq<der)der--;
			  if(izq<der) {
				  valor=a[der];
				  a[der]=a[izq];
				  a[izq]=valor;
				  izq++;
			  }
			  while(a[izq]<a[der]&&izq<der)izq++;
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
	private static void insercion(int a[]) {
		int i,j;
		for(i=1;i<a.length;i++) {
			int valor=a[i];
			for(j=i;((j>0)&&(valor<a[j-1]));j--) a[j]=a[j-1];
				a[j]=valor;
		}
	}
	  private static void shell(double a[],int tamanio) {
		  double valor;
		  for(int gap=tamanio/2;gap>0;gap/=2) {
			  for(int i=gap;i<tamanio;i++) {
				  for(int j=i-gap;((j>=0)&&(a[j+gap]<a[j]));j-=gap) {
					  /*valor=a[j];
					  a[j]=a[j+gap];
					  a[j+gap]=valor;
					  */
					  //System.out.println("hola:"+a[j+gap]+"<"+a[j]);
					  valor=a[j+gap];
					  a[j+gap]=a[j];
					  a[j]=valor;
				  }
			  }
		  }
	  }

}