package dao;

import java.util.List;

import model.Municipio;

public interface MunicipiosDao {
	
	//CRUD
	//Create
	//Read
	//Update
	//Delete
	
	//	findAll
	//	findById
	//	UpdateById
	//	Update
	//	deleteById
	//	.....

	public void save(Municipio municipio);
	
	public Municipio findByName(String nombre);

	static MunicipiosDao of() {
		
		return new MunicipiosDaoImpl();
	}
	
	

}