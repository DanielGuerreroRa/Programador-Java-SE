package service;

import java.util.HashSet;
import java.util.Set;

import model.Direccion;

public class BuscadorService {
	HashSet<Direccion> direcciones=new HashSet<Direccion>();
	public BuscadorService() {
			direcciones.add(new Direccion("http://www.amazon.es/", "libros", "web de libros y más cosas"));
			direcciones.add(new Direccion("http://www.fnac.es/", "libros", "libreria completa"));
			direcciones.add(new Direccion("http://www.travel.es/", "viajes", "viajes por el mundo"));
			direcciones.add(new Direccion("http://www.game.es/", "juegos", "el mundo del juego"));
			direcciones.add(new Direccion("http://www.fly.com/", "viajes", "vuelos a todos los destinos"));
			direcciones.add(new Direccion("http://www.casadellibro.es/", "libros", "libros de todos los temas")); 
	}
	//Método que a partir de una temática devuelva un subconjunto
	//con las direcciones asociadas a dicha temática
	
	public HashSet<Direccion> buscarPorTematica(String tematica) {
	    //Conjunto para almacenar las direcciones encontradas
	    HashSet<Direccion> direccionesTematica = new HashSet<>();
	    //Sobre todas las direcciones en el conjunto direcciones
	    for(Direccion d:direcciones) {
	    	//Comprobamos si la temática de la dirección coincide con la tematica que buscamos
	    	if(d.getTematica().equals(tematica)) {
	    		direccionesTematica.add(d);
	    		
	    	}
	    }
	    return direccionesTematica;

	}
	
}
