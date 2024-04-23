package service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import model.Alumno;
import model.Curso;


public class FormacionService {
	List<Curso> cursos=new ArrayList<>(List.of(
			new Curso("Java","Programación",120,LocalDate.of(2014, 11, 10),LocalDate.of(2015, 1, 30),List.of(new Alumno("a1",5.6),
					new Alumno("a2",8),new Alumno("a8",6),new Alumno("b7",4))),
			new Curso("Angular","Programación",80,LocalDate.of(2021, 06, 10),LocalDate.of(2021, 9, 8),List.of(new Alumno("r2",3.6),
					new Alumno("a9",7),new Alumno("b4",5))),
			new Curso("HTML y CSS","Web",60,LocalDate.of(2019, 03, 15),LocalDate.of(2019, 5, 30),List.of(new Alumno("r9",4),
					new Alumno("v4",6),new Alumno("h1",3),new Alumno("s9",5),new Alumno("k2",2))),
			new Curso("Oracle","Bases de datos",100,LocalDate.of(2020, 10, 20),LocalDate.of(2021, 2, 12),List.of(new Alumno("s10",9),
					new Alumno("r1",4))),
			new Curso("SQL","Bases de datos",40,LocalDate.of(2018, 02, 06),LocalDate.of(2018, 4, 20),List.of(new Alumno("y6",7),
					new Alumno("u7",2),new Alumno("b8",4),new Alumno("t2",6))),
			new Curso("Python","Programación",90,LocalDate.of(2016, 10, 23),LocalDate.of(2017, 3, 30),List.of(new Alumno("l9",7.6),
					new Alumno("g5",3),new Alumno("n1",8.4),new Alumno("x6",5.9)))		
			)); 
	//Añade un nuevo curso si no coinciden mismo nombre y fecha de inicio
	public boolean nuevoCurso(Curso curso) {
		if(
				cursos.stream
				().anyMatch(c->c.getNombre().equals(curso.getNombre())&&c.getFechaInicio().equals(curso.getFechaInicio()))) {
			return false;
		}
		cursos.add(curso);
		return true;
	} 

	//Precio medio de cursos por temática
	public Map<String, Double> precioMedioPorTematica() {
		return cursos.stream()
				.collect(Collectors.groupingBy(c->c.getTematica(),
						Collectors.averagingDouble(c->c.getPrecio())));
	}

	//Total cursos finalizados antes de determinada fecha
	public Curso cursoFinalizado(LocalDate fecha) {
		return cursos.stream()
				.max((a,b)->Long.compare(Math.abs(ChronoUnit.DAYS.between(a.getFechaFinal(), fecha)), 
						Math.abs(ChronoUnit.DAYS.between(b.getFechaFinal(), fecha))))
				.orElse(null); 
	}

	//Lista de cursos de la temática recibida como parámetro
	public List<Curso> listaPorTematica(String tematica){
		return cursos.stream()
                .filter(c->c.getTematica().equalsIgnoreCase(tematica))
                .collect(Collectors.toList()); 
	}

	//Conjunto de tematicas
	 public Set<String> conjuntoDeTematicas() {
	        return cursos.stream()
	                .map(c->c.getTematica())
	                .distinct()
	                .collect(Collectors.toSet());
	    }

	//Lista de cursos cuyos precios se encuentran entre los dos valores recibidos como parámetros
	public List<Curso> entrePrecios(double p1, double p2){
		return cursos.stream()
                .filter(c->c.getPrecio()>=p1 && c.getPrecio()<=p2)
                .collect(Collectors.toList());
	}

	//Lista de cursos cuya duración sea inferior a los meses que se reciben como parámetro
	public List<Curso> duracionInferior(LocalDate mes){
		return cursos.stream()
                .filter(c->c.getFechaFinal().isBefore(mes))
                .collect(Collectors.toList()); 
	}

	//Tabla de cursos, donde la clave sea la duración del curso(en meses) y el valor el nombre del curso
//	 public Map<Integer, String> tablaDeCursosPorDuracion() {
//	        return cursos.stream()
//	        		.filter((int) fechaInicio.until(fechaFin, ChronoUnit.MONTHS))
//	                .collect(Collectors.toMap(c->(c.getFechaInicio(),c.getFechaFinal(),c.getNombre());
//	                        
//	    }

	//Tabla de cursos, donde la clave sea la duración del curso(en meses) y el valor la lista de cursos con dicha duración
//	 public Map<Integer, List<Curso>> tablaDeCursosPorDuracionLista() {
//		 
//	 }

	//Tabla con los cursos divididos entre caros y baratos. Caros, los que superen el precio 
	//recibido como parámetro baratos los que no lo superen o lo igualen
//	 public Map<String, List<Curso>> cursosCarosYBaratos(double precioMedio) {
//	        return cursos.stream()
//	                .collect(Collectors.groupingBy(c->c.getPrecio())>precioMedio);
//	    }
	 
	//Cadena con los nombres de todos los cursos, separados por una coma
	public String nombresDeCursosSeparadosPorComa() {
        return cursos.stream()
                .map(c->c.getNombre()) 
                .collect(Collectors.joining(", ")); 
	}
	//Nota media de un curso
//	public double notaMediaDeCurso(Curso curso) {
//		cursos.stream()
//		.filter(c->c.getAlumno())
//		.flatMap(a->a.getNotas().stream())
//		.collect(Collectors.toList());
//	}
	//lista con los nombres de todos los alumnos
	public List<String> nombresDeTodosLosAlumnos() {
        return cursos.stream()
                .flatMap(curso -> curso.getAlumnos().stream()) 
                .map(a->a.getNombre()) 
                .collect(Collectors.toList());
	}

	//lista de alumnos matriculados en cursos de determinada temática

	//alumno con mayor nota 

}
