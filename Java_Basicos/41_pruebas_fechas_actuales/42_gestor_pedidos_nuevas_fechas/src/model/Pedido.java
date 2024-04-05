package model;

import java.time.LocalDate;

public class Pedido {
	private String producto;
	private int unidades;
	public LocalDate fechaPedido;
	public Pedido(String producto, int unidades, LocalDate fechaPedido) {
		super();
		this.producto = producto;
		this.unidades = unidades;
		this.fechaPedido = fechaPedido;
	}
	public Pedido() {
		super();
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public LocalDate getFechaPedido() {
		return fechaPedido;
	}
	public void setFechaPedido(LocalDate fechaPedido) {
		this.fechaPedido = fechaPedido;
	}
	
}
