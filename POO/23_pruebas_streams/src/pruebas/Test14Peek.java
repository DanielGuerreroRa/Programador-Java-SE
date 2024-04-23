package pruebas;

import java.util.List;

public class Test14Peek {

	public static void main(String[] args) {
		List<Integer> nums=List.of(11,4,5,8,-2,7,5,8);
		//muestra cada número de la lista  después que compruebe si hay negativos
		System.out.println("Negativos "+nums.stream()
			.peek(n->System.out.println(n))//Stream<Integer>
			.anyMatch(n->n<0));
		
	}

}