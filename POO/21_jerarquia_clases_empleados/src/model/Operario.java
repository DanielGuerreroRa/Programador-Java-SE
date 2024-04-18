package model;

import java.time.LocalDate;

public class Operario extends Empleado{

	private int nivel;

	@Override
	public void incentivar() {
		double aumento=0;
		if (nivel>2 && this.getEdad()>30) {
			aumento=getSalario()+(this.getBono()*2);
			setSalario(aumento);      
		} 
	}
	public void actualizarNivel() {
		LocalDate antiguedad=LocalDate.now().minusYears(2); 
		if (this.getFechaIngreso().isBefore(antiguedad) && this.nivel < 5) {
			this.nivel++;
		}
	}


}