package principal;

public class Comprobar {

	public static void main(String[] args) {
		int num=9;
		//si el numero es par nos muestra la mitad de este número
		//pero si es impar muestra la mitad del anterior
		if(num %2 ==0 ) {
			System.out.println(num/2);
		}else { 
			System.out.println(--num/2);
		}
		
		//Operador ternario - Es otra opcion pero no se suele utilizar
		System.out.println(num%2==0?num/2:(num-1/2));
     
		
	    //ejemplo
		int a=10;
		int b=a++;
		int c=++b;
		System.out.println(a<b?b>c?a--:c++:--b); //12

		if(a<b){
			if(b>c){
				a--;
			}else{
				c++;
			}
		}else{
			--b;
		} 
			
		}
	}
	


