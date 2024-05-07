package view;

import service.ComunidadesServiceFactory;
import service.DatosProvinciasService;

public class Volcado {

	public static void main(String[] args) {
		var comService=ComunidadesServiceFactory.getcomunidadService();
		var provService=new DatosProvinciasService();
		System.out.println("Comunidades guardadas: "+ comService.saveComunidades(provService.comunidades()));
		System.out.println("Provincias guardadas: "+ comService.saveProvincias(provService.provincias()));
		System.out.println("Municipios guardados: "+ comService.saveMunicipios(provService.municipios()));
		System.out.println("Volcado completado!!");

	}

}
