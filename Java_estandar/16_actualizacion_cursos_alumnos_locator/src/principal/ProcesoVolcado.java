package principal;

import java.util.List;

import model.Curso;
import service.AlumnosService;
import service.CursosJsonService;
import service.CursosService;
import service.FormacionServiceFactory;

public class ProcesoVolcado {

	public static void main(String[] args) {
		var alumnosService=FormacionServiceFactory.getAlumnosService();
		var cursosService=FormacionServiceFactory.getCursosService();
		var cursosJsonService=FormacionServiceFactory.getCursosJsonService();
		//lista de cursos del fichero
		List<Curso> cursos=cursosJsonService.cursosAlumnos();
		//por cada curso, comprobamos si está. Si no está, lo añadimos
		//y también sus alumnos. Si el curso está, no lo añadimos y recorremos sus alumnos
		//para ver si hay alguno nuevo que añadir
		cursos.forEach(c->{
			if(cursosService.cursoPorId(c.getIdCurso())==null) {
				cursosService.altaCurso(c);
				c.getAlumnos().forEach(a->{
					//le asignamos al alumno el idCurso al que pertenece
					a.setIdCurso(c.getIdCurso());
					alumnosService.guardarAlumno(a);
				});
			}else {
				c.getAlumnos().forEach(a->{
					if(alumnosService.alumnoPorDni(a.getDni())==null) {
						//le asignamos al alumno el idCurso al que pertenece
						a.setIdCurso(c.getIdCurso());
						alumnosService.guardarAlumno(a);
					}
				});
			}
		});
	}

}
