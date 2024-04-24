package view;

import java.util.ArrayList;
import java.util.List;

public class Prueba5 {

	public static void main(String[] args) {
		List<Integer> lst1=new ArrayList<Integer>();
		
		//List<Number> lst2=new ArrayList<Integer>();//una lista de Integer NO ES una lista de Number
		List<Number> lst3=new ArrayList<Number>();
		lst3.add(10);
		lst3.add(4.5);
		
		
		ArrayList<Integer> nums=new ArrayList<Integer>();
		nums.add(25);nums.add(3);nums.add(43);
		
		List<?> lst4=nums; //el tipo comodin(?). Admite lista de cualquier tipo
		List<? extends Number> lst5=nums;//admite lista de cualquier tipo que herede Number(o Number)
		List<? super Integer> lst6=nums;//admite lista de cualquier tipo que sea superclase de Integer (o Integer)
	}

}
