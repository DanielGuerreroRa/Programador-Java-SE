package service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.gson.Gson;

import model.Pais;

public class PaisesService {
	private  Stream<Pais> getStreamPaises() {
		Gson gson = new Gson();
		String url="https://restcountries.com/v2/all";
		//creamos objeto request que configura la petición
		HttpRequest request=HttpRequest.newBuilder()
				.uri(URI.create(url))
				.GET()
				.build();
		//creamos objeto client para hacer la llamada
		HttpClient client=HttpClient.newBuilder()
				.build();
		//realizamos la llamada
		try {
			HttpResponse<String> respuesta=client.send(request, BodyHandlers.ofString());
		 	return Arrays.stream(gson.fromJson(respuesta.body(),Pais[].class));
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
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
