package model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

//Implementar lógica de negocio de una aplicación que proporcione los siguientes métodos
//-Lista de empleados de un determinado departamento
//-Empleado con mayor salario
//-Lista de departamentos 

public class Empleado {
	private String nombre;
	private String departamento;
	private double salario;
		
	
   
}
