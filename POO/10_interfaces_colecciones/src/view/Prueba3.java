package view;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Prueba3 {

	public static void main(String[] args) {
		//Realizar un método que recibe dos colecciones de entero y devuelve con los números contenidos en ambas colecciones

	}
	public static Set<Integer> contenido(Collection<Integer> col1,Collection<Integer> col2) {
		 Set<Integer> contenidoComun=new HashSet<>();
		 for (Integer c1:col1) {
			if(col2.contains(c1)) {
				contenidoComun.add(c1);
			}
		 }
		 return contenidoComun;
	}

}
