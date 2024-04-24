package service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import model.Pedido;

public class PedidosService {
	HashSet<Pedido> pedidos=new HashSet<>();
	
	public void nuevoPedido(Pedido pedido) {
		pedidos.add(pedido);
	}
	//Método que devuelve el pedido más reciente, pero si hubiera más de uno que cumpla esa condición
    //(misma fecha), que devuelva el que tiene mas unidades
	
	
	public Optional<Pedido> pedidoMasReciente() {
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
		return pedidos.stream()//Stream<Pedido>
				.max(Comparator.comparing((Pedido p)->p.getFechaPedido())
						.thenComparingInt(p->p.getUnidades())); 
				
	}
	
	public List<Pedido> pedidosEntreFechas(LocalDate f1, LocalDate f2) {
		/*ArrayList<Pedido> aux=new ArrayList<Pedido>();
		for(Pedido p:pedidos) {
			//si fecha del pedido es posterior o igual a f1 y anterior o igual a f2, se incluye
			if(p.getFechaPedido().compareTo(f1)>=0&&p.getFechaPedido().compareTo(f2)<=0) {
				aux.add(p);
			}
		}
		return aux;*/
		return pedidos.stream()
				.filter(p->p.getFechaPedido().compareTo(f1)>=0&&p.getFechaPedido().compareTo(f2)<=0)//Stream<Pedido>
				.collect(Collectors.toList());
	}
	
	public Pedido pedidoProximoFecha(LocalDate fecha) {
		/*Pedido pAux=new Pedido();
		pAux.setFechaPedido(LocalDate.of(1, 1, 1));
		//comparamos la diferencia de días entre la fecha de cada pedido y la 
		//parámetro, con la diferencia de días entre la fecha auxiliar y la parámetro
		//si la del pedido es inferior, actualizamos la variable pedido auxiliar
		for(Pedido p:pedidos) {
			if(Math.abs(ChronoUnit.DAYS.between(p.getFechaPedido(), fecha))<
					Math.abs(ChronoUnit.DAYS.between(pAux.getFechaPedido(), fecha))) {
				pAux=p;
			}
		}
		return pAux;*/
		
		return pedidos.stream()
				//.min(Comparator.comparingLong(p->Math.abs(ChronoUnit.DAYS.between(p.getFechaPedido(), fecha))))
				.min((a,b)->Long.compare(Math.abs(ChronoUnit.DAYS.between(a.getFechaPedido(), fecha)), 
						Math.abs(ChronoUnit.DAYS.between(b.getFechaPedido(), fecha))))
				.orElse(null); 
	}
	
	//Métdodo que devuelva la lista de pedidos del producto recibido como párametro
	public List<Pedido> pedidosPorProducto(String producto) {
	    return pedidos.stream()
	                  .filter(p->p.getProducto().equalsIgnoreCase(producto))
	                  .collect(Collectors.toList());
	}
	
	//Método que devuelva el pedido con menor número de unidades. Si hay mas de uno el primero que encuentre
	public Optional<Pedido> pedidoConMenosUnidades() {
		return pedidos.stream()
				.min(Comparator.comparingInt(p->p.getUnidades()));	                		  
	}
	
	//Método que devuelve una cadena de nombres de todos los productos sin duplicar separados con una ","
	public String nombresProductos() {
		return pedidos.stream() //Stream<Pedido>
				.map(p->p.getProducto()) //Stream<Sting>
				.distinct() //No haya duplicados
				.collect(Collectors.joining(",")); //Separados con una ","
	}
}

