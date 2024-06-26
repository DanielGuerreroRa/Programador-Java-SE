package model;

import java.time.LocalDate;

public class Pedido {


	//Programa para manejar pedidos. Un pedido se caracteriza por producto,unidades,fechaPedido.
	//Se presenta el siguiente menú:
	//1.- Nuevo pedido
	//2.- Pedido más reciente
	//3.- Pedidos entre dos fechas
	//4.- Pedido proximo a fecha
	//5.- Salir
	//
	//2: Muestra los datos del pedido más reciente
	//3: Se solicitan dos fechas, y se muestran los pedidos realizados
	//en ese rango de fechas
	//4: Se solicita una fecha y nos muestra el pedido mas cercano a dicha fecha 

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