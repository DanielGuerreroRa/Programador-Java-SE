package view;

import service.DatosProvinciasService;

public class MostrarDatos {

	public static void main(String[] args) {
		var service=new DatosProvinciasService();
		service.comunidades()
		.forEach(c->{
			System.out.println(c);
			service.provinciasComunidad(c)
			.forEach(p->{
				System.out.println("     "+p.getNombreProvincia());
				service.municipiosComunidad(p.getCodigoProvincia())
				.forEach(m->System.out.println("            "+m.getNombreMunicipio()));
			});
		});

	}

}
