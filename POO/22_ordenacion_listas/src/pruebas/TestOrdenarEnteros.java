package pruebas;

import java.util.ArrayList;
import java.util.List;

public class TestOrdenarEnteros {

	public static void main(String[] args) {
		List<Integer> nums=new ArrayList<>(List.of(12,8,5,23,4,16));
		System.out.println("Ordenado de menor a mayor: ");
		nums.sort((a,b)->a-b);
		nums.forEach(n->System.out.println(+n));
		
		System.out.println("Ordenado de mayor a menor: ");
		nums.sort((a,b)->b-a);
		nums.forEach(n->System.out.println(n));
	}

}
