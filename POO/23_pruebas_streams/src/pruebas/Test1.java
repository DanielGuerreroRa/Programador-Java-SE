package pruebas;

import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		List<Integer> nums=List.of(25,2,8,-3,2,4,11,-1,-20,8);
		System.out.println(nums.stream().count());
		nums.stream()
		.forEach(System.out::println);
	}

}