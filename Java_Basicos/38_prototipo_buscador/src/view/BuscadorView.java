package view;

import java.util.HashSet;
import java.util.Scanner;

import model.Direccion;
import service.BuscadorService;

public class BuscadorView {

	public static void main(String[] args) {
		BuscadorService service = new BuscadorService();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Que temática quieres buscar:");
		String tematica = teclado.nextLine();
		HashSet<Direccion> direcciones = service.buscarPorTematica(tematica);
		System.out.println("Direcciones encontradas para la temática " + tematica + ": ");
        for (Direccion d: direcciones) {
            System.out.println("- " + d.getUrl() + " - " + d.getDescripcion());
        }



	}

}
