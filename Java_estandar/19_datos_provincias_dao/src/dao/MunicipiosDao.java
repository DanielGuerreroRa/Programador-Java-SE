package dao;

import java.util.List;

import model.Municipio;

public interface MunicipiosDao {
	void saveMunicipios(List<Municipio> municipios);
	List<String> findCodigos();
}
