package dao;

public class ComunidadesDaoFactory {
	public static ComunidadesDao getComunidadesDao() {
		return new ComunidadesDaoImpl();
	}
	
	public static ProvinciasDao getProvinciasDao() {
		return new ProvinciasDaoImpl();
	}
	
	public static MunicipiosDao getMunicipiosDao() {
		return new MunicipiosDaoImpl();
	}

}
