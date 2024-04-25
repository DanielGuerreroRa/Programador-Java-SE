package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import model.Pedido;
import utilidades.Util;

public class PedidosService {
	Path pt=Path.of("pedidos.csv");
	//cada pedido se graba en una línea:
	//producto,unidades,fechaPedido
	public void borrarPedidos() {
		try {
			Files.deleteIfExists(pt);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void nuevoPedido(Pedido pedido) {		
		try {
			Files.writeString(pt, Util.convertirPedidoACadena(pedido)+System.lineSeparator(), StandardOpenOption.APPEND,StandardOpenOption.CREATE);
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	public void nuevoPedido(String producto, int unidades, LocalDate fechaPedido) {
		Pedido p=new Pedido(producto,unidades,fechaPedido);
	
		nuevoPedido(p);
	}
	
	public Pedido pedidoMasReciente() {

		try {
			return Files.lines(pt)
					.map(Util::convertirCadenaAPedido)
					.max(Comparator.comparing(p->p.getFechaPedido()))
					.orElse(null);
		}
		catch(IOException ex) {
			ex.printStackTrace();
			return null;
		}
	}
	
	public List<Pedido> pedidosEntreFechas(LocalDate f1, LocalDate f2) {
		
		try {
			return Files.lines(pt)
					.map(Util::convertirCadenaAPedido)
					.filter(p->p.getFechaPedido().compareTo(f1)>=0&&p.getFechaPedido().compareTo(f2)<=0)
					.toList();
		}
		catch(IOException ex) {
			ex.printStackTrace();
			return List.of();
		}
	}
	
	public Pedido pedidoProximoFecha(LocalDate fecha) {
	
		try {
			return Files.lines(pt)
					.map(Util::convertirCadenaAPedido)
					.min(Comparator.comparingLong(p->Math.abs(ChronoUnit.DAYS.between(p.getFechaPedido(), fecha))))
					.orElse(null);
		}
		catch(IOException ex) {
			ex.printStackTrace();
			return null;
		}
	}
	
	public void eliminarPedido(String producto) {
		try {
			List<String> pedidos= Files.lines(pt)
					.map(Util::convertirCadenaAPedido)//Stream<Pedido>
					.filter(p->!p.getProducto().equals(producto))//Stream<Pedido>
					.map(Util::convertirPedidoACadena)//Stream<String>
					.toList();
			Files.write(pt, pedidos);
		}
		catch(IOException ex) {
			ex.printStackTrace();
			
		}
	}
	public List<Pedido> pedidos(){
		try {
			return Files.lines(pt)
					.map(Util::convertirCadenaAPedido)//Stream<Pedido>
					.toList();
		}
		catch(IOException ex) {
			ex.printStackTrace();
			return null;
		}
	}
}

