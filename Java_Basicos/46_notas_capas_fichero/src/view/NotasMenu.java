package view;

import java.util.Arrays;
import java.util.Scanner;

import service.NotasService;

public class NotasMenu {
	
		static NotasService service=new NotasService();
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int opcion;
			do {
				//presentar menu
				presentarMenu();
				//leer opción y comprobar opcion elegida
				opcion=sc.nextInt();
				switch(opcion) {
					case 1:
						agregarNota();
						System.out.println();
						break;
					case 2:
						presentarMedia();
						System.out.println();
						break;
					case 3:
						presentarExtremas();
						System.out.println();
						break;
					case 4:
						mostrarNotas();
						System.out.println();
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
			System.out.println("La media es: "+service.media());
		}
		static void presentarExtremas() {
			System.out.println("Nota más alta: "+service.max());
			System.out.println("Nota más baja: "+service.min());
		}
		static void mostrarNotas() {
			/*Double[] notas=service.obtenerNotas();
			System.out.println("Las notas son:");
			for(Double n:notas) {
				System.out.println(n);
			}*/
			System.out.println("Las notas son:"+Arrays.toString(service.obtenerNotas()));
		}

	}