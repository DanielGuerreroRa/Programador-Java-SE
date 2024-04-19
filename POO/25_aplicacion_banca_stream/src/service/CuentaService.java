package service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Cuenta;

public class CuentaService {
	List<Cuenta> cuentas=new ArrayList<Cuenta>(List.of(
			new Cuenta("ES1420800222823000247854",
					"Fernando López Gómez", LocalDate.parse("2018-04-14"),
					"EUR", Double.valueOf("125477.44")),
			new Cuenta("ES3520800014523000687719",
					"Marcos Pérez Sánchez", LocalDate.parse("1998-10-01"),
					"EUR", Double.valueOf("9465.59")),		
			new Cuenta("ES4720800136253000145866",
					"Francisco González Fernández", LocalDate.parse("2000-11-03") ,
					"JPY", 3258745.7),
			new Cuenta("8747-369", "Kenji Nakamura",
					LocalDate.parse("1984-06-17") , "JPY", 985471.4))); 

	//Método que a partir del número de cuenta nos indica si existe dicha cuenta con Stream.metodo
	public boolean existeCuenta(String numeroCuenta) {
		return cuentas.stream()
				.anyMatch(n->n.getNumeroCuenta().equals(numeroCuenta));
	}
	//Método que a partir de nombre de divisa, nos dice cuantas cuentas hay en dicha divisa
    public int cuentasPorDivistas(String divisa) {
    	return (int) cuentas.stream() //el casting
    			.filter(n->n.getDivisa().equals(divisa)) //sigue siendo String y por eso hay que contarlo
    			.count(); //devuelve un long y hau que poner el casting (int)
    }


}
