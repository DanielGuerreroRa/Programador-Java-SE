package model;

public class Director extends Empleado{
	
	private String departamento;
	private int personal;

	@Override
	public void incentivar() {
		int meses=0;
		double aumento=0;
		if(meses>=30 && personal>=20) {
			 aumento=getSalario()+(this.getBono()*2);
	            setSalario(aumento);
		}
		
	}

}
