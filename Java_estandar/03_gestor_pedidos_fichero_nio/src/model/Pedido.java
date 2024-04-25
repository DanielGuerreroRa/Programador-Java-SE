package model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pedido {
	private String producto;
	private int unidades;
	public LocalDate fechaPedido;
	
}
