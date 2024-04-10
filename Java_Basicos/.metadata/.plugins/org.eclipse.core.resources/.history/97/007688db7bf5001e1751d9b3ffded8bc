package service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

import model.Pedido;

public class PedidosService {
	HashSet<Pedido> pedidos=new HashSet<>();
	
	public void nuevoPedido(Pedido pedido) {
		pedidos.add(pedido);
	}
	
	public Pedido pedidoMasReciente() {
		Pedido pAux=null;
		LocalDate fMax=LocalDate.of(0,1,1); //1/1/1970
		for(Pedido p:pedidos) {
			//si encontramos pedido con fecha más reciente que fMax
			//actualizamos fMax y pAux
			if(p.getFechaPedido().isAfter(fMax)) {
				fMax=p.getFechaPedido();
				pAux=p;
			}
		}
		return pAux;
	}
	
	public ArrayList<Pedido> pedidosEntreFechas(LocalDate f1, LocalDate f2) {
		ArrayList<Pedido> aux=new ArrayList<Pedido>();
		for(Pedido p:pedidos) {
			//si fecha del pedido es posterior o igual a f1 y anterior o igual a f2, se incluye
			if(p.getFechaPedido().compareTo(f1)>=0&&p.getFechaPedido().compareTo(f2)<=0) {
				aux.add(p);
			}
		}
		return aux;
	}
}
