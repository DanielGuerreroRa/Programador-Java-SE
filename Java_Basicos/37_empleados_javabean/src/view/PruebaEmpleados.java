package view;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import model.Empleado;
import service.EmpleadosService;


public class PruebaEmpleados {
	static Empleado e1=new Empleado();
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
		System.out.println("Código del empleado:");
		int codigo=Integer.parseInt(teclado.nextLine());
		System.out.println("Nombre del empleado:");
		String nombre=teclado.nextLine();
		System.out.println("Email del empleado:");
		String email=teclado.nextLine();
		System.out.println("Edad del empleado:");
		int edad=Integer.parseInt(teclado.nextLine());
		if(service.agregarEmpleado(codigo, nombre, email, edad)) {
			System.out.println("Añadido!");
		}else {
			System.out.println("--Código ya existente, no se añadió--");
		}
	}
	static void buscarEmpleado() {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Código empleado: ");
		int codigo=Integer.parseInt(teclado.nextLine());
		Empleado e1=service.buscarEmpleado(codigo);
		if(e1==null) {
			System.out.println("--No existe empleado--");
		}else {
			System.out.println("El empleado es: "+e1);
		}
	}
	static void eliminarEmpleado() {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Código empleado:");
		int codigo=Integer.parseInt(teclado.nextLine());
		Empleado e1=service.eliminarEmpleado(codigo);
		if(e1==null) {
			System.out.println("--No existe empleado--");
		}else {
			System.out.println("El empleado eliminado es: "+e1);
		}
	}
	static void mostrarEmpleados() {
		Empleado[] empleados=service.todosEmpleados();
		//System.out.println("Empleados: "+Arrays.toString(empleados));
		for(Empleado e:empleados) {
			System.out.println("Nombre: " +e.getNombre()+", edad: " +e.getEdad()+", email: " +e.getEmail());
		}
		
	}
	

}
