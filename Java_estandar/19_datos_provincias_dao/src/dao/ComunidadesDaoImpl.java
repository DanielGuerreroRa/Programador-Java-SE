package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import locator.LocatorConnection;
import model.Comunidad;

public class ComunidadesDaoImpl implements ComunidadesDao {

	@Override
	public void save(Comunidad comunidad) {
		try(Connection con=LocatorConnection.getConnection()) {
			String sql="insert into comunidades(codigo,nombre) value(?,?)"; 
			PreparedStatement ps=con.prepareStatement(sql);
			 
				ps.setString(1, comunidad.getCodigo());
				ps.setNString(2, comunidad.getNombre());
				ps.execute();//ejecutarla sentencia SQL.
			
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}

	}
	
	public Comunidad findByComunidad(String nombreComunidad) {
		try(Connection con=LocatorConnection.getConnection()) {
			String sql="select * from comunidades where nombre=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, nombreComunidad);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				return new Comunidad(rs.getString("codigo"),
						rs.getString("nombre"));
						
			}
			return null;
		}
		catch(SQLException ex) {
			ex.printStackTrace();
			
			
		}
		return null;
	}


}