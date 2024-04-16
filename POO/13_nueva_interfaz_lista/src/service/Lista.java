package service;
import java.util.ArrayList;
import java.util.List;

//Crear una subinterfaz de List<Integer>, que añada los siguientes métodos estáticos:
public interface Lista extends List<Integer>{
	
	//-List<Integer> ofPares(int n). Devuelve una lista con los n primeros numeros pares	
	public static List<Integer> ofPares(int n) {
		 //Creamos un array del tamaño n para almacenar los números pares.
	    Integer[] result = new Integer[n];
	    //num y cont  para seguir la cantidad de números pares que hemos agregado al array.
	    int num = 0, cont = 0;
	    //hasta que hayamos agregado n números pares al array.
	    while (cont < n) {
	        //Asignamos el número par actual en la posición cont del array.
	        result[cont] = num;
	        //Incrementamos num en 2 para obtener el siguiente número par.
	        num += 2;
	        //Incrementamos cont para indicar que hemos agregado otro número par al array.
	        cont++;
	    }
	    //Convertimos el array resultante en una lista inmutable utilizando el método List.of().
	    return List.of(result);
    }
	
	//-List<Integer> ofPositivos(int ... data). Devuelve una lista solo 
	//con los números positivos del grupo de números recibidos como parámetro 
	public static List<Integer> ofPositivos(int... data){
		  //Creamos una lista para almacenar los números positivos.
	    List<Integer> listaPositivos = new ArrayList<>();
	    //Iteramos sobre todos los elementos del array data.
	    for (int n : data) {
	        //Verificamos si el número es positivo.
	        if (n > 0) {
	            //Lo agregamos a la lista de números positivos.
	            listaPositivos.add(n);
	        }
	    }
	    //Devolvemos la lista
	    return listaPositivos;
	}
}