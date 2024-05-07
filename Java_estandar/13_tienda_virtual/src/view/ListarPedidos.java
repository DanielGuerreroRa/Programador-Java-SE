package view;

import java.time.LocalDateTime;

import service.PedidosService;

public class ListarPedidos {

	public static void main(String[] args) {
		var service=new PedidosService();
		service.pedidosEntreFechas(LocalDateTime.of(2020, 1, 1, 1, 1), 
				LocalDateTime.of(2024, 1, 1, 1, 1))
		.forEach(System.out::println);

	}

}
