package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.ContactosDao;
import model.Contacto;

public class ContactosServiceImpl implements ContactosService {
	
	ContactosDao contactosDao;
	public ContactosServiceImpl() {
		contactosDao=ContactosDao.of();
	}
	
	//No se admitirán contactos con email duplicado
	@Override
	public boolean nuevoContacto(Contacto contacto) {		
		if(contactosDao.findByEmail(contacto.getEmail())!=null) {
			return false;
		}
		contactosDao.save(contacto);
		return true;		
	}
	//devuelve el contacto eliminado. Si no se ha eliminado ninguno, devuelve null
	@Override
	public Contacto eliminarContacto(String email) {
		Contacto contacto=contactosDao.findByEmail(email);
		if(contacto==null) {
			return null;
		}
		contactosDao.deleteByEmail(email);
		return contacto;
	}
	@Override
	public boolean actualizarContacto(String email, int nuevaEdad) {
		Contacto contacto=contactosDao.findByEmail(email);
		if(contacto!=null) {
			contacto.setEdad(nuevaEdad);
			contactosDao.update(contacto);
			return true;
		}
		return false;	
	}
	
	//Buscar contacto por su clave primaria
	@Override
	public Contacto buscarContactoPorId(int idContacto) {
		return contactosDao.findById(idContacto);		
	}
	//Recuperar todos los contactos
	@Override
	public List<Contacto> getContactos(){
		return contactosDao.findAll();
	}
	
	
}
