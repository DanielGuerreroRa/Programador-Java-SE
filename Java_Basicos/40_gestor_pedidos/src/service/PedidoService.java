package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

import model.Pedido;

public class PedidoService {

	//Almacenamos los pedidos en un HashSet
	HashSet<Pedido> pedidos = new HashSet<>();

	public void nuevoPedido(Pedido pedido) {
		pedidos.add(pedido); //Agregamos el pedido
	}

	public Pedido pedidoMasReciente() {
		Pedido pAux=null;
		Date fMax=new Date(0); //01/01/1970
		for (Pedido p: pedidos) { 
			//Si encontramos el pedido con fecha más reciente que fMax
			//Actualizamos fMax y pAux
			if(p.getFechaPedido().after(fMax)) {
				fMax=p.getFechaPedido();
				pAux=p;
			}
		}
		return pAux;

	}

	public ArrayList<Pedido> pedidosEntreFechas(Date f1, Date f2){
		ArrayList<Pedido> pAux=new ArrayList<Pedido>();
		for (Pedido p: pedidos) {
			//Si la fecha del pedido es posterior o igual a f1 y anterior o igual a f2
			if (p.getFechaPedido().compareTo(f1)>=0 && p.getFechaPedido().compareTo(f2)<=0) {                
				pAux.add(p); //Agregamos a la lista
			}
		}
		return pAux; //Devuelve la lista de pedidos entre las fechas dadas
	}


}
