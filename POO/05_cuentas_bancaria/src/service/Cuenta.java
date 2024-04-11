package service;

public class Cuenta {
	
	/*Crear una clase llamada Cuenta, que defina operaciones
	sobre una cuenta bancaria.
	La clase tendrá un atributo saldo y los siguientes métodos:
	-ingresar(double cantidad)
	-extraer(double cantidad)
	-obtenerSaldo() */
	
	private double saldo;

	public Cuenta(double saldo) {
		super();
		this.saldo = saldo;
	}
	public Cuenta() {
		saldo=100;
	}
	public void extraer(double cantidad) {
		this.saldo-=cantidad;
	}
	public void ingresar(double cantidad) {
		this.saldo+=cantidad;
	}
	public double ObtenerSaldo() {
		return saldo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
