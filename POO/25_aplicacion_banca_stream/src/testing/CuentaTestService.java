package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import service.CuentaService;

class CuentaTestService {
	static CuentaService service;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		service=new CuentaService();
	}

	@Test
	void testExisteCuenta() {
		assertTrue(service.existeCuenta("ES3520800014523000687719"));
		assertFalse(service.existeCuenta("ES0000000000000000000001"));
	}

	@Test
	void testCuentasPorDivistas() {
		assertEquals(2,service.cuentasPorDivistas("EUR"));
	}

}
