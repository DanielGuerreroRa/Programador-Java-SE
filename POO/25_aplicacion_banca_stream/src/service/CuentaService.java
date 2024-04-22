package service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

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
	//Método que a partir de nombre de divisa, devuelva las cuentas que hay de dicha divisa
	public List<Cuenta> listaCuentasPorDivisa(String divisa) {
		return cuentas.stream()
				.filter(c->c.getDivisa().equalsIgnoreCase(divisa)) //Stream<Cuenta>
				//.collect(Collectors.toList());
				.toList();//desde Java 16
	}

	//Método que a partir de una fecha, nos indique cuantas cuentas se crearon  a partir de dicha fecha
	public int contarCuentasDespuesFecha(LocalDate fecha) {
		return (int)cuentas.stream()
				.filter(c->c.getFechaApertura().isAfter(fecha))
				.count();
	}
	//Método que devuelva la cuenta asociada a un determinado numero
	public Cuenta buscarCuenta(String numero) {
		return cuentas.stream()
				.filter(c->c.getNumeroCuenta().equals(numero)) //Stream<Cuenta>
				.findFirst() //Optional<Cuenta>
				.orElse(null);//Si no esta devuelve un null
	}
	//Método que devuelva la cuenta asociada a un determinado numero
	public Optional<Cuenta> buscarCuentaPorTitular(String numero) {
		return cuentas.stream()
				.filter(c->c.getTitular().equals(numero)) //Stream<Cuenta>
				.findFirst(); //Optional<Cuenta>
	} 		
	//Método que devuelva la cuenta con menor saldo
	public Cuenta cuentaMenorSaldo() {
		/*return cuentas.stream()
				.sorted((a,b)->Double.compare(a.getSaldo(), b.getSaldo()))
				.findFirst() //Optional<Cuenta>
				.orElse(null);*/
		/*return cuentas.stream()
				.min((a,b)->Double.compare(a.getSaldo(), b.getSaldo()))
				.orElse(null);*/
		return cuentas.stream()
				.min(Comparator.comparingDouble(c->c.getSaldo()))
				.orElse(null);
	}
	//Método que devuelva un Map con los números de cuenta como claves y saldo como valor
	public Map<String,Double> cuentasSaldos(){
		return cuentas.stream()
	            .collect(Collectors.toMap(c->c.getNumeroCuenta(),c->c.getSaldo()));
	}  
	//Método que devuelve en una tabla de cuentas agrupadas por divisa:
	public Map<String,List<Cuenta>> cuentasAgrupadasPorDivisa(){
		return cuentas.stream()
				.collect(Collectors.groupingBy(c->c.getDivisa()));
	}
	
}

