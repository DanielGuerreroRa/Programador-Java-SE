package view;

import java.util.Scanner;

import service.Cuenta;
import service.CuentaLimite;
import service.CuentaMovimientos;

public class PruebaCuenta {
	    /*Pide el saldo inicial y limite, después:
		1.- Ingresar
		2.- Extraer
		3.- Saldo y movimientos
		4.- Salir */

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Saldo inicial y limite");
		//CuentaMovimientos service=new CuentaMovimientos();
		
		int opcion;
		do {
			//presentar menu
			//leer opción y comprobar opcion elegida
			presentarMenu();
			opcion=teclado.nextInt();
			switch(opcion) {
				case 1:
					ingresar();
					break;
				case 2:
					extraer();
					break;
				case 3:
					saldoYMovimientos();
					break;
				case 4:
					System.out.println("Adios!");
					break;
				default:
					System.out.println("Opción no válida!");
			}
		}while(opcion!=4);

	}
	static void presentarMenu() {
		System.out.println("""
				1.- Ingresar
				2.- Extraer
				3.- Saldo y movimientos
				4.- Salir
				
				""");
	}
	static void ingresar() {
		
	}
	static void extraer() {
	
	}
	static void saldoYMovimientos() {
		
	}
	
}

