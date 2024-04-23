package model;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Curso {
	private String nombre;
	private String tematica;
	private double precio;
	private LocalDate fechaInicio;
	private LocalDate fechaFinal;
	private List<Alumno> alumnos;
	
	

}
