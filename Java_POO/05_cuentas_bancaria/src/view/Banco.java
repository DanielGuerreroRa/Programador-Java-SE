package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.Movimientos;
import service.CuentaMovimientos;

public class Banco {
	static CuentaMovimientos cuentamov;
	public static void main(String[] args) {
		//pido saldo, pido límite y creo el objeto CuentaMovimientos
		double saldo,limite;
		Scanner teclado=new Scanner(
				System.in
				);
		System.out.println("Introduce saldo:");
				saldo=Double.parseDouble(teclado.nextLine());
				System.out.println("Introduce límite:");
						limite=Double.parseDouble(teclado.nextLine());
						cuentamov=new CuentaMovimientos(saldo, limite);
						//ahora viene el rollo menú...
						int opcion;
						do {
							mostrarMenu();
							opcion=teclado.nextInt();//lee la opción elegida
							switch(opcion) { //evaluamos
							case 1:
								ingresar();
								break;
							case 2:
								extraer();
								break;
							case 3:
								mostrarMovimientos();
								break;				
							case 4:
								System.out.println("--Hasta Pronto--");
							}
						}while(opcion!=4);	
	}

	//resto de métodos
	static void mostrarMenu() {
		System.out.println("1.- Ingresar dinero");
		System.out.println("2.- Extraer dinero");
		System.out.println("3.- Mostrar movimientos");
		System.out.println("4.- Salir");		
	}
	static void ingresar() {
		Scanner teclado=new Scanner(
				System.in
				);
		double cantidad;
		System.out.println("Introduce cantidad:");
		cantidad=Double.parseDouble(teclado.nextLine());
		cuentamov.ingresar(cantidad);
	}
	static void extraer() {
		Scanner teclado=new Scanner(
				System.in
				);
		double cantidad;
		System.out.println("Introduce cantidad:");
		cantidad=Double.parseDouble(teclado.nextLine());
		cuentamov.extraer(cantidad);
	}
	static void mostrarMovimientos() {
		ArrayList<Movimientos> movs=cuentamov.obtenerMovimientos();
		for(Movimientos m:movs) {
			System.out.println(m.getTipo()+": "+m.getCantidad());
		}
		System.out.println("Saldo final: "+cuentamov.ObtenerSaldo());
	} 

}
