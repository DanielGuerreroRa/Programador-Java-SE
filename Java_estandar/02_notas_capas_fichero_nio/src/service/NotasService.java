package service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import exceptions.ErrorFuenteDatosException;

public class NotasService {
	Path pt=Path.of("notas.txt");
	public void borrarNotas() {
		try {
			Files.deleteIfExists(pt);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void agregarNota(double nota) {
		
		try {
			Files.writeString(pt, nota+System.lineSeparator(), StandardOpenOption.APPEND,StandardOpenOption.CREATE);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public double media() throws ErrorFuenteDatosException{		
		try {
			return Files.lines(pt)//Stream<String>
					.collect(Collectors.averagingDouble(s->Double.parseDouble(s)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ErrorFuenteDatosException(); //provoca la excepción
		}
	}
	public double max() throws ErrorFuenteDatosException{
		try {
			return Files.lines(pt)//Stream<String>
					.max(Comparator.comparingDouble(s->Double.parseDouble(s)))//Optional<String>
					.map(s->Double.parseDouble(s))//Optional<Double>
					.orElse(0.0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ErrorFuenteDatosException(); //provoca la excepción
		}
	}
	public double min() throws ErrorFuenteDatosException{
		try {
			return Files.lines(pt)//Stream<String>
					.min(Comparator.comparingDouble(s->Double.parseDouble(s)))//Optional<String>
					.map(s->Double.parseDouble(s))//Optional<Double>
					.orElse(0.0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ErrorFuenteDatosException(); //provoca la excepción
		}
		
	}
	public List<Double> obtenerNotas() throws ErrorFuenteDatosException{
		try {
			return Files.lines(pt) //Stream<String>
					.map(s->Double.parseDouble(s))//Stream<Double>
					.toList();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ErrorFuenteDatosException(); //provoca la excepción
		}
	}
}
