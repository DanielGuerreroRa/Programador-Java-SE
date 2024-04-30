package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

import model.Pedido;

public class PedidosService {
	String cadenaConexion="jdbc:mysql://localhost:3306/tiendavirtual";
	String usuario="root";
	String password="root";
	public void guardarPedido(Pedido pedido) {
		try(Connection con=DriverManager.getConnection(cadenaConexion);){
			
		}
		catch(SQLException ex) {
			ex.printStackTrace()
		}
	}
	
	public List<Pedido> pedidosEntreFechas(LocalDateTime f1, LocalDateTime f2){
		
	}
}
