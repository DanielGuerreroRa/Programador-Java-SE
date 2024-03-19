package principal;

public class ComprobarNota {

	public static void main(String[] args) {
		int nota=6;
		//A partir de la nota indicara si es un:
		//Suspenso (0 a 4)
		//Aprobado (5 a 6)
		//Notable (7 a 8)
		//Sobresaliente (9 a 10)
		
		//Ejemplo 1
		switch(nota){ 
		case 0,1,2,3,4: 
		System.out.println("Suspenso"); 
		break; 
		case 5,6: 
		System.out.println("Aprobado"); 
		break; 
		case 7,8: 
		System.out.println("Notable"); 
		break; 
		case 9,10: 
		System.out.println("Sobresaliente"); 
		} 
		
		//Ejemplo 2
		String resultado;
		resultado = switch(nota){
		case 0,1,2,3,4 -> "Suspenso";
		case 5,6 -> "Aprobado";
		case 7,8 -> "Notable";
		case 9,10 -> "Sobresaliente";
		default -> "Nota no valida"; //Si no estuviera el default seria un error de compilación.
		};
		System.out.println(resultado);

	}

}
