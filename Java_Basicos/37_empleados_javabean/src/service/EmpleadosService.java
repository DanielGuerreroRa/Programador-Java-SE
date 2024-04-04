package service;

import java.util.Collection;
import java.util.HashMap;

import model.Empleado;

public class EmpleadosService {
	//	Realizar un programa para la gestión de empleados de una empresa. Un empleado se caracteriza por un nombre,un email, edad y tiene asociado un código de empleado.
	//	al iniciar el programa, aparecerá el siguiente menú:
	//	1.- Nuevo empleado
	//	2.- Buscar empleado
	//	3.- Eliminar empleado
	//	4.- Mostrar datos de todos los empleados
	//	5.- Salir
	//
	//	1: Se pide el nómbre, email, edad y código del empleado. Si no existe empleado con ese código, se guarda, pero si el código ya existe, no se guarda y se muestra advertencia al usuario
	//	2: Se pide el código del empleado y se muestran sus datos
	//	3: Se pìde el código del empleado y se borra, indicando un mensaje que diga el nombre del empleado que se ha borrado
	//	4.- Muestra datos de todos los empleados 

	//Declaramos un HashMap para almacenar a los empleados.
	HashMap<Integer, Empleado> empleados = new HashMap<Integer, Empleado>(); //La clave es el código Integer y el valor es el objeto Empleado

	public boolean agregarEmpleado(int codigo, String nombre, String email, int edad){
		if (!empleados.containsKey(codigo)) {  //Si empleados no contiene el codigo
			Empleado nuevoEmpleado=new Empleado(nombre, email, edad, codigo); 
			empleados.put(codigo, nuevoEmpleado);  //Se guarda el código y los datos de empleado
			return true; //El empleado se agrega 
		} 
		return false; //El empleado ya existe

	}

	public Empleado buscarEmpleado(Integer codigo){
		return empleados.get(codigo); //Se muestra el empleado
	}



	public Empleado eliminarEmpleado(Integer codigo){
		return empleados.remove(codigo); //Se elimina si existe
	}


	public Empleado[] todosEmpleados(){
		Collection<Empleado> todos=empleados.values(); //La collección de los String
		return todos.toArray(new Empleado[0]); //Se muestra la array de empleados

	}

}
