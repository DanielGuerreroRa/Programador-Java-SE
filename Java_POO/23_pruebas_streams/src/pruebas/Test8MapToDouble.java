package pruebas;

import java.util.List;

public class Test8MapToDouble {

	public static void main(String[] args) {
		List<Integer> nums=List.of(25,2,8,-3,2,4,11,-1,-20,8); 
		//Suma de todos los números negativos
		System.out.println(nums.stream()//Stream<Integer>
		 .filter(num->num<0) //Números negativos
         .mapToInt(n->n) //Convertir el Integer 
         .sum()); //Suma de números
		
		//Media de los positivos, sin duplicarlos
        nums.stream()
                .filter(n->n>0) //Filtrar los números positivos
                .distinct() //Elimina los duplicados
                .mapToInt(n->n) //Convertir el Integer 
                .average() //Calcular la media
                .ifPresentOrElse(r-> System.out.println(r), ()->System.out.println("--No hay números positivos--"));
		
	}

}
