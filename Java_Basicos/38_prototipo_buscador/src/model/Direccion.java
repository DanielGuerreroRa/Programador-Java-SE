package model;

public class Direccion {
	
	//Atributos
	private String url;
	private String tematica;
	private String descripcion;
	
	
	//Constructor
	public Direccion(String url, String tematica, String descripcion) {
		this.url = url;
		this.tematica = tematica;
		this.descripcion = descripcion;
	}
	
	//Setters y Getters
	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getTematica() {
		return tematica;
	}


	public void setTematica(String tematica) {
		this.tematica = tematica;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	

}
