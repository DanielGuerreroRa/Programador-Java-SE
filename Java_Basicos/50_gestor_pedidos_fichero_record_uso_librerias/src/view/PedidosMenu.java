package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import curso.io.LectorTeclado;
import model.Pedido;
import service.PedidosService;

public class PedidosMenu {
	static PedidosService service=new PedidosService();
	public static void main(String[] args)  {
		LectorTeclado lector=new LectorTeclado();              //Importamos la libreria  --  libreria creada en POO 02_clase_lector_teclado guardada en librerias_externas
		int opcion=0;
		do {
			//presentar menu
			//leer opción y comprobar opcion elegida
			presentarMenu();
			try{
				opcion=lector.readInt();
				switch(opcion) {
					case 1:
						agregarPedido();
						break;
					case 2:
						mostrarReciente();
						break;
					case 3:
						pedidosEntreFechas();
						break;
					case 4:
						System.out.println("Adios!");
						break;
					
					default:
						System.out.println("Opción no válida!");
				}
			}//end try
			catch(NumberFormatException ex) {
				System.out.println("Debe ser un valor numérico!!");
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
		LectorTeclado lector=new LectorTeclado();
		DateTimeFormatter sdf=DateTimeFormatter.ofPattern("dd/MM/yyyy");		
		System.out.println("Producto:");
		String producto=lector.readString(); //Cambiamos (sc.nextLine());                              libreria creada en POO 02_clase_lector_teclado guardada en librerias_externas
		System.out.println("Unidades:");
		int unidades=lector.readInt();       //Cambiamos (lector.nextInt());
		System.out.println("Fecha pedido (dia/mes/año):");
		LocalDate fecha=LocalDate.parse(lector.readString(),sdf);	//Cambiamos (lector.nextLine());
		Pedido p=new Pedido(producto, unidades, fecha);
		service.nuevoPedido(p);
	}
	static void mostrarReciente() {
		Pedido p=service.pedidoMasReciente();
		DateTimeFormatter sdf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.print("Producto: "+p.producto()+" ");
		System.out.print("Unidades: "+p.unidades()+" ");
		System.out.println("Fecha pedido: "+p.fechaPedido().format(sdf)+" ");
	}
	static void pedidosEntreFechas(){
		LectorTeclado lector=new LectorTeclado();
		DateTimeFormatter sdf=DateTimeFormatter.ofPattern("dd/MM/yyyy");	
		System.out.println("Fecha inicio (dia/mes/año):");
		LocalDate fecha1=LocalDate.parse(lector.readString(),sdf);	 //Cambiamos (lector.nextLine());
		System.out.println("Fecha límite (dia/mes/año):");
		LocalDate fecha2=LocalDate.parse(lector.readString(),sdf);	 //Cambiamos (lector.nextLine());
		ArrayList<Pedido> pedidosEncontrados=service.pedidosEntreFechas(fecha1, fecha2);
		for(Pedido p:pedidosEncontrados) {
			System.out.print("Producto: "+p.producto()+" ");
			System.out.print("Unidades: "+p.unidades()+" ");
			System.out.println("Fecha pedido: "+p.fechaPedido().format(sdf)+" ");
		}
	}

}
