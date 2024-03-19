package principal;

public class SumaPares {

	public static void main(String[] args) {
		//Calcula la suma de todos los numeros pares comprendidos entre 1 y 10
		
		int suma=0;
		//Recorremos todos los números de 1 al 10
		for(int i=1; i<=10; i++) {
			//Y si es par
			if(i%2==0) {
				//lo sumamos a la suma
				suma=suma+i;
			}
		}
		System.out.println(suma);

	}

}
