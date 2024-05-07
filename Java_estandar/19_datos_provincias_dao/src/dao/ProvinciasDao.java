package dao;

import java.util.List;

import model.Provincia;

public interface ProvinciasDao {
	void saveProvincias(List<Provincia> provincias);
	List<String> findCodigos();
}
