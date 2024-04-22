package pruebas;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test10Partition {

	public static void main(String[] args) {
		List<Integer> nums=List.of(25,2,8,-3,2,4,11,-1,-20,8);
		//Crear una tabla donde estén agrupados los negativos por un lado y los positivos por otro
		Map<Boolean,List<Integer>> tabla= nums.stream()
				//Se utiliza partitioningBy() para dividir la lista en dos grupos basados en la condición de que un número sea positivo o no		
				.collect(Collectors.partitioningBy(n->n>0)); 
		
		Map<Boolean,Integer> tablaSum= nums.stream()
				//Se utiliza partitioningBy() con un segundo argumento, summingInt(), para sumar los valores de cada grupo y almacenar el resultado en un mapa
				.collect(Collectors.partitioningBy(n->n>0,Collectors.summingInt(n->n)));
	}

}