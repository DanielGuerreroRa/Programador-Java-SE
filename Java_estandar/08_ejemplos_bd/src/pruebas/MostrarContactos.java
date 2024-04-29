package pruebas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MostrarContactos {

	public static void main(String[] args) {
		String cadenaConexion="jdbc:mysql://localhost:3306/agenda";
		String usuario="root";
		String password="root";
		try(Connection con=DriverManager.getConnection(cadenaConexion, usuario, password)){
			String sql="select * from contactos";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getString("nombre")+"-"+rs.getInt("edad"));
			}
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}

	}

}
