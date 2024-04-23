package pruebas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test12FlatMap {

	public static void main(String[] args) {
		List<Integer[]> nums=List.of(new Integer[] {3,7,5,2,9,10,6,8},
				new Integer[] {8,3,4,10,8,7,6,8,8,5},
				new Integer[] {9,2,5,6,1,4,8,5,6,6},
				new Integer[] {7,5,4,10,9,9,7,6,5,9}); 
		//Nota media de todos los alumnos del centro
		System.out.println(nums.stream() //Stream<Integer[]>
		.flatMap(a->Arrays.stream(a)) //Stream<Integer>
		.collect(Collectors.averagingInt(n->n)));
		

	}

}