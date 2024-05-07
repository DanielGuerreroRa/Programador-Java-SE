package view;

import service.ComunidadesService;
import service.DatosProvinciasService;

public class Volcado {

	public static void main(String[] args) {
		var comService=new ComunidadesService();
		var provService=new DatosProvinciasService();
		comService.saveComunidades(provService.comunidades());
		comService.saveProvincias(provService.provincias());
		comService.saveMunicipios(provService.municipios());
		System.out.println("Volcado completado!!");

	}

}
