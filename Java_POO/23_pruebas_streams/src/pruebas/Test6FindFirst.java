package pruebas;

import java.util.List;

public class Test6FindFirst {

	public static void main(String[] args) {
		List<Integer> nums=List.of(25,-9,8,3,2,-4,11,1,20,8);
		//mostrar el primer número negativo
	nums.stream()
		.filter(n->n<0) //Stream<Integer>. Solo con los negativos
		.findFirst() //Optional<Integer>
		.ifPresentOrElse(n->System.out.println(n), 
				()->System.out.println("---No hay negativos---"));

	}

}
