package semana_santa;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio_1 {
	public static void main(String[] args) {
		//Programa que muestre seis números aleatorios, 
		//no repetidos, entre 1 y 49, ordenados de menor a mayor

		//Array de seis números
		int[] numeros=new int[6];

		//Generar seis números aleatorios no repetidos entre 1 y 49 con la clase Random
		Random random = new Random();
		for (int i=0; i<numeros.length; i++) {
			int numeroAleatorio;
			do {
				numeroAleatorio = random.nextInt(49)+1;
				//Verificar que el número esta entre el 1 y 49
			} while (noRepetidos(numeros, numeroAleatorio)); 
			numeros[i] = numeroAleatorio;
		}

		//Ordenar de menor a mayor con el método sort
		Arrays.sort(numeros);

		//Mostrar los números ordenados
		System.out.println("Lista de números aleatorios:");
		for (int numero : numeros) {
			System.out.print(numero + "\n");
		}
	}

	//Metodo para verificar que el número no se repite ne la lista
	private static boolean noRepetidos(int[] lista, int numero) {
		for (int valor : lista) {
			if (valor == numero) {
				return true;
			}
		}
		return false;
	}
}