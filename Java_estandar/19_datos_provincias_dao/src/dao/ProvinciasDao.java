package dao;

import model.Provincia;

public interface ProvinciasDao {
	
	public void save (Provincia provincia);
	public Provincia findByName(String nombreProvincia);
	
	static ProvinciasDao of() {
		// TODO Auto-generated method stub
		return new ProvinciasDaoImpl();
	}
	
}