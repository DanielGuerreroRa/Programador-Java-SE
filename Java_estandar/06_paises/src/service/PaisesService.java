package service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import model.Pais;

public class PaisesService {
	private  Stream<Pais> getStreamPaises() {
		Gson gson = new Gson();
		try {
			return Arrays.stream(gson.fromJson(new FileReader("paises.json"), Pais[].class));
		} catch (JsonSyntaxException | JsonIOException | FileNotFoundException e) {
			e.printStackTrace();
			return Stream.empty();
		}
	}
	
	public  List<String> getContinentes() {
		return getStreamPaises() //Stream<Pais>
				.map(p -> p.getContinente())//Stream<String>
				.distinct()
				.toList();
	}
	
	public  List<Pais> getPaisesFiltradosPor(String continente)  {
		return getStreamPaises()
				.filter(p -> p.getContinente().equalsIgnoreCase(continente))
				.toList();
	}
	
	public  Optional<Pais> getPaisMasPoblado() {
		return getStreamPaises()
				.max(Comparator.comparingLong(p -> p.getPoblacion()));
	}
	
	public  Map<String, List<Pais>> getTablaPaisContinente()  {
		return getStreamPaises()
				.collect(Collectors.groupingBy(p -> p.getContinente()));
	}
	//nombre del pais
	public String getPaisFiltradoPor(String capital)  {
		return getStreamPaises()
		.filter(p -> p.getCapital() != null && p.getCapital().equals(capital))//Stream<Pais>
		.findFirst()//Optional<Pais>
		.map(p->p.getNombre())//Optional<String>
		.orElse("");
	} 
}
