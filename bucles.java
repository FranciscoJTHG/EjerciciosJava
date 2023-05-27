
public class bucles {

	public static void main(String[] args) {
		
		int numeroIf, numeroWhile, numeroFor;
		
		numeroIf = -4;
		
			
		if (numeroIf == 0) {
			System.out.println("El numero es: "+ numeroIf);
		} else if (numeroIf > 0) {
			System.out.println("El numero es positivo: "+ numeroIf);
		} else {
			System.out.println("El numero es negativo: "+ numeroIf);
		}
		
		numeroWhile = 0;
		
		// Bucle While
		while (numeroWhile < 3) {
			System.out.println("While: "+ numeroWhile);
			numeroWhile += 1;
		}
		
		// Bucle Do While
		do {
			System.out.println("Do While: "+ numeroWhile);
		} while (numeroWhile > 3);

		
		for (numeroFor = 0; numeroFor <= 3; numeroFor++) {
			System.out.println("numeroFor: "+ numeroFor);
		}
		
		String estacion;
		
		estacion = "Otoño";
		
		// Bucle Switch
		switch (estacion) {
			case "Invierno":
				System.out.print("Es: "+ estacion);
				break;
			case "Verano":
				System.out.print("Es: "+ estacion);
				break;
			case "Otoño":
				System.out.print("Es: "+ estacion);
				break;
			case "Primavera":
				System.out.print("Es: "+ estacion);
				break;
		}
	}

}
