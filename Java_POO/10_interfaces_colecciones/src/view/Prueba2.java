package view;

import java.util.ArrayList;
import java.util.List;

public class Prueba2 {

	public static void main(String[] args) {
		ArrayList<Integer> nums=new ArrayList<Integer>();
		nums.add(11);nums.add(7);nums.add(12);nums.add(31);
		nums.add(4);nums.add(3);nums.add(8);

		//muestra los números comprendidos entre las posiciones 3 y 6
		List<Integer> sublista=nums.subList(3, 7);
		System.out.println(sublista.getClass().getSimpleName());
		for(Integer n:sublista) {
			System.out.println(n);
		}
	}

}
