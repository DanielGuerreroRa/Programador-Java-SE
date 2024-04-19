package empresa;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Operario extends Empleado {

	private int nivel;
	
	public Operario(String nombre, int edad, LocalDate fechaIngreso, double salario, int nivel) {
		super(nombre, edad, fechaIngreso, salario);
		this.setNivel(nivel);
		
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		if(nivel<=5&&nivel>=1) {
			this.nivel = nivel;
		}else {
			this.nivel=1;
		}
	}

	@Override
	public void incentivar() {
		if(this.getEdad()>30&&this.nivel>2) {
			this.setSalario(this.getSalario()+2*Empleado.BONO);
		}else if(this.getEdad()>30||this.nivel>2) {
			this.setSalario(this.getSalario()+Empleado.BONO);
		}

	}
	public void actualizarNivel() {
		/*Period period=Period.between(getFechaIngreso(), LocalDate.now().plusDays(1));
		if(period.toTotalMonths()>24&&this.nivel<5) {
			this.nivel++;
		}*/
		long years=ChronoUnit.YEARS.between(getFechaIngreso(), LocalDate.now().plusDays(1));
		if(years>=2&&this.nivel<5) {
			this.nivel++;
		}
	}
	

}
