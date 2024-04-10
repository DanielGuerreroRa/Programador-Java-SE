package curso.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LectorTeclado extends BufferedReader{
	//Crear una clase para lectura de datos por teclado. Esa clase, tendrá tres métodos:
	//readString()
	//readInt()
	//readDouble() 

	public LectorTeclado() {   //Hereda todo lo que tiene BufferredReader
		super(new InputStreamReader(System.in)); //Para que podamos leer en el teclado

	}

	public String readString() {
		try {
			return readLine();
		} catch (IOException e) {
			e.printStackTrace();
			return null; //Si falla la lectura entregamos null
		}
	}

	public int readInt() {
		try {
			return Integer.parseInt(readLine());
		} catch (IOException e) {
			e.printStackTrace();
			return 0; //Si falla la lectura entregamos 0
		}
	}

	public double readDouble()  {
		try {
			return Double.parseDouble(readLine());
		} catch (IOException e) {
			e.printStackTrace();
			return 0.0; //Si falla la lectura entregamos 0.0
		}
	}
	
	
}
