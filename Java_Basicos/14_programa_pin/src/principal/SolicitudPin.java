package principal;

import java.util.Scanner;

public class SolicitudPin {

	public static void main(String[] args) {
		//Hacer un programa que solicite la introducción de un PIN
		//Si es correcto, le muestra un mensaje y el programa termina
		//Si es incorrecto, le informa de ello al usuario y le solicita
		//De nuevo el pin. Si falla tres veces en la introducción del pin
		//Le muestra mensaje de error, y el programa termina

		final int PIN_VALIDO = 1234;
		int codigoPIN;
		int intentos = 0;
		Scanner teclado = new Scanner(System.in);

		while (intentos < 3) {
			System.out.println("Introduzca el codigo PIN: ");
			codigoPIN = teclado.nextInt();
			if (codigoPIN == PIN_VALIDO) {
				System.out.println("PIN correcto");
				break;
			} else {
				intentos++; // Incrementar el contador de intentos fallidos
				System.out.println("Su PIN es incorrecto le quedan " +(3 - intentos)+ " intentos" );
				if (intentos == 3) {
					System.out.println("Intruso.. ¡¡NO puedes entrar!!");
					break; 
				}
			}
		}
	}
}

	

		
		




