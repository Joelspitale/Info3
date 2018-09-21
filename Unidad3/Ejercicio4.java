package Unidad3;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		System.out.println("ingrese el primer numero ");
		Scanner in=new Scanner(System.in);
		int pri=in.nextInt();
		System.out.println("ingrese el  numero por el que se va a dividir");
		int seg=in.nextInt();
		int total=divi(pri,seg);
		System.out.println(total);
	}
	private static int divi(int a,int b) {
		if(((a-b)<=0)||((a-b)<b)){
			return 1;
		}
		return divi(a-b,b)+1;
   }
}
