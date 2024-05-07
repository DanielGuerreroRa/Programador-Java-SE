package dao;

import java.util.List;

import model.Comunidad;

public interface ComunidadesDao {
	void save(Comunidad codigo);
	Comunidad findByComunidad(String nombreComunidad); 
	
	static ComunidadesDao of() {
		return new ComunidadesDaoImpl();
	}

}