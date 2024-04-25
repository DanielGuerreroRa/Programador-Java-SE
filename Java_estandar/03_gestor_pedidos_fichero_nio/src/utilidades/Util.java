package utilidades;

import java.time.LocalDate;

import model.Pedido;

public class Util {
	public static Pedido convertirCadenaAPedido(String linea) {
		String [] datos=linea.split(",");
		return new Pedido(datos[0],
				Integer.parseInt(datos[1]),
				LocalDate.parse(datos[2])
				);
	}
	public static String convertirPedidoACadena(Pedido pedido) {
		return pedido.getProducto()+","+pedido.getUnidades()+","+pedido.getFechaPedido();
	}
}
