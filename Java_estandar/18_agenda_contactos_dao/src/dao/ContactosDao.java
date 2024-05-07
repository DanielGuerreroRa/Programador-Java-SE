package dao;

import java.util.List;

import model.Contacto;

public interface ContactosDao {
	void save(Contacto contacto);
	Contacto findByEmail(String email);
	void update(Contacto contacto);
	Contacto findById(int idContacto);
	List<Contacto> findAll();
	void deleteByEmail(String email);
	
	static ContactosDao of() {
		return new ContactosDaoImpl();
	}
}
