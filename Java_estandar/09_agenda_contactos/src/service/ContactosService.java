package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Contacto;

public class ContactosService {
	String cadenaConexion="jdbc:mysql://localhost:3306/agenda";
	String usuario="root";
	String password="root";
	public void nuevoContacto(Contacto contacto) {
		try(Connection con=DriverManager.getConnection(cadenaConexion,usuario,password);){		
			String sql="insert into contactos(nombre,email,edad) values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			//sustituimos parámetros por valores
			ps.setString(1, contacto.getNombre());
			ps.setString(2, contacto.getEmail());
			ps.setInt(3, contacto.getEdad());
			ps.execute();//NO se manda otra vez la SQL
			
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
	public boolean eliminarContacto(String email) {
		try(Connection con=DriverManager.getConnection(cadenaConexion,usuario,password);){		
			String sql="delete from contactos where email=?";
			PreparedStatement ps=con.prepareStatement(sql);
			//sustituimos parámetros por valores
			ps.setString(1, email);
			return ps.executeUpdate()>0;
		}catch(SQLException ex) {
			ex.printStackTrace();
			return false;
		}
	}
	public boolean actualizarContacto(String email, int nuevaEdad) {
		try(Connection con=DriverManager.getConnection(cadenaConexion,usuario,password);){		
			String sql="update contactos set edad=? where email=?";
			PreparedStatement ps=con.prepareStatement(sql);
			//sustituimos parámetros por valores
			ps.setInt(1, nuevaEdad);
			ps.setString(2, email);
			return ps.executeUpdate()>0;	
		}catch(SQLException ex) {
			ex.printStackTrace();
			return false;
		}
	}
}
