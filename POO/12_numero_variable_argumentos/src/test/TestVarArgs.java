package test;

public class TestVarArgs {

	public static void main(String[] args) {
		System.out.println(union("a","b","c"));
		System.out.println(union("hello","by"));
		System.out.println(union(new String[] {"l","m"}));

	}
	//Crear un método que devuelva una cadena con la unión de todos los textos recibidos
	//como parámetro, separándolos por la coma(,)
	public static String union(String ... data) {
		//El parámetro que guarda el número variable de argumentos es una array
		StringBuilder builder=new StringBuilder();
		for(String s:data) {
			builder.append(s);
			builder.append(",");
		}
		return builder.toString();
	}

}
