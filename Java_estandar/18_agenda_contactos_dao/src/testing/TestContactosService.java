package testing;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import service.ContactosService;
import service.ContactosServiceFactory;

class TestContactosService {
	static ContactosService service;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		service=ContactosServiceFactory.getContactosService();
	}

	@Test
	void testBuscarContactoPorId() {
		assertEquals(44, service.buscarContactoPorId(3).getEdad());
		assertNull(service.buscarContactoPorId(30));
	}

	@Test
	void testGetContactos() {
		assertEquals(5, service.getContactos().size());
	}

}
