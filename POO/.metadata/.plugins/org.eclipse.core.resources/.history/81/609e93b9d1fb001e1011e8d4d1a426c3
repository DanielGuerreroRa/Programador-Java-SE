package view;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Prueba1 {

	public static void main(String[] args) {

		int sumaDePares= 0;
		LinkedList<Integer> lista = new LinkedList<>();
		lista.add(8);//Añadimos las listas
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(6);

		System.out.println("Los pares suman en total:");
		System.out.println(sumaPares(lista)); //Utilizamos el método con la lista para que devuelva la suma de los pares
        System.out.println("La media de la lista es: ");
		System.out.println(media(lista)); //Utilizamos el método con la lista para que devuelva la media


	}
	//Crear un método que reciba una lista de Integer y devuelva la suma de los pares de dicha lista
	public static int sumaPares(List<Integer> num) {
		int sumaPar=0;
		for (Integer n:num) {
			if (n%2==0) { //Verificamos si el número es par
				sumaPar+=n; //Sumamos los pares
			}
		}
		return sumaPar; //Devuelve la suma total de los números pares
	}

	//Crear un método que reciba una colección de Integer y devuelva la media de los valores de dicha colección
	public static int media(Collection<Integer> num) {
		int media=0;
		for(Integer n:num) {
			media+=n; //Sumamos cada número de la colección a media
		}
		// Devolvemos la media, que es la suma de todos los números divididos por el tamaño de la colección
		return media / num.size();
	}
}
