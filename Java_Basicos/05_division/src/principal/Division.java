package principal;

public class Division {

	public static void main(String[] args) {
		int x=8;
		int y=15;
		//Mostrar el resultado de dividir mayor entre menor
		//Respetando cifras decimales
		
		//Ejemplo 1
		
		if(x>y) {
			System.out.println((double)x/y);
		}else {
			System.out.println((double)y/x);
		}
		
		//Ejemplo 2
        double rs;
		
		if(x>y) {
			rs=(double)x/y;
		}else {
			rs=(double)y/x;
		}
		System.out.println(rs);
	}

}


