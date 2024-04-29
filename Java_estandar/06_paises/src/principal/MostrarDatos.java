package principal;

import java.util.List;
import java.util.Map;

import model.Pais;
import service.PaisesService;

public class MostrarDatos {

	public static void main(String[] args) {
		var paisesService=new PaisesService();
		paisesService.getContinentes().forEach(System.out::println);
		
		Map<String,List<Pais>> tabla=paisesService.getTablaPaisContinente();
		
		tabla.forEach((k,v)->{
			System.out.println(k);
			v.forEach(System.out::println);
		});

	}

}
