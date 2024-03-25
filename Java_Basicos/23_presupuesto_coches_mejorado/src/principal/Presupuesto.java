package principal;

import java.util.Scanner;

public class Presupuesto {

	public static void main(String[] args) {
		//Dado los datos de coches, se le pedira al cliente cual
		//es su presupuesto y el programa indicara a cuantos coches puede optar

		String[] preciosCoches= {"Volvo-19_000","Audi-23_450","Seat-15_251","Bmw-30_251","Renault-15_365","Opel-19_251"};
		double presupuesto;
		int n=Integer.parseInt("100");
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese su presupuesto: ");
		presupuesto=teclado.nextDouble();


		for (String coche : preciosCoches) {
			coche=coche.replace("_", "");//Para poder leer o sustituir _ por espacio " "
			int posicion=coche.indexOf("-");
			String marca =coche.substring(0,posicion);
			double precio=Double.parseDouble(coche.substring(posicion+1,coche.length()));

			if(presupuesto>=precio) {
				System.out.println("Te puedes comprar un " +marca);
			}else {

			}


		}

	}
}