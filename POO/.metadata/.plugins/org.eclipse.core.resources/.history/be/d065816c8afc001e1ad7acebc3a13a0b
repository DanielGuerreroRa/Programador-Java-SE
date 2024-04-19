package view;

import java.util.List;

import service.Condicion;
import service.OperacionesService;

class Positivos implements Condicion{
	@Override
	public boolean test(Integer n) {
		return n>0;
	}
}
class Pares implements Condicion{
	@Override
	public boolean test(Integer n) {
		return n%2==0;
	}
	
public class AppNumeros {

	public static void main(String[] args) {
		List<Integer> numeros=List.of(3,-2,8,5,1,17,22,-9,6,12);
		OperacionesService service=new OperacionesService();
		
		//imprimir, por una lado, la suma de los pares
		
		
		//y por otro la suma de los positivos
		System.out.println("Suma positivos: "+service.sumarPorCondicion(numeros, new Positivos()));
	}

}
