package view;

public class PruebaNumeros {

	public static void main(String[] args) {

		//Escribe un método que nos muestre la parte entera de cualquier objeto numérico de envoltorio:
        //método(d) -> 2
        //método(integ) ->7
        //método(ft) -> 3 

		Double d=2.3;
		Integer integ=7;
		Float ft=3.4f;


	}
	
	public static int mostarNumero(Number num) {
		return num.intValue(); 
	}

}
