package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class NotasAlumnos {

	public static void main(String[] args) {
		//Realizar un programa para solicitar al usuario las notas de un grupo de alumnos.
		//Al iniciarse el programa, se le pide al usuario que introdzca la nota y esta se guardara.
		//Después, se le preguntara si quiere introducir una nueva nota, si dice que sí,
		//se le pide otra nota y así sucesivamente hasta que diga que no.
		//Cuando se hayan guardado todas las notas, el programa mostrará los siguientes datos:
		//-Nota media
		//-Aprobados
		//-Nota más alta 

		//Crear una lista de enteros para almacenar las notas
		ArrayList<Integer> notas = new ArrayList<Integer>();
		int nota; //Para almacenar las notas ingresadas
		String respuesta; //Para almacenar la respuesta del usuario
		Scanner teclado=new Scanner(System.in);
		
	
		do {
			System.out.println("Introduce nota"); //Pedir al usuario que ingrese una nota
			nota=Integer.parseInt(teclado.nextLine()); //Leer la nota ingresada por el usuario y convertirla a un entero
			notas.add(nota); //Agregar la nota a la lista de notas
			System.out.println("Quieres introducir otra nota?(s/n)"); // Preguntar al usuario si quiere ingresar otra nota
			respuesta = teclado.nextLine(); //Leer la respuesta del usuario
		} while (respuesta.equalsIgnoreCase("s")); //Continuar ejecutando el bucle mientras la respuesta del usuario sea "s"

		
		System.out.println("Nota media: " +calcularMedia(notas));
		System.out.println("Alumnos aprobados: " +totalAprobados(notas));
		System.out.println("Nota mas alta: " +notaMayor(notas));
	}


	static double calcularMedia(ArrayList<Integer> notas) {
		double notaMedia=0; //Para almacenar la suma de todas las notas
		//Iterar a través de todas las notas en la lista y sumarlas
		for (Integer nota:notas) {
			notaMedia+=nota;
		}
		//Calcular y devolver la media dividiendo la suma de las notas por el número total de notas
		return notaMedia/notas.size();
	}

	static int totalAprobados(ArrayList<Integer> notas) {
		int aprobados=0; //Para contar el número de alumnos aprobados
		//Iterar a través de todas las notas en la lista
		for (int nota:notas) {
			//Si la nota es mayor o igual a 5, incrementar el contador de aprobados
			if (nota>=5) {
				aprobados++;
			}
		}
		//Devolver el número total de alumnos aprobados
		return aprobados;
	}

	static int notaMayor(ArrayList<Integer> notas) {
		int mayor = notas.get(0); //Inicializar la variable "mayor" con la primera nota de la lista
		//Iterar a través de todas las notas en la lista
		for (Integer nota : notas) {
			//Si la nota actual es mayor que la nota almacenada en la variable "mayor", actualizar "mayor" con la nueva nota
			if (nota>mayor) {
				mayor=nota;
			}
		}
		//Devolver la nota más alta encontrada
		return mayor;
	}
}