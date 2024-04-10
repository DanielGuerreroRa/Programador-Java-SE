package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import model.Pedido;
import service.PedidosService;

class TestPedidosService {
	static PedidosService service=new PedidosService();
	static Calendar calendar=Calendar.getInstance();
	@BeforeAll
	static void setUpBeforeClass() throws Exception {	
		service.borrarPedidos();
		LocalDate f1=LocalDate.of(2023, 11,30);		
		LocalDate f2=LocalDate.of(2022,4, 11);
		LocalDate f3=LocalDate.of(2022,10,1);		
		service.nuevoPedido(new Pedido("coca cola",20,f1));
		service.nuevoPedido(new Pedido("whisky",1,f2));
		service.nuevoPedido(new Pedido("patatas fritas",10,f3));
	}
	
	@Test
	void testPedidoProximoFecha() {
		assertEquals("coca cola", service.pedidoProximoFecha(LocalDate.of(2023, 12, 7)).getProducto());
		assertEquals("patatas fritas", service.pedidoProximoFecha(LocalDate.of(2022, 8, 7)).getProducto());
	}

	@Test
	void testPedidoMasReciente() {
		assertEquals("coca cola", service.pedidoMasReciente().getProducto());
	}

	@Test
	void testPedidosEntreFechas() {
		LocalDate fmin=LocalDate.of(2022, 1,1);
		LocalDate fmax=LocalDate.of(2022, 12,31);
		assertEquals(2, service.pedidosEntreFechas(fmin, fmax).size());
	}

}
