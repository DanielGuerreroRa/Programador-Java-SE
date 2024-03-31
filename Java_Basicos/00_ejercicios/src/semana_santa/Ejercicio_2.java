package semana_santa;

import java.util.Arrays;

public class Ejercicio_2 {
	public static void main(String[] args) {
		//El programa mostrará:
		//Nombre del departamento que más a facturado
		//Nombres de todos los departamentos, ordenados de menos a más facturación

		String facturacion="ventas-20800,administracion-17900,informatica-35000,RRHH-10350";

		//Separar cada departamento
		String[] departamentos = facturacion.split(",");
		//Variable para el departamento que más a facturado
		String dptoMasFacturado="";
		//Variable para el máximo valor
		int maximoValor=0;


		//Encontrar el departamento que mas a facturado, para recorrer cada elemento del array departamentos
		for (String departamento:departamentos) { //se guarda el nombre del departamento actual en departamento
			//Dividimos el string para el nombre del dpto y la factiruación
			String[] nombreDpto = departamento.split("-");
			int facturacionDpto = Integer.parseInt(nombreDpto[1]);
			//Si la facturacionDpto es mayor que la maximoValor, se actualiza la variable maximoValor
			if (facturacionDpto > maximoValor) {
				maximoValor = facturacionDpto;
				//También se actualiza la variable dptoMasFacturado con el nombre del Dpto que más facturo
				dptoMasFacturado = nombreDpto[0];
			}
		}

		//Ordenar los departamentos de menor a mayor segun lo que facturaron
		Arrays.sort(departamentos); 

		//Mostrar el nombre del departamento con la máxima facturación
		System.out.println("Departamento que más ha facturado: "+dptoMasFacturado);
		System.out.println("");

		//Mostrar los departamentos ordenados por facturación
		System.out.println("Departamentos de menos a más facturación:");
		for (String departamento : departamentos) {
			String[] nombreDpto = departamento.split("-");
			System.out.println(nombreDpto[0]);
		}
	}
}

