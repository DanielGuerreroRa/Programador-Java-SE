package service;

import java.util.List;

import model.Contacto;

public interface ContactosService {

	//No se admitirán contactos con email duplicado
	boolean nuevoContacto(Contacto contacto);

	//devuelve el contacto eliminado. Si no se ha eliminado ninguno, devuelve null
	Contacto eliminarContacto(String email);

	boolean actualizarContacto(String email, int nuevaEdad);

	//Buscar contacto por su clave primaria
	Contacto buscarContactoPorId(int idContacto);

	//Recuperar todos los contactos
	List<Contacto> getContactos();

}