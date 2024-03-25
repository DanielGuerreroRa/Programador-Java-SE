package principal;

public class PruebaArray {

	public static void main(String[] args) {
		int[] notas= {3,8,5,4,9};
		//Haz un programa que sume un punto a cada alumno por buen corpontamiento
		//Y después nos muestre todas las notas
		
		for(int i=0;i<notas.length;i++) {
			notas[i]++;
			System.out.println("Las notas de los alumnos son: " +notas[i]);
		}
		
	}
}
