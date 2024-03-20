package principal;

import java.util.Scanner;

public class ComprobarPresupuesto {

	public static void main(String[] args) {
		//Dado una serie de precios de coches, se le pedira al cliente cual
		//es su presupuesto y el programa indicara a cuantos coches puede optar
		
		double[] precios= {19_000.0,23_450,15_251.35,30_251,15_365.25,19_251.65};
		double presupuesto;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Indiquenos su presupuesto: ");
		presupuesto=teclado.nextDouble();
		double contador=0;
		
		primero: for(double elemento :precios) {
			if(presupuesto >= elemento) {
				contador++;
			}else {
				System.out.println("No tiene presupuesto suficiente.. ¡¡AHORREEE!!");
				break primero;
			}
		}
		System.out.println("Tiene presupuesto para " +contador+ " posibles coches");
		
	}

}
