package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Condition;

public class ListNumber extends ArrayList<Integer> {
	/*Vamos a crear una clase, llamada ListNumber, para manejar listas de números enteros.
	La clase, heredará ArrayList<Integer>, e incorporará las siguientes mejoras:
	-Método first() que devuelve el primer elemento de la lista
	-Método last() que devuelve el último elemento de la lista
	 (ambos devuelven null si la lista está vacía)
	-Método sum() que devuelve la suma de todos los elementos de la lista.
	-No debe permitir añadir números ya existentes */
	
	public Integer first() {
		if(size()==0) { //si está vacía devolvemos null
			return null;
		}
		return get(0);
	}
	public Integer last() {
		if(size()==0) { //si está vacía devolvemos null
			return null;
		}
		return get(size()-1);
	}
	public int sum() {
		int suma=0;
		/*for(int i=0;i<size();i++) {
			suma+=get(i);
		}*/
		for(Integer n:this) {
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
	
	//Nuevo método eliminarNumeros: elimina los números de la lista que cumplan una condición
	public void eliminarNumeros(Condicion condicion) {
		/*for(Integer n:this) {
		  //si cumple la condición lo eliminamos
		  if(condicion.test(n)) {
			remove(n);
		  }
	   }*/
		/*for(int i=0;i<size();i++) {
		  if(condicion.test(get(i))) {
			remove(i);
		  }
	   }*/
		Iterator<Integer> it=iterator();
		while(it.hasNext()) {
			if(condicion.test(it.next())){
				it.remove();
			}
		}
	}
	
	//Método para transformar cada número de la lista en otro, debería ser capaz de transformar cada 
	//número en su cuadrado, en su mitad, en su raiz cúbica, etc... de una lista que ya existe no hay que crearla
	public void transformarNumeros(Transformar tr) {
		for(int i=0;i<size();i++) {
			set(i,tr.transformar(get(i)));
		}
	}
	
}
  