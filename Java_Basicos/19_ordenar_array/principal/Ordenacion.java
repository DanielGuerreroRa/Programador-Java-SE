package principal;

public class Ordenacion {

	public static void main(String[] args) {
		//Ordenar las edades de menor a mayor
		int[] edades= {19,26,14,55,38,27,30};
		
		for(int i=0;i<edades.length;i++) {
			for(int j=i+1;j<edades.length;j++) {
				if(edades[j]<edades[i]) 
					int aux=edades[j];
					edades[j]=edades[i];
					edades[i]=aux;
				}
			}
		}
		System.out.println("Edades ordenadas de menor a mayor:");
        for (int edad : edades) {
            System.out.print(edad + ", ");
        }

	}

}