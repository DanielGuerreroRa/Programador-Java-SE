package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import locator.LocatorConnection;
import model.Comunidad;
import model.Municipio;

public class MunicipiosDaoImpl implements MunicipiosDao{

	@Override
	public void save(Municipio municipio) {
		try(Connection con=LocatorConnection.getConnection()) {
			String sql="insert into municipios"
					+ "(codigo,nombre,codProvincia,poblacion,altitud,superficie)"
					+ " value(?,?,?,?,?,?)"; 
			PreparedStatement ps=con.prepareStatement(sql);
			 
				ps.setString(1, municipio.getCodigo());
				ps.setString(2, municipio.getNombre());
				ps.setString(3, municipio.getCodProvincia());
				ps.setInt(4, municipio.getPoblacion());
				ps.setInt(5, municipio.getAltitud());
				ps.setDouble(6, municipio.getSuperficie());
				ps.execute();//ejecutarla sentencia SQL
			
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}

	}
	

	@Override
	public Municipio findByName(String nombre) {
		try(Connection con=LocatorConnection.getConnection()) {
			String sql="select * from municipios where nombre=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, nombre);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				return new Municipio(rs.getString("codigo"),
						rs.getString("nombre"),
						rs.getString("codProvincia"),
						rs.getInt("poblacion"),
						rs.getInt("altitud"),
						rs.getDouble("superficie")
						);
						
			}
			return null;
		}
		catch(SQLException ex) {
			ex.printStackTrace();
			
			
		}
		return null;
	}

}