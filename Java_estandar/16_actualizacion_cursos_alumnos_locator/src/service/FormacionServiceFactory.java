package service;

public class FormacionServiceFactory {
	public static AlumnosService getAlumnosService() {
		return new AlumnosServiceImpl();
	}
	public static CursosService getCursosService() {
		return new CursosServiceImpl();
	}
	public static CursosJsonService getCursosJsonService() {
		return new CursosJsonServiceImpl();
	}
}
