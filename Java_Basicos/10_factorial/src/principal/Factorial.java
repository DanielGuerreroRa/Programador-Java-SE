package principal;

public class Factorial {

	public static void main(String[] args) {
		int num=7;
		//este programa calcula y muestra el factorial de un número
		int factorial=1;
		for(int i=num;i>=2;i--) {
			factorial=factorial*i;
		}
		System.out.println("Factorial de "+num+" es: "+factorial);
	}

}
