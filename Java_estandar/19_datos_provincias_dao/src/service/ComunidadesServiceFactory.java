package service;

public class ComunidadesServiceFactory {
	public static ComunidadesService getcomunidadService() {
		return new ComunidadesServiceImpl();
	}

}
