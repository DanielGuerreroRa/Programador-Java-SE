package principal;

public class SumarHastaMil {

	public static void main(String[] args) {
		//Hasta que número tengo que sumar empezando desde 1 para llegar hasta mil
		
		int num=0;
		int suma=0;
		
		do {
			num++;
			suma+=num;
		}while(suma<1000);
		System.out.println("Para llegar a mil e tenido que sumar hasta " + num);

	}

}
