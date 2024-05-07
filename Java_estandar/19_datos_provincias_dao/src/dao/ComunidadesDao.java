package dao;

import java.util.List;

import model.Comunidad;

public interface ComunidadesDao {
	void save(Comunidad comunidad);
	Comunidad findByComunidad(String nombreComunidad); 
	
	void save(List<Comunidad> comunidades);
	
	boolean existComundidad(String codigo);
		

}