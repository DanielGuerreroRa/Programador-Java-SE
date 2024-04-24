package view;

import service.Lista;

public class TestLista {

	public static void main(String[] args) {
		System.out.println(Lista.ofPares(10)); //Los 10 primeros números pares
		System.out.println(Lista.ofPositivos(5,-2,-6,9,-4,2));  //Los números positivos que implementamos
	}

}
