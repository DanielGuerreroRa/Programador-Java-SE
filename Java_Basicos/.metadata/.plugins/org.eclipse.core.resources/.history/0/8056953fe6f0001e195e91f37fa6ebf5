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

		ArrayList<Integer> notas=new ArrayList<Integer>();
		int nota;
		String respuesta;
		Scanner sc=new Scanner(System.in);

		do {
			System.out.println("Introduce nota"); //Pedir la nota
			nota=Integer.parseInt(sc.nextLine()); //Convertirla para que la lea en string //Escribirla
			notas.add(nota); //Guardarla
			System.out.println("Quieres introducir otra nota?(s/n)"); //Pregunbar si quiere ingresar otra
			respuesta=sc.nextLine();

		}while(respuesta.equalsIgnoreCase("s"));
		System.out.println("Nota media: " +calcularMedia(notas));
		System.out.println("Alumnos aprobados: " +totalAprobados(notas));
		System.out.println("Nota mas alta: " +notaMayor(notas));
	}

	static double calcularMedia(ArrayList<Integer> notas) {
		double notaMedia=0;
		for(Integer nota :notas) {
			notaMedia+=nota;
		}
		return notaMedia/notas.size();
	}

	static int totalAprobados(ArrayList<Integer> notas) {
		int aprobados=0;
		for (int nota : notas) {
			if (nota >= 5) {
				aprobados++;
			}
		}
		return aprobados;
	}
	static int notaMayor(ArrayList<Integer> notas) {
		int mayor=notas.get(0);
		for(Integer nota:notas) {
			if(nota>mayor) {
				mayor=nota;
			}
		}
		return mayor;
	}

}

