package principal;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
	   //Hacer un programa que solicite dos números
	   //Y nos diga cuantos multiplos de 5 hay entre ambos numeros
		int num1;
		int num2;
		int numMenor;
		int numMayor;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el primer número:");
		num1=sc.nextInt();
		System.out.println("Introduce el segundo número:");
		num2=sc.nextInt();
		
		if(num1<num2) {
			numMenor=num1;
			numMayor=num2;
		}else {
			numMenor=num2;
			numMayor=num1;
		}
		
        int contador = 0;

        for (int i = numMenor; i <= numMayor; i++) {
            if (i % 5 == 0) {
                contador++; 
            }
        }
        System.out.println("Entre el número " +num1+ " y " +num2+ " hay " +contador+ " multiplos de 5");

       
    }
}
