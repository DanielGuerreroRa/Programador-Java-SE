package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import locator.LocatorConnection;
import model.Provincia;

class ProvinciasDaoImpl implements ProvinciasDao {

	@Override
	public void saveProvincias(List<Provincia> provincias) {
		try (Connection con=LocatorConnection.getConnection();){
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

	@Override
	public List<String> findCodigos() {
		List<String> codigos=new ArrayList<String>();
		try (Connection con=LocatorConnection.getConnection();){
			String sql="select codigo from provincias";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				codigos.add(rs.getString(1));
			}
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		return codigos;
	}

}
