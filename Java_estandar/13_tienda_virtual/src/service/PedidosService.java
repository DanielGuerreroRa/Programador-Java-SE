package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import model.Pedido;

public class PedidosService {
	String cadenaConexion="jdbc:mysql://localhost:3306/tiendavirtual";
	String usuario="root";
	String password="root";
	public void guardarPedido(Pedido pedido) {
		try(Connection con=DriverManager.getConnection(cadenaConexion,usuario,password);){
			String sql="insert into pedidos(unidades,total,fechaPedido,codigoProducto) values(?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, pedido.getUnidades());
			ps.setDouble(2, pedido.getTotal());
			ps.setTimestamp(3, Timestamp.valueOf(pedido.getFechaPedido()));
			ps.setInt(4, pedido.getCodigoProducto());
			ps.execute();
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public List<Pedido> pedidosEntreFechas(LocalDateTime f1, LocalDateTime f2){
		List<Pedido> pedidos=new ArrayList<>();
		try(Connection con=DriverManager.getConnection(cadenaConexion,usuario,password);){
			String sql="select * from pedidos where fechaPedido>=? and fechaPedido<=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setTimestamp(1, Timestamp.valueOf(f1));
			ps.setTimestamp(2, Timestamp.valueOf(f2));
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				pedidos.add(new Pedido(rs.getInt("idPedido"),
						rs.getInt("unidades"),
						rs.getDouble("total"),
						rs.getTimestamp("fechaPedido").toLocalDateTime(),
						rs.getInt("codigoProducto")
						));
			}
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		return pedidos;
	}
}
