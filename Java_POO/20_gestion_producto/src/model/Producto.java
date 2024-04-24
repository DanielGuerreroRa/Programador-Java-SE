package model;

public class Producto {
	//Programa para gestión de productos. Cada producto tendrá: nombre, precio, categoria
	private String nombre;
	private double precio;
	private String categoria;
	
	public Producto(String nombre, double precio, String categoria) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.categoria = categoria;
	}
	public Producto() {
	
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double d) {
		this.precio = d;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", categoria=" + categoria + "]";
	}
	
	
	

}
