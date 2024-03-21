package principal;

public class Dado {

	public static void main(String[] args) {
		//Ejemplo de tirar el dado y que salga un numero random de 1 al 6
		
		/*int dado=(int)(Math.random()*6+1);
		System.out.println(dado);*/
		
		
		//Lanzaremos el dado 10000 y después mostraremos los porcentajes de cada número

		final int LANZAMIENTOS=10_000;
		int[] contadores=new int[6];
		//var rnd= new Random();  ---  EJEMPLO PARA SUSTITUIR  ---
		for(int i=1;i<=LANZAMIENTOS;i++) {
			
			//lanzamiento de dado
			int dado=(int)(Math.random()*6+1);
			//int dano = rnd.nextInt(6)+1; --- POR EL MATH.RANDOM  ---

			//siempre se incrementa la posición del array
			//cuyo índice es el valor del dado menos 1
			contadores[dado-1]++;
		}
		
		for(int i=0;i<contadores.length;i++) {
			System.out.println("El porcentaje del número "+(i+1)+": "+contadores[i]*100.0/LANZAMIENTOS);
		}

	}

}