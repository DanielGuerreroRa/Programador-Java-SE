package view;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PruebaEscritura {

	public static void main(String[] args) {
		//String ruta="c:\\temp\\dias.txt";
		String ruta="dias.txt";
		try {
			PrintStream out = new PrintStream(ruta);
			out.println("lunes");
			out.println("martes");
			out.println("miercoles");
			out.println("jueves");
			out.println("viernes");
			out.println("sabado");
			out.println("domingo");
			System.out.println("Información almacenada aen el fichero");
			out.close();
			//Si escribimos y sobreescribimos encima se borra lo anterior
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}


	}

}
