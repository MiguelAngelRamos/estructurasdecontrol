package estructurasjava;

public class EjemploWhile {

	public static void main(String[] args) {
		// while = mientras (Y se ejecuta mientras la expresi�n booleana sea verdadera)
		int x = 0;
		
		while( x < 100) {
			System.out.println(x);
			if (x == 50) {
				break; // con break interrumpo el ciclo
			}
			x++; //  x=x+1;
		}
		// break
		System.out.println("Fin de la ejecuci�n del While");
	}

}
