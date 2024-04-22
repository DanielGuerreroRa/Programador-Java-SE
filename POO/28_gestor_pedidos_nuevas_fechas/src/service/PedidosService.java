package service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.stream.Collectors;

import model.Pedido;

public class PedidosService {
	HashSet<Pedido> pedidos=new HashSet<>();
	
	public void nuevoPedido(Pedido pedido) {
		pedidos.add(pedido);
	}
	
	public Pedido pedidoMasReciente() {
		/*Pedido pAux=null;
		LocalDate fMax=LocalDate.of(0,1,1); //1/1/1970
		for(Pedido p:pedidos) {
			//si encontramos pedido con fecha más reciente que fMax
			//actualizamos fMax y pAux
			if(p.getFechaPedido().isAfter(fMax)) {
				fMax=p.getFechaPedido();
				pAux=p;
			}
		}
		return pAux;*/
		return pedidos.stream()
				.max(Comparator.comparing(p->p.getFechaPedido()))
	            .orElse(null);
	} 
	
	public ArrayList<Pedido> pedidosEntreFechas(LocalDate f1, LocalDate f2) {
		/*ArrayList<Pedido> aux=new ArrayList<Pedido>();
		for(Pedido p:pedidos) {
			//si fecha del pedido es posterior o igual a f1 y anterior o igual a f2, se incluye
			if(p.getFechaPedido().compareTo(f1)>=0&&p.getFechaPedido().compareTo(f2)<=0) {
				aux.add(p);
			}
		}
		return aux;*/
		return (ArrayList<Pedido>) pedidos.stream()
				.filter(p->p.getFechaPedido().compareTo(f1)>=0&&p.getFechaPedido().compareTo(f2)<=0) //Stream<Pedido>
				.collect(Collectors.toList());
		
	}
	 public Pedido proximaFecha(LocalDate fecha) {
		/*Pedido aux=new Pedido();
		aux.setFechaPedido(LocalDate.of(1,1,1));
		//Comprobamos la diferencia de dias entre la fecha de cada pedido y la párametro, con la diferencia de días entre
		//la fecha auxiliar y la parámetro. Si la fecha del pedido es inferior, actualizamos la variable auxiliar
		for(Pedido p:pedidos) {
			if(Math.abs(ChronoUnit.DAYS.between(p.getFechaPedido(), fecha)) 
					<Math.abs(ChronoUnit.DAYS.between(p.getFechaPedido(),fecha))) {	
				aux=p;
			}
		}
		return aux;*/
		 return pedidos.stream()
	                .filter(p -> p.getFechaPedido().isAfter(fecha))
	                .min(Comparator.comparing(p->p.getFechaPedido()))
	                .orElse(null);
	    
		
	
	}
}
