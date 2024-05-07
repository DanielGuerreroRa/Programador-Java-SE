package dao;

import java.util.List;

import model.Comunidad;

public interface ComunidadesDao {
	void save(Comunidad comunidad);
	void save(List<Comunidad> comunidades);
	boolean existComunidad(String codigo);
}
