package view;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestEscritura {

	public static void main(String[] args) {
		String ruta="nombres.txt";
		Path pt=Path.of(ruta);
		try {
		Files.writeString(pt, "cadena1");
		Files.writeString(pt, "cadena2");
		Files.writeString(pt, "cadena3");
		}catch(IOException ex) {
			ex.printStackTrace();
		}


	}

}
