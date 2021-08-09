package estructurasjava;

import java.util.Scanner;

public class EjercicioSwitchCase {
	// Variables de clase
	static Scanner sc = new Scanner(System.in); // Sirve para recoger valores del usuario
    static int select = -1; // opcion elegida por el usuario
    static int num1= 0, num2 = 0; // variables
	
	public static void main(String[] args) {
		// llamamos a un metodo no estatico, creando su instancia en caso la instancia de la clase EjercicioSwitchCase
		EjercicioSwitchCase esc = new EjercicioSwitchCase();
		esc.miMetodo();
		// Mientras la opcion elegida sea 0, preguntamos al usuario
		while(select !=0) {
			// trye catch para evitar que el programa termine si hay un error
			try {
				System.out.println(
						"Elige una opción\n1.- Sumar" +
					    "\n2.- Restar \n"	+
						"3.- Multiplicar \n" +
					    "4.- Dividir \n" +
						"0.- Salir");
				// Recibir opcion del usuario
				select = Integer.parseInt(sc.nextLine());
				// swich case opciones aritmeticas
				switch(select) {
					case 1: 
						pedirNumeros();
						System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
						break;
					case 2: 
						pedirNumeros();
						System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
						break;
					case 3: 
						pedirNumeros();
						System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
						break;
					case 4:
						pedirNumeros();
						System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
					case 0:
						System.out.println("Hasta pronto, adios!");
						break;
					default: 
						System.out.println("Opcion no valida");
						break;
					} // fin del switch
				
			} catch (Exception e) {
				System.out.println("Ha ocurrido un error!");
				
			}
		} // fin while
	} // main
	// Como es un metodo estatico no necesito instancia. puedo acceder a el directamente.
	  public static void pedirNumeros() {
		  System.out.println("Introduce numero 1");
		  num1 = Integer.parseInt(sc.nextLine());
		  
		  System.out.println("Introduce el numero 2");
		  num2 = Integer.parseInt(sc.nextLine());
		  
		  System.out.println("\n");
	  }
	  
	  public void miMetodo() {
		  System.out.println("Soy tu metodo");
	  }

} // fin de la clase
