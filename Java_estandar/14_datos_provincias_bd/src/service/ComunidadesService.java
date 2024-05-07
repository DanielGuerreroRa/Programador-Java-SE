package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import model.Comunidad;
import model.Municipio;
import model.Provincia;

public class ComunidadesService {
	String cadenaConexion="jdbc:mysql://localhost:3306/comunidades";
	String usuario="root";
	String password="root";
	
	public void saveComunidades(List<Comunidad> comunidades) {
		try (Connection con=DriverManager.getConnection(cadenaConexion,usuario,password);){
			String sql="insert into comunidades(codigo,nombre) values(?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			con.setAutoCommit(false);//cancelamos autocommit
			for(Comunidad c:comunidades){
				ps.setString(1, c.getCodigo());
				ps.setString(2, c.getNombre());
				ps.execute();
			}
			con.commit();
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
	public void saveComunidad(Comunidad comunidad) {
		//pendiente
	}
	public boolean existeComunidad(int codigo) {
		//pendiente
		return false;
	}
	public void borrarComunidades() {
		try (Connection con=DriverManager.getConnection(cadenaConexion,usuario,password);){
			String sql="delete from comunidades";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.execute();
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
	public void saveProvincias(List<Provincia> provincias) {
		try (Connection con=DriverManager.getConnection(cadenaConexion,usuario,password);){
			String sql="insert into provincias(codigo,nombre,codComunidad) values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			con.setAutoCommit(false);//cancelamos autocommit
			for(Provincia p:provincias){
				ps.setString(1, p.getCodigo());
				ps.setString(2, p.getNombre());
				ps.setString(3, p.getCodComunidad());
				ps.execute();
			}
			con.commit();
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
	public void saveMunicipios(List<Municipio> municipios) {
		try (Connection con=DriverManager.getConnection(cadenaConexion,usuario,password);){
			String sql="insert into municipios(codigo,nombre,codProvincia,superficie,altitud,poblacion) values(?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			con.setAutoCommit(false);//cancelamos autocommit
			for(Municipio m:municipios){
				ps.setString(1, m.getCodigo());
				ps.setString(2, m.getNombre());
				ps.setString(3, m.getCodProvincia());
				ps.setDouble(4, m.getSuperficie());
				ps.setInt(5, m.getAltitud());
				ps.setInt(6, m.getPoblacion());
				ps.execute();
			}
			con.commit();//confirmamos tx si no ha habido fallos
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public int publacionTotalProvincia(String codigoProvincia) {
		try (Connection con=DriverManager.getConnection(cadenaConexion,usuario,password);){
			String sql="select sum(poblacion) from municipios where codProvincia=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, codigoProvincia);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				return rs.getInt(1);
			}
			return 0;
		}
		catch(SQLException ex) {
			ex.printStackTrace();
			return 0;
		}
	}
}
