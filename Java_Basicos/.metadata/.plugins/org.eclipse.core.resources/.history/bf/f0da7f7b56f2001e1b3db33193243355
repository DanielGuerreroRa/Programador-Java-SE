package view;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import service.EmpleadosService;


public class PruebaEmpleados {
	static EmpleadosService service=new EmpleadosService();
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int opcion;
		do {
			//presentar menu
			//leer opción y comprobar opcion elegida
			presentarMenu();
			opcion=teclado.nextInt();
			switch(opcion) {
				case 1:
					agregarEmpleado();
					System.out.println();
					break;
				case 2:
					buscarEmpleado();
					System.out.println();
					break;
				case 3:
					eliminarEmpleado();
					System.out.println();
					break;
				case 4:
					mostrarEmpleados();
					System.out.println();
					break;
				case 5:
					System.out.println("¡Hasta pronto!");
					break;
				default:
					System.out.println("--Opción no válida--");
			}
		}while(opcion!=5);

	}
	static void presentarMenu() {
		System.out.println("""
				1.- Agregar empleado
				2.- Buscar empleado
				3.- Eliminar empleado
				4.- Mostrar empleados
				5.- Salir
				
				""");
	}
	static void agregarEmpleado() {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Código empleado:");
		int codigo=Integer.parseInt(teclado.nextLine());
		System.out.println("Nombre empleado:");
		String nombre=teclado.nextLine();
		if(service.agregarEmpleado(codigo, nombre)) {
			System.out.println("Añadido!");
		}else {
			System.out.println("--Código ya existente, no se añadió--");
		}
	}
	static void buscarEmpleado() {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Código empleado: ");
		int codigo=Integer.parseInt(teclado.nextLine());
		String nombre=service.buscarEmpleado(codigo);
		if(nombre==null) {
			System.out.println("--No existe empleado--");
		}else {
			System.out.println("El empleado es: "+nombre);
		}
	}
	static void eliminarEmpleado() {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Código empleado:");
		int codigo=Integer.parseInt(teclado.nextLine());
		String nombre=service.eliminarEmpleado(codigo);
		if(nombre==null) {
			System.out.println("--No existe empleado--");
		}else {
			System.out.println("El empleado eliminado es: "+nombre);
		}
	}
	static void mostrarEmpleados() {
		String[] empleados=service.todosEmpleados();
		System.out.println("Empleados: "+Arrays.toString(empleados));
	}
	
//	Realizar un programa para la gestión de empleados de una empresa. Un empleado se caracteriza por un nombre,un email, edad y tiene asociado un código de empleado.
//	al iniciar el programa, aparecerá el siguiente menú:
//	1.- Nuevo empleado
//	2.- Buscar empleado
//	3.- Eliminar empleado
//	4.- Mostrar datos de todos los empleados
//	5.- Salir
//
//	1: Se pide el nómbre, email, edad y código del empleado. Si no existe empleado con ese código, se guarda, pero si el código ya existe, no se guarda y se muestra advertencia al usuario
//	2: Se pide el código del empleado y se muestran sus datos
//	3: Se pìde el código del empleado y se borra, indicando un mensaje que diga el nombre del empleado que se ha borrado
//	4.- Muestra datos de todos los empleados 
}
