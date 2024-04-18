package view;

import java.util.ArrayList;
import java.util.List;

public class TestReplaceAll {

	public static void main(String[] args) {
		List<Integer> nums=new ArrayList<>(List.of(3,-9,-8,18,9));
		nums.removeIf(n->n<0);
		nums.forEach(n->System.out.println(n));

	}

}
