package model;

import java.time.LocalDateTime;

public class Movimientos {
	
	private double cantidad;
	private LocalDateTime fechaHora;
	private String tipo;
	
	public Movimientos(double cantidad, LocalDateTime fechaHora, String tipo) {
		super();
		this.cantidad = cantidad;
		this.fechaHora = fechaHora;
		this.tipo = tipo;
	}
	public Movimientos() {
		
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public LocalDateTime getFechaHora() {
		return fechaHora;
	}
	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	
}
