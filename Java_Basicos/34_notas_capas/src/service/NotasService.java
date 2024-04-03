package service;

import java.util.ArrayList;

public class NotasService {

	//	Realizar una nueva versión del programa de las notas. Al iniciar el programa
	//	aparecerá el siguiente menú:
	//	1.- Nueva nota
	//	2.- Calcular media
	//	3.- Notas extremas
	//	4.- Ver todas
	//	5.- Salir 

	ArrayList<Double> notas=new ArrayList<Double>();
	public void agregarNota(double nota) {
		notas.add(nota);
	}
	public double media() {
		double media=0;
		for(Double n:notas) {
			media+=n;
		}
		return media/notas.size();
	}
	public double max() {
		double mayor=notas.get(0);
		for(Double n:notas) {
			if(n>mayor) {
				mayor=n;
			}
		}
		return mayor;
	}
	public double min() {
		double menor=notas.get(0);
		for(Double n:notas) {
			if(n<menor) {
				menor=n;
			}
		}
		return menor;
	}
	public Double[] obtenerNotas() {
		/*double[] todas=new double[notas.size()];
		for(int i=0;i<notas.size();i++) {
			todas[i]=notas.get(i);
		}
		return todas;*/
		return notas.toArray(new Double[0]);
	}

	
} 

