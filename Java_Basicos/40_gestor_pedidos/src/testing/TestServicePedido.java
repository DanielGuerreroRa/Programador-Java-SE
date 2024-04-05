package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import model.Pedido;
import service.PedidoService;

class TestServicePedido {
	static PedidoService service=new PedidoService();
	static Calendar calendar=Calendar.getInstance();
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		calendar.set(2023, 11,30);
		Date f1=calendar.getTime();
		calendar.set(2022,4, 11);
		Date f2=calendar.getTime();
		calendar.set(2022,10,1);
		Date f3=calendar.getTime();		
		service.nuevoPedido(new Pedido("coca cola",20,f1));
		service.nuevoPedido(new Pedido("whisky",1,f2));
		service.nuevoPedido(new Pedido("patatas fritas",10,f3));
	}

	@Test
	void testPedidoMasReciente() {
		assertEquals("coca cola", service.pedidoMasReciente().getProducto());
	}

	@Test
	void testPedidosEntreFechas() {
		calendar.set(2022, 0,1);
		Date fmin=calendar.getTime();
		calendar.set(2022, 11,31);
		Date fmax=calendar.getTime();
		//lo comparamos entre los dos productos
		assertEquals(2, service.pedidosEntreFechas(fmin, fmax).size());
	}

}
