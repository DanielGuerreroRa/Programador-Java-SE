package service;

import java.util.List;

import model.Comunidad;
import model.Municipio;
import model.Provincia;

public interface ComunidadesService {
	
	//salva la lista de comunidades, evitando guardar por segunda vez
	//comunidades que ya estén en la base de datos. devuelve el total
	//de comunidades guardadas
	int saveComunidades(List<Comunidad> comunidades);
	//salva la lista de provincias, evitando guardar por segunda vez
	//provincias que ya estén en la base de datos. devuelve el total
	//de provincias guardadas
	int saveProvincias(List<Provincia> provincias);
	//salva la lista de municipios, evitando guardar por segunda vez
	//municipios que ya estén en la base de datos. devuelve el total
	//de municipios guardadas
	int saveMunicipios(List<Municipio> municipios);

}