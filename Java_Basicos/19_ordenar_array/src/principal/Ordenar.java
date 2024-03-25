package principal;

import java.util.Arrays;

public class Ordenar {

	public static void main(String[] args) {
		//Ordenar las edades de menor a mayor
		int[] edades= {19,26,14,55,38,27,30};
		
//		for(int i=0;i<edades.length;i++) {
//			for(int j=i+1;j<edades.length;j++) {
//				if(edades[j]<edades[i]) { //intercambio de edades de menor a mayor
//					int aux=edades[j];
//					edades[j]=edades[i];
//					edades[i]=aux;
//				}
//			}
//		}
		
		Arrays.sort(edades); //Con la class Arrays.sort() nos ayuda a ordenar de mayor a menor
		                     //Y nos ahorra hacer los tres bucles 
		System.out.println("Edades de menor a mayor:");
		for(int edad:edades) {
			System.out.print(edad+",");
		}

	}

}
