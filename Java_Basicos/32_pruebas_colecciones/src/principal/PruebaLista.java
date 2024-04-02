package principal;

import java.util.ArrayList;

public class PruebaLista {

	public static void main(String[] args) {
		ArrayList<String> cadenas= new ArrayList<>();
		ArrayList<Integer> numeros= new ArrayList<>();
		var decimales=new ArrayList<Double>();
		//System.out.println(cadenas.size());
		cadenas.add("lunes");
		cadenas.add("martes");
		cadenas.add(0,"miercoles");
		//cadenas.add(7,"domingo"); //ERROR porque aun no existe la posición 8
		//System.out.println(cadenas.get(2)); //muestra la posición 2 de cadenas en este caso seria martes
		cadenas.remove(1);//Elimina martes que esta en la 2ª posición
		
		if(!cadenas.contains("martes")) {
			cadenas.add("martes");
		}
		
		for(int i=0;i<cadenas.size();i++)
		System.out.println(cadenas.get(i));//Para mostrar en consola toda la lista de cadenas
		
		
		

//		numeros.add(35);
//		numeros.add(numeros.get(0));
//		numeros.add(0,100);
//		System.out.println(numeros.get(1));
//		numeros.set(1,40);


	}

}
