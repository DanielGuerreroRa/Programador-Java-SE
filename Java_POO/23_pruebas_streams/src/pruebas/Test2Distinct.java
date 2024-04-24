package pruebas;

import java.util.List;

public class Test2Distinct {

	public static void main(String[] args) {
		List<Integer> nums=List.of(25,2,5,-3,2,4,11,-1,-20,5);
		//¿Cuantos números diferentes hay?
		System.out.println(nums.stream()
		.distinct()
		.count());

	}

}