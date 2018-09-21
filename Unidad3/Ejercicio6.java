package Unidad3;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		System.out.println("ingrese el numero entero que desea transformar en binario");
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		tranf(a);
	}
	private static void tranf(int a) {
		if(a<2) {
			System.out.println(1);
		}
		else {
			tranf(a/2);
			System.out.println(a%2);
		}
	}

}
