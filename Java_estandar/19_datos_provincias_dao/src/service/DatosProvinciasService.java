package service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.stream.Stream;

import com.google.gson.Gson;

import model.Comunidad;
import model.JsonMunicipio;
import model.JsonProvincia;
import model.Municipio;
import model.Provincia;

public class DatosProvinciasService {
	private  Stream<Provincia> getStreamProvincias() {
		Gson gson = new Gson();
		String url="https://www.el-tiempo.net/api/json/v2/provincias";
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
		 	return gson.fromJson(respuesta.body(),JsonProvincia.class).getProvincias().stream();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Stream.empty();
		}
	}
	private  Stream<Municipio> getStreamMunicipiosProvincia(String codigo) {
		Gson gson = new Gson();
		String url="https://www.el-tiempo.net/api/json/v2/provincias/"+codigo+"/municipios";
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
		 	return gson.fromJson(respuesta.body(),JsonMunicipio.class).getMunicipios().stream();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Stream.empty();
		}
	}
	
	public List<Comunidad> comunidades(){
		return getStreamProvincias()
				.map(p->new Comunidad(p.getCodComunidad(),p.getComunidad()))
				.distinct()
				.toList();
	}
	
	public List<Provincia> provincias(){
		return getStreamProvincias()
				.toList();
	}
	public List<Municipio> municipios(){
		return getStreamProvincias()//Stream<Provincia>
				.flatMap(p->getStreamMunicipiosProvincia(p.getCodigo()))//Stream<Municipio>
				.toList();
	}
}
