package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisiones {

	public static void main(String[] args) {
		//Hacer un programa que solicite la instrucción de dos números enteros
		//Y después muestre el resultado de dividir uno entro otro
		Scanner teclado=new Scanner(System.in);
		int n1,n2, div;
		try {
			System.out.println("Introduce un número:");
			n1=teclado.nextInt();
			System.out.println("Introduce otro número:");
			n2=teclado.nextInt();
			div=n1/n2;
			System.out.println("La división es: "+div);
		}
		catch(InputMismatchException ex) {
			System.out.println("--Debe ser un número--");
		}
		catch(ArithmeticException ex) {
			System.out.println("--La división entre 0 no es válida--");
		}
		//multicatch
				/*catch(InputMismatchException|ArithmeticException ex) {
					System.out.println("error en los datos");
				}*/

	}

}