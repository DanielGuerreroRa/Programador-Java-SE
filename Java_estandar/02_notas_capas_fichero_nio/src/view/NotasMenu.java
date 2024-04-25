package view;

import java.util.Arrays;
import java.util.Scanner;

import exceptions.ErrorFuenteDatosException;
import service.NotasService;

public class NotasMenu {
	static NotasService service=new NotasService();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int opcion;
		do {
			//presentar menu
			//leer opción y comprobar opcion elegida
			presentarMenu();
			opcion=sc.nextInt();
			switch(opcion) {
				case 1:
					agregarNota();
					break;
				case 2:
					presentarMedia();
					break;
				case 3:
					presentarExtremas();
					break;
				case 4:
					mostrarNotas();
					break;
				case 5:
					System.out.println("Adios!");
					break;
				default:
					System.out.println("Opción no válida!");
			}
		}while(opcion!=5);

	}
	
	static void presentarMenu() {
		System.out.println("""
				1.- Agregar nota
				2.- Calcular nota media
				3.- Notas extremas
				4.- Ver todas
				5.- Salir
				
				""");
	}
	static void agregarNota() {
		double nota;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce nota:");
		nota=sc.nextDouble();
		service.agregarNota(nota);
	}
	static void presentarMedia() {
		try {
			System.out.println("La media es: "+service.media());
		} catch (ErrorFuenteDatosException e) {
			System.out.println("Hubo un error a leer las notas");
		}
	}
	static void presentarExtremas() {
		try {
			System.out.println("Nota más alta: "+service.max());
			System.out.println("Nota más baja: "+service.min());
		} catch (ErrorFuenteDatosException e) {
			System.out.println("Hubo un error a leer las notas. Más detalle:");
			System.out.println(e.getMessage());
		}
	}
	static void mostrarNotas() {
		/*Double[] notas=service.obtenerNotas();
		System.out.println("Las notas son:");
		for(Double n:notas) {
			System.out.println(n);
		}*/
		//System.out.println("Las notas son:"+Arrays.toString(service.obtenerNotas()));
		try {
			System.out.println("Las notas son:"+service.obtenerNotas());
		} catch (ErrorFuenteDatosException e) {
			System.out.println("Hubo un error a leer las notas");
			System.out.println(e.getMessage());
		}
	}

}
