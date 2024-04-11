package view;

import java.util.HashSet;

class Ciudad{
	private String nombre;
	private int poblacion;
	public Ciudad(String nombre, int poblacion) {
		super();
		this.nombre = nombre;
		this.poblacion = poblacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}
	@Override   //No se puede poner equals(Ciudad aux) porque se rope la recla de sobrescritura
	public boolean equals(Object obj) {//Se pude hacer un casting
		Ciudad aux=(Ciudad)obj; //De padres a hijos
		if(nombre.equals(aux.getNombre())&&poblacion==aux.getPoblacion()) {
			return true;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return nombre.length()+poblacion;
	}
	
	
	
}

public class Test {

	public static void main(String[] args) {
		HashSet<Ciudad> ciudades= new HashSet<Ciudad>();
		ciudades.add(new Ciudad("ciudadA",20000));
		ciudades.add(new Ciudad("ciudadB",35000));
		ciudades.add(new Ciudad("ciudadC",40000));
		System.out.println(ciudades.size());
		
		for(Ciudad c:ciudades) {
			//System.out.println(c.getNombre()+"-"+c.getPoblacion());
			System.out.println(c);
		}

	}

}
