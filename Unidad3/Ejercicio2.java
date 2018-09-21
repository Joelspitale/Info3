package Unidad3;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		System.out.println("ingrese la base ");
		Scanner in=new Scanner(System.in);
		int base=in.nextInt();
		System.out.println("ingrese exponente");
		int exponente=in.nextInt();
		int total=expo(base,exponente);
		System.out.println(total);
	}
	private static int expo(int a,int b) {
		if(b==1) {
			return a;
		}
		return a*expo(a,b-1);
	}

}
