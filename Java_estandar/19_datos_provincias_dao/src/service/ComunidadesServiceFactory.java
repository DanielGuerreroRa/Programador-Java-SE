package service;

public class ComunidadesServiceFactory {
	public static ComunidadesService getComunidadesService() {
		return new ComunidadesServiceImpl();
	}
}