package view;

import java.time.LocalDate;

public class Prueba2 {

	public static void main(String[] args) {
		Object ob="hello";
		String s=(String)ob; //Se puede hacer un castiing entre objetos siempre y cuando compatibilidad

	}
	//Escribir un método que sirva para mostrar por consola el HashCode de cualquier objeto java

	public void mostrarHashCode(Object ob) {
	      System.out.println(ob.hashCode());
	      
	      //Se puede llamar con cualquier tipo de objeto
	      System.out.println("hola");
	      System.out.println(200);
	      System.out.println(LocalDate.now());
	}

}
