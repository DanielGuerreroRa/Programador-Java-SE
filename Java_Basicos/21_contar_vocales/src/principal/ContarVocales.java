package principal;

public class ContarVocales {

	public static void main(String[] args) {
		//¿Cuantas vocales tiene este texto?
		String texto="Esto es un nuevo texto";
		int vocales=0;

		for (int i = 0; i < texto.length(); i++) {
			switch(texto.charAt(i)) { //Devuelve los caracteres (char) del texto y ponemos los casos abajo
			case 'a', 'e', 'i', 'o', 'u': 
				vocales++;  //Incrementamos las vocales
			}
		}
		System.out.println("Total de vocales: " +vocales);


	}

}