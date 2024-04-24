package view;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class TestEscrituraLista {

	public static void main(String[] args) {
		String ruta="nombres.txt";
		Path pt=Path.of(ruta);
		List<String> dias=List.of("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo");
		try{
			Files.write(pt, dias, StandardOpenOption.APPEND);
		}catch(IOException ex) {
			ex.printStackTrace();
		}

	}

}
