package service;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class FuncionalesService {
	public void m1(Set<Integer> nums, Function<String,Integer> fn) {
	//Set<Integer> nums:Es un conjunto de números enteros Integer	
    //Function<String,Integer>:Es el parámetro que espera una función que tome una cadena String como entrada y devuelva un entero Integer
	}

	public void m2(Supplier<String> sp, Consumer<Integer> cs) {
    //Supplier<String> proporciona un valor de tipo String
    //Consumer<Integer> Se utiliza cuando necesitas realizar alguna acción con el valor 
	//pero no necesitas devolver ningún resultado. En este caso de tipo Integer
	}

	public void m3(BinaryOperator<Double> db, BiFunction<Integer,String,Integer> bf){
    //BinaryOperator<Double>:Espera un operador binario que opera en valores del tipo Double y devuelve un resultado del mismo tipo
	//BiFunction<Integer,String,Integer>:Espera una función que toma dos argumentos de entrada Integer y String y devuelve un resultado de tipo Integer
	}

	public void m4(BiConsumer<String,Double> bc, BiPredicate<String,Long> bp) {
	//BiConsumer<String,Double>:Espera un consumidor binario que tome dos argumentos, una cadena String y un valor de tipo Double, pero no devuelve ningún resultado
	//BiPredicate<String,Long>:Espera un predicado binario que tome dos argumentos, una cadena String y un valor de tipo Long, y devuelva un resultado booleano(true o false)
	}
	
    public void m5(IntSupplier is, List<String> lst) {
	//IntSupplier:Espera un proveedor de valor entero int. La interfaz funcional representa una función que no toma argumentos y devuelve un valor entero	
    //List<String>:Espera una lista de cadenas String
	}
    
	public void m6(Map<String,Integer> mp, BiConsumer<String,Long> bc) {
	//Map<String,Integer>:Espera un mapa que asocie cadenas String con enteros Integer
	//BiConsumer<String, Double>:Espera un consumidor binario que tome dos argumentos, una cadena String y un valor de tipo Integer, pero no devuelve ningún resultado	
	}
	
	public void m7(Function<String,List<Integer>> f) {
	//Function<String,List<Integer>>:Espera una función que tome una cadena String como entrada y devuelva una lista de enteros List<Integer>	
	} 

}
