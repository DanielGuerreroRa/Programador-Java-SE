package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import model.Pedido;
import service.PedidoService;



public class PruebaPedido {
	static PedidoService service=new PedidoService();
	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		int opcion;
		do {
			//presentar menu
			//leer opción y comprobar opcion elegida
			presentarMenu();
			opcion=sc.nextInt();
			switch(opcion) {
				case 1:
					agregarPedido();
					break;
				case 2:
					mostrarReciente();
					break;
				case 3:
					pedidosEntreFechas();
					System.out.println();
					break;
				case 4:
					System.out.println("Adios!");
					break;
				
				default:
					System.out.println("Opción no válida!");
			}
		}while(opcion!=4);
	}
	static void presentarMenu() {
		System.out.println("""
				
				1.- Agregar Pedido
				2.- Pedido más reciente
				3.- Pedidos entre fechas
				4.- Salir
				
				""");
	}
	static void agregarPedido()  {
		Scanner sc=new Scanner(System.in);
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");		
		System.out.println("Producto:");
		String producto=sc.nextLine();
		System.out.println("Unidades:");
		int unidades=Integer.parseInt(sc.nextLine());
		System.out.println("Fecha pedido (dia/mes/año):");
		try {
			Date fecha=sdf.parse(sc.nextLine());	
			Pedido p=new Pedido(producto, unidades, fecha);
			service.nuevoPedido(p);
		}catch(ParseException ex) {
			ex.printStackTrace();
			System.out.println("Fecha no válida!, el pedido no se ha guardado");
		}
	}
	static void mostrarReciente() {
		Pedido p=service.pedidoMasReciente();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		System.out.print("Producto: "+p.getProducto()+" ");
		System.out.print("Unidades: "+p.getUnidades()+" ");
		System.out.println("Fecha pedido: "+sdf.format(p.getFechaPedido())+" ");
	}
	static void pedidosEntreFechas()  {
		Scanner sc=new Scanner(System.in);
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");	
		System.out.println("Fecha inicio (dia/mes/año):");
		try {
			Date fecha1=sdf.parse(sc.nextLine());	
			System.out.println("Fecha límite (dia/mes/año):");
			Date fecha2=sdf.parse(sc.nextLine());	
			ArrayList<Pedido> pedidosEncontrados=service.pedidosEntreFechas(fecha1, fecha2);
			for(Pedido p:pedidosEncontrados) {
				System.out.print("Producto: "+p.getProducto()+" ");
				System.out.print("Unidades: "+p.getUnidades()+" ");
				System.out.println("Fecha pedido: "+sdf.format(p.getFechaPedido())+" ");
			}
		}
		catch(ParseException ex) {
			ex.printStackTrace();
			System.out.println("Fecha no válida!!");
		}
	}

}
