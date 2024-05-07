package service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import model.Curso;

public class CursosJsonServiceImpl implements CursosJsonService {
	String dir="cursos.json";
	@Override
	public List<Curso> cursosAlumnos(){
		Gson gson = new Gson();
		try {
			return Arrays.asList(gson.fromJson(new FileReader(dir), Curso[].class));
		} catch (JsonSyntaxException | JsonIOException | FileNotFoundException e) {
			e.printStackTrace();
			return List.of();
		}
	}
}
