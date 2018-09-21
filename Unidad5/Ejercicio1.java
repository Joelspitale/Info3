package Unidad5;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Cola_String c= new Cola_String();
		Scanner in=new Scanner(System.in);
		int opc=1;
		String add;
		while(opc!=0) {
			System.out.println("1==insertar cita,2==eliminar proxima cita,0==salir,3==mostrar proxima cita");
			opc=in.nextInt();
			switch(opc) {
					case 1:
						System.out.println("ingrese el nombre de la persona que desea agendar para el,"
								+ "proximo turno");
						System.out.println("\n");
						in.nextLine();
						add=in.nextLine();
						c.encolar(add);
						break;
					case 2:
						try {
						System.out.println("se a eliminado su proxima cita que correspondia a:"
								+ c.desencolar());
						}catch(Exception e) {
							System.out.println(e.getMessage());
						}
						break;
					case 3:
				try {
					System.out.println("La proxima cita que tiene es con:"+ c.mostrar());
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
						
			}
		}
		System.out.println("gracias por venir");
	}

}
