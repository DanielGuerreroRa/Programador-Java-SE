package testing;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import service.NotasService;

class TestNotasService {
	static NotasService service=new NotasService();
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		service.borrarNotas();
		//añadimos unas cuantas notas de prueba
		service.agregarNota(5);
		service.agregarNota(8);
		service.agregarNota(1);
		service.agregarNota(6);
	}

	@Test
	void testMedia() {
		assertEquals(5.0, service.media());
	}

	@Test
	void testMax() {
		assertEquals(8.0,service.max());
	}

	@Test
	void testMin() {
		assertEquals(1.0,service.min());
	}

	@Test
	void testObtenerNotas() {
		assertEquals(4,service.obtenerNotas().size());
		assertArrayEquals(new Double[] {5.0,8.0,1.0,6.0}, service.obtenerNotas().toArray(new Double[0]));
	}

}
