package estructurasjava;

public class EjemploIf {
	public static void main(String[] args) {
		/* Supongamos que una persona desea ver una pelicula
		 * La pelicula tiene como requisito que sea mayor de edad (Mayor a 18)
		 * */
		int edad = 8;
		// if = SI
		System.out.println(edad >= 18);
		if(edad >= 18) {
			System.out.println("Es mayor de edad");
			System.out.println("Tienes acceso a ver la pelicula");
		} else if(edad <=8 ) {
			System.out.println("Informar a sus padres y no permitir la entrada");
		} else {
			System.out.println("Solo se permiten mayores de edad");
		} // fin del If
		
		} // fin del main
	}
	
