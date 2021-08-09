package estructurasjava;

public class EjemploDoWhile {

	public static void main(String[] args) {
		int x = 1;
		
		do {
			System.out.println("Soy el do while");
			System.out.println(x);
			x++; // x = x + 1;
		} while(x < 100);
		
		/*
		 * Si la condición no se cumple en el "do while" la parte del do se ejecuta al menos una vez.
		 * */
		
		System.out.println("Fin de la ejecución del do while");

	}

}
