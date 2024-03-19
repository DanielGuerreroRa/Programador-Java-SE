package principal;

import java.util.Scanner;

public class ComprobarPrimo {

	public static void main(String[] args) {
		int num;
		//leemos el número por teclado
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número:");
		num=sc.nextInt();
		//indicará si el número es o no primo 
		boolean esPrimo=true;
		for(int i=2;i<num;i++) {
			if(num%i==0) { //si la cumple, no es primo
				esPrimo=false;
			}
		}
		System.out.println("El número "+num+" es primo?"+esPrimo);
	}

}

