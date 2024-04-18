package test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import service.FuncionalesService;

public class Test {

	public static void main(String[] args) {
		FuncionalesService service=new FuncionalesService();
		
		//Realizar una llamada a cada método service y hacer la expresión lamda
		service.m1(Set.of(8,4,7),s->s.length());
		service.m2(()->"Valor ",num->System.out.println(num));
		service.m3((v1,v2)-> v1+v2,(num,string)->num+string.length());
		service.m4((a,b)->System.out.println(a+b),(a,b)->a.length()>b);
		service.m5(()->1, List.of("a","b","c"));
		service.m6(Map.of("a",1,"b",2),(a,b)->System.out.println(a+b));
		service.m7(a->List.of(a.length(),5,1));
	}

}
