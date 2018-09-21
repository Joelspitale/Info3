package Unidad3;

public class Ejercicio5 {

	public static void main(String[] args) {
		int [] b={9,10,4,5};
		for(int a:b) {
			System.out.print(a+"\t");
		}
		System.out.println();
		mostrar(b,b.length-1);
	}
	private static void mostrar(int []b,int tamanio) {
		if(tamanio==0) {
			System.out.println(b[0]);
		}
		else {
		System.out.print(b[tamanio]+"\t");
		  mostrar(b,tamanio-1);
		}
	}
}
