package view;

import java.util.List;

import service.Condicion;
import service.OperacionesService;

/*class Positivos implements Condicion{
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
}*/

	public class AppNumeros {

		public static void main(String[] args) {
			List<Integer> numeros=List.of(3,-2,8,5,1,17,22,-9,6,12);
			OperacionesService service=new OperacionesService();

			//imprimir, por una lado, la suma de los pares                                    //Condicion Lamdas
			System.out.println("Suma positivos: "+service.sumarPorCondicion(numeros,n->n>0)); //Sustituye a creal la class Positivos
            //Segunda opción
			Condicion cond=(Integer n)->n>0;
			System.out.println("Suma positivos: "+service.sumarPorCondicion(numeros,cond));  //Es mas lasrga pero igual de valida
			//y por otro la suma de los positivos
			System.out.println("Suma pares: "+service.sumarPorCondicion(numeros,n->n%2==0)); //Sustituye a creal la class Pares
		}

	}

