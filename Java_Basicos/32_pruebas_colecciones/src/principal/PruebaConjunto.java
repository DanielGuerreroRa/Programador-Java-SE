package principal;

import java.util.HashSet;

public class PruebaConjunto {

	public static void main(String[] args) {
		HashSet<Double> nums= new HashSet<Double>();
		nums.add(30.7);
		nums.add(80.0);
		nums.add(21.3);
		for(Double n:nums) {
			n=n+1;
		}
		for(Double n:nums) {
			System.out.println(n);
		}
		//En este caso no le suma +1 al objeto del conjunto

	}

}
