package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import locator.LocatorConnection;
import model.Alumno;

public class AlumnosServiceImpl implements AlumnosService {
	
	@Override
	public Alumno alumnoPorDni(String dni) {
		try(Connection con=LocatorConnection.getConnection();){		
			String sql="select * from alumnos where dni=?";
			PreparedStatement st=con.prepareStatement(sql);
			st.setString(1, dni);
			ResultSet rs=st.executeQuery();
			//debemos movernos a la primera y única fila, para poder extraer
			//el valor de dicha fila
			if(rs.next()) {
				return new Alumno(rs.getString("dni"),
							rs.getString("nombre"),
							rs.getInt("edad"),
							rs.getDouble("nota"),
							rs.getInt("idCurso"));
			}
				
			return null;
		}catch(SQLException ex) {
			ex.printStackTrace();
			return null;
		}
	}
	@Override
	public boolean guardarAlumno(Alumno alumno) {
		if(alumnoPorDni(alumno.getDni())!=null) {
			return false;
		}
		try(Connection con=LocatorConnection.getConnection();){		
			String sql="insert into alumnos(dni,nombre,edad,nota,idCurso) values(?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			//sustituimos parámetros por valores
			ps.setString(1, alumno.getDni());
			ps.setString(2, alumno.getNombre());
			ps.setInt(3, alumno.getEdad());
			ps.setDouble(4, alumno.getNota());
			ps.setInt(5, alumno.getIdCurso());
			ps.execute();//NO se manda otra vez la SQL
			return true;
			
		}catch(SQLException ex) {
			ex.printStackTrace();
			return false;
		}
	}
}
