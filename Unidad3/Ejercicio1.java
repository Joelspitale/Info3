package Unidad3;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println("Ingrese el numero del cual desee hacer el factorial");
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		System.out.println("El factorial del numero"+a+"es :"+factorial(a));
		int d=1;
		for(int j=a;j>1;j--) {
			System.out.println(j+"f("+(j-1)+")");
		    for(int i=0;i<d;i++) {
		    	//System.out.println("aaa");
			   System.out.print("\t");
		     }
		    d++;
		}
	}
	private static int factorial(int a) {
		if(a!=1) {
			return factorial(a-1)*a;
		}
		return 1;
	}
}
