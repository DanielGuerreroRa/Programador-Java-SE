package principal;

public class PruebaText0 {

	public static void main(String[] args) {
		String n="hello";
		n=n.toUpperCase(); //MAYUSCULAS
		System.out.println(n);
		
		
		String a = new String("miTexto");
		String b = new String("miTexto");
		if(a.equals(b)) { // 'equals' compara el objeto a con el objeto b 
			System.out.println("Son iguales");    //equalsIgnoreCase() no hace distincion entre mayusculas y misnusculas
		}else {
			System.out.println("Son diferentes");
		}

	}

}
