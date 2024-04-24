package service;

import java.util.ArrayList;

public class ListNumber extends ArrayList<Integer> {
	/*Vamos a crear una clase, llamada ListNumber, para manejar listas de números enteros.
	La clase, heredará ArrayList<Integer>, e incorporará las siguientes mejoras:
	-Método first() que devuelve el primer elemento de la lista
	-Método last() que devuelve el último elemento de la lista
	 (ambos devuelven null si la lista está vacía)
	-Método sum() que devuelve la suma de todos los elementos de la lista.
	-No debe permitir añadir números ya existentes */
	
	public Integer first() {
		if(this.isEmpty()) { //Si la ArrayList no esta vacia
			return this.get(0);
		}
		return null; //Si la ArrayList esta vacia
	}
	public Integer last() {
		if(this.isEmpty()) { //Si la ArrayList no esta vacia
			return this.get(this.size()-1); //El tamaño de la lista menos uno
		}
		return null; //Si la ArrayList no esta vacia
	}

	public int sum(){
		int suma=0;
		for (Integer n:this) {
			suma+=n;
		}
		return suma;
	}
	@Override
	public boolean add(Integer e) {
		if(!contains(e)) {
			return super.add(e);
		}
		return false; 
	}

}
