package pruebas;

import java.util.List;

public class Test9reduce {

	public static void main(String[] args) {
		List<Integer> nums=List.of(25,2,8,-3,2,4,11,-1,-20,8);
		System.out.println(
				nums.stream()
				.filter(n->n<0) //Se filtran los números negativos
				.reduce((a,b)->a+b) //Se reduce sumando los números negativos
				.orElse(0) //Si el flujo está vacío, se devuelve 0
				);
	}
}