package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Alumno {
	private String dni;
	private String nombre;
	private int edad;
	private double nota;
	private int idCurso;
}
