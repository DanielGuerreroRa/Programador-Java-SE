package principal;

import java.util.Scanner;

public class InvertirTexto {

	public static void main(String[] args) {
		//Solicita la introduccion de un texto, y mque se muestre invertido.
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un texto: ");
		String texto = teclado.nextLine();


		//llamamos al metodo invertir (con el texto introducido)
		System.out.println("Texto invertido: " + invertir(texto));

	}

	static String invertir(String cad) {
		//Almacenar el texto invertido
		StringBuilder textoInvertido = new StringBuilder();
		//Recorrer el texto de atrás hacia adelante
		for (int i=cad.length()-1 ; i>=0 ; i--) {
			//Extraemos los caracteres y los añadimos al StringBuilder
			textoInvertido.append(cad.charAt(i));
		}
		return textoInvertido.toString();
	}

}
