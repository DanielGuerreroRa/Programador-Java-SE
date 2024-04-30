package model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Pedido {
	private int idPedido;
	private int unidades;
	private double total;
	private LocalDateTime fechaPedido;
	private int codigoProducto;
}
