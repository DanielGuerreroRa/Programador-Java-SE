package pruebas;

import java.util.ArrayList;
import java.util.List;

public class OrdenarTextos {

	public static void main(String[] args) {
		List<String> textos=new ArrayList<String>(List.of("hola","pokemon","hamburguesa"));
		System.out.println("Ordenar textos: ");
		textos.sort((a,b)->a.compareTo(b));
		textos.forEach(s->System.out.println(s));
	}

}
