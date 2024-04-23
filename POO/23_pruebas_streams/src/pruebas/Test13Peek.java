package pruebas;

import java.util.List;

public class Test13Peek {

	public static void main(String[] args) {
		List<Integer> nums=List.of(11,4,5,8,2,7,5,8);
		//Muestra cada número de la lista, sin contar duplicados, y después el total de estos números
		System.out.println("Total de "+nums.stream()
			.distinct()
			.peek(n->System.out.println(n))//Stream<Integer>
			.count());
		
	}

}