package test;

import java.util.Set;

import service.FuncionalesService;

public class Test {

	public static void main(String[] args) {
		FuncionalesService service=new FuncionalesService();
		
		//Realizar una llamada a cada método service y hacer la expresión lamda
		service.m1(Set.of(8,4,7),s->s.length());
		service.m2(()->"Valor ",num->System.out.println("número: "+num));
		service.m3(null, null);
		service.m4(null, null);
	}

}
