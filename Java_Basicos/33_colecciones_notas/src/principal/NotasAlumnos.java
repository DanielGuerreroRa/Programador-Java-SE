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

			ArrayList<Double> notas=new ArrayList<>();
			double nota;
			String respuesta;
			Scanner sc=new Scanner(System.in);
			do {

				System.out.println("Introduce la nota:"); //Pedir la nota
				nota=sc.nextInt(); //Escribirla
				notas.add(nota);  ////Guardarla
				System.out.println("Quieres introducir otra nota?(s/n)"); //Preguntar si quiere introducir más
				respuesta=sc.nextLine();
				
			}while(respuesta.equalsIgnoreCase("n"));

		}

	}
