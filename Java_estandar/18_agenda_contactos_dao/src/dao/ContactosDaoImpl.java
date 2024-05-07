package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import locator.LocatorConnection;
import model.Contacto;

public class ContactosDaoImpl implements ContactosDao {

	@Override
	public void save(Contacto contacto) {
		try(Connection con=LocatorConnection.getConnection()){		
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

	@Override
	public Contacto findByEmail(String email) {
		try(Connection con=LocatorConnection.getConnection()){		
			String sql="select * from contactos where email=?";
			PreparedStatement st=con.prepareStatement(sql);
			st.setString(1, email);
			ResultSet rs=st.executeQuery();
			//debemos movernos a la primera y única fila, para poder extraer
			//el valor de dicha fila
			if(rs.next()) {
				return new Contacto(rs.getInt("idContacto"),
							rs.getString("nombre"),
							rs.getString("email"),
							rs.getInt("edad"));
			}
				
			return null;
		}catch(SQLException ex) {
			ex.printStackTrace();
			return null;
		}
	}

	@Override
	public void update(Contacto contacto) {
		try(Connection con=LocatorConnection.getConnection();){	
			String sql = "UPDATE contactos SET nombre = ?, email = ?, edad = ? WHERE idContacto = ?"; 
			PreparedStatement st=con.prepareStatement(sql);
			st.setString(1, contacto.getNombre());
			st.setString(2, contacto.getEmail());
			st.setInt(3, contacto.getEdad());
			st.setInt(4, contacto.getIdContacto());
			st.execute();
		}
		catch(SQLException ex) {
			ex.printStackTrace();
			
		}

	}

	@Override
	public Contacto findById(int idContacto) {
		try(Connection con=LocatorConnection.getConnection();){		
			String sql="select * from contactos where idContacto=?";
			PreparedStatement st=con.prepareStatement(sql);
			st.setInt(1, idContacto);
			ResultSet rs=st.executeQuery();
			//debemos movernos a la primera y única fila, para poder extraer
			//el valor de dicha fila
			if(rs.next()) {
				return new Contacto(rs.getInt("idContacto"),
							rs.getString("nombre"),
							rs.getString("email"),
							rs.getInt("edad"));
			}
				
			return null;
		}catch(SQLException ex) {
			ex.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Contacto> findAll() {
		List<Contacto> contactos=new ArrayList<Contacto>();
		try(Connection con=LocatorConnection.getConnection();){		
			String sql="select * from contactos";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				contactos.add(new Contacto(rs.getInt("idContacto"),
						rs.getString("nombre"),
						rs.getString("email"),
						rs.getInt("edad")));
				
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
			
		}
		return contactos;
	}

	@Override
	public void deleteByEmail(String email) {
		try(Connection con=LocatorConnection.getConnection();){		
			String sql="delete from contactos where email=?";
			PreparedStatement ps=con.prepareStatement(sql);
			//sustituimos parámetros por valores
			ps.setString(1, email);
			
		}catch(SQLException ex) {
			ex.printStackTrace();
			
		}
		
	}

}
