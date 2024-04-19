package service;

import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class OperacionesService {
	//Método que recibe una lista de numeros enteros y devuelve la suma de los pares
	public int sumaPares(List<Integer> numeros) {
		int suma=0;
		for (int n:numeros) {
			if (n %2==0) { //Si es par
				suma+=n; //Se suma el número par a la suma total
			}
		}
		return suma; //Devuelve la suma
	}

	//Método que recibe una lista de numeros enteros y devuelve la suma de los positivos
	public int sumaPositivos(List<Integer> numeros) {
		int suma=0;
		for (int n:numeros) {
			if (n>0) { //Si positivo
				suma+=n; //Se suma el número positivo a la suma total
			}
		}
		return suma; //Devuelve la suma
	}
	
	//Método que recibe una lista de números enteros y devuelve la suma de los multiplos de 5
	public int multiplosCinco(List<Integer> numeros) {
		int suma=0;
		for (int n:numeros) {
			if (n%5==0) { //Si es multiplo de 5
				suma+=n; //Se suma el multiplo a la suma total
			}
		}
		return suma; //Devuelve la suma
	}
	
	//Método que recibe una lista de números y una condición y devuelve la suma de los numeros que cumplen esa condición
	/*public int sumarPorCondicion(List<Integer> numeros,Condicion condicion) {
		int suma=0;
		for(Integer n:numeros) {
			if(condicion.test(n)) {
				suma+=n;
			}
		}
		return suma;
    }*/
	
	//Otra opción
	public int sumarPorCondicion(List<Integer> numeros,Predicate<Integer> condicion) {
		int suma=0;
		for(Integer n:numeros) {
			if(condicion.test(n)) {
				suma+=n;
			}
		}
		return suma;
	}
	
	//método que recibe una lista de números e imprime los pares
    //método que recibe un conjunto de números y guarda en un fichero los positivos
	//método que recibe una lista y guarda en un fichero los múltiplos de cinco
	//método que recibe un conjunto de números e imprime los negativos 
	public void procesarNumeros(Collection<Integer> numeros, Consumer<Integer> operaciones, Predicate<Integer> condicion) {
	    for (Integer n:numeros) {
	        //Verificamos si numero cumple la condición
	        if (condicion.test(n)) {
	        	//si se cumple aplicamos la operación especificada al número
	        	operaciones.accept(n);
	            //Si numero lo cumple se imprime
	            System.out.println(n);
	        }
	    }
	}
	
	
}