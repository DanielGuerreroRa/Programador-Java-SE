package view;

import service.ComunidadesService;

public class Poblaciones {

	public static void main(String[] args) {
		var comService=new ComunidadesService();
		System.out.println("Población de Madrid "+comService.publacionTotalProvincia("28"));

	}

}
