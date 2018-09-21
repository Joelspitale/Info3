package Unidad3;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		System.out.println("ingrese el primer numero ");
		Scanner in=new Scanner(System.in);
		int pri=in.nextInt();
		System.out.println("ingrese el segundo numero");
		int seg=in.nextInt();
		int total=multipli(pri,seg);
		System.out.println(total);
	}
	private static int multipli(int a,int b) {
		if(b==1) {
			return a;
		}
		return multipli(a,b-1)+a;
	}

}
