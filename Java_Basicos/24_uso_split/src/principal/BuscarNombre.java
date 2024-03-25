package principal;

import java.util.Scanner;

public class BuscarNombre {
	public static void main(String[] args) {
		
		String cesta ="tomates,patatas,vino,leche,azucar,vino,pan,vino,agua,limon,brocoli,salchichas,pan";
		
		//Se pide la introducción d eun producto, y el programa nos muestra su stock
		
		Scanner teclado = new Scanner(System.in);
		String[] productos = cesta.split(","); //Esto nos devolvera una array con todos los productos separados por ","
		String producto;   //Tambien podemos poner cesta.split("[ ,.]"); pata poner varios caracteres o espacios
		int stock=0;
		System.out.println("Introduce el producto: ");
		producto=teclado.nextLine(); //le pedimos el producto
		
		for(String p : productos) {
			if(p.equals(producto)) {
				stock++;
			}
		}
		System.out.println("El stock del " +producto+ " es " +stock);
	}
}
