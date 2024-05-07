package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Contacto;

public class ContactosServiceImpl implements ContactosService {
	String cadenaConexion="jdbc:mysql://localhost:3306/agenda";
	String usuario="root";
	String password="root";
	//No se admitirán contactos con email duplicado
	@Override
	public boolean nuevoContacto(Contacto contacto) {
		if(existeContactoPorEmail(contacto.getEmail())!=null) {
			return false;
		}
		try(Connection con=DriverManager.getConnection(cadenaConexion,usuario,password);){		
			String sql="insert into contactos(nombre,email,edad) values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			//sustituimos parámetros por valores
			ps.setString(1, contacto.getNombre());
			ps.setString(2, contacto.getEmail());
			ps.setInt(3, contacto.getEdad());
			ps.execute();//NO se manda otra vez la SQL
			return true;
			
		}catch(SQLException ex) {
			ex.printStackTrace();
			return false;
		}
	}
	//devuelve el contacto eliminado. Si no se ha eliminado ninguno, devuelve null
	@Override
	public Contacto eliminarContacto(String email) {
		Contacto contacto=existeContactoPorEmail(email);
		if(contacto==null) {
			return null;
		}
		try(Connection con=DriverManager.getConnection(cadenaConexion,usuario,password);){		
			String sql="delete from contactos where email=?";
			PreparedStatement ps=con.prepareStatement(sql);
			//sustituimos parámetros por valores
			ps.setString(1, email);
			return contacto;
		}catch(SQLException ex) {
			ex.printStackTrace();
			return null;
		}
	}
	@Override
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
	
	//Buscar contacto por su clave primaria
	@Override
	public Contacto buscarContactoPorId(int idContacto) {
		try(Connection con=DriverManager.getConnection(cadenaConexion,usuario,password);){		
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
	//Recuperar todos los contactos
	@Override
	public List<Contacto> getContactos(){
		List<Contacto> contactos=new ArrayList<Contacto>();
		try(Connection con=DriverManager.getConnection(cadenaConexion,usuario,password);){		
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
	//Buscar contacto por su email
		private Contacto existeContactoPorEmail(String email) {
			try(Connection con=DriverManager.getConnection(cadenaConexion,usuario,password);){		
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
	
}
