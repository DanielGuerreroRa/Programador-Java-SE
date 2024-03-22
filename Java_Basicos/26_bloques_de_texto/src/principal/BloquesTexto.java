package principal;

public class BloquesTexto {

	public static void main(String[] args) {
		//String tutorial="El lenguaje \"html\":"\n Se emplea para formatear, las etiquetas tiene la forma <etiqueta>
		String bloqueTutorial=""" 
				El lenguaje "html":
				Se emple apra formatear,
				las etiquetas tiene la forma <etiqueta>
				""";
//		El lenguaje "html":
//		Se emple apra formatear, \  <-- si ponemos ese \ en la consola no hace el salto de linea.
//		las etiquetas tiene la forma <etiqueta>
//		""";
		
		System.out.println(bloqueTutorial);

		
	}

}
