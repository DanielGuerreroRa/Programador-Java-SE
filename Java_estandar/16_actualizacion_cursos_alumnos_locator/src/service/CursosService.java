package service;

import model.Curso;

public interface CursosService {

	Curso cursoPorId(int idCurso);

	boolean altaCurso(Curso curso);

}