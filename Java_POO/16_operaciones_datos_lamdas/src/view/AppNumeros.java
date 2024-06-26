package view;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
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

			//imprimir, por una lado, la suma de los pares                                    //Condiciones Lamdas
			System.out.println("Suma positivos: "+service.sumarPorCondicion(numeros,n->n>0)); //Sustituye a la class Positivos
            //Segunda opción
			Condicion cond=(Integer n)->n>0;
			//System.out.println("Suma positivos: "+service.sumarPorCondicion(numeros,cond));  //Es mas larga pero igual de valida
			
			//y por otro la suma de los positivos
			System.out.println("Suma pares: "+service.sumarPorCondicion(numeros,n->n%2==0)); //Sustituye a la class Pares
			
			//Imprimir positivos
			service.procesarNumeros(numeros, n->System.out.println(n), n->n>0);
			
			//Guardar los pares en el fichero
			service.procesarNumeros(numeros, n->{
				try(FileOutputStream fos=new FileOutputStream("pares.txt",true);
						PrintStream out=new PrintStream(fos)){
					out.println(n);
				}catch(IOException ex) {
					ex.printStackTrace();
				}
			}, n->n%2==0);
		}

	}
