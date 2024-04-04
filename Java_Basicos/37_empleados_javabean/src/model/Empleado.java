package model;

public class Empleado {

	//	1: Se pide el nómbre, email, edad y código del empleado. Si no existe empleado con ese código, se guarda, pero si el código ya existe, no se guarda y se muestra advertencia al usuario
	//	2: Se pide el código del empleado y se muestran sus datos
	//	3: Se pìde el código del empleado y se borra, indicando un mensaje que diga el nombre del empleado que se ha borrado
	//	4.- Muestra datos de todos los empleados 
	
	//Atributos
	private String nombre;
	private String email;
	private int edad;
	private int codigo;
	
	//Métodos
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", email=" + email + ", edad=" + edad + ", codigo=" + codigo + "]";
	}

	
	//Constructor
	public Empleado() {
	
	}

	public Empleado(String nombre, String email, int edad, int codigo) {
		this.nombre = nombre;
		this.email = email;
		this.edad = edad;
		this.codigo = codigo;
	}
	
	//Setters y Getters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	

}
