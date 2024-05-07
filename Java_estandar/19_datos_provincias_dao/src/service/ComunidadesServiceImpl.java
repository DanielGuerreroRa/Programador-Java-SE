package service;

import java.util.List;

import dao.ComunidadesDao;
import dao.MunicipiosDao;
import dao.ProvinciasDao;
import model.Comunidad;
import model.Municipio;
import model.Provincia;

public class ComunidadesServiceImpl implements ComunidadesService {
	
		ComunidadesDao comunidadesDao;
		MunicipiosDao municipiosDao;
		ProvinciasDao provinciasDao;
		
		public ComunidadesServiceImpl() {
			comunidadesDao = ComunidadesDao.of();
			municipiosDao = MunicipiosDao.of();
			provinciasDao = ProvinciasDao.of();
			
		}
	
	@Override
	public int saveComunidades(List<Comunidad> comunidades)  {
		int i=0;
		for(Comunidad comunidad:comunidades) {
			if (comunidadesDao.findByComunidad(comunidad.getNombre()) ==null) {
				comunidadesDao.save(comunidad);
				i++;
			}
	
		}
		return i;
	}

	@Override
	public int saveProvincias(List<Provincia> provincias) {
		int i=0;
		for(Provincia provincia:provincias) {
			if (provinciasDao.findByName(provincia.getNombre()) ==null) {
				provinciasDao.save(provincia);
				i++;
			}
	
		}
		return i;
	}

	@Override
	public int saveMunicipios(List<Municipio> municipios) {
		int i=0;
		for(Municipio municipio:municipios) {
			if (municipiosDao.findByName(municipio.getNombre()) ==null) {
				municipiosDao.save(municipio);
				i++;
			}
	
		}
		return i;
	}
}
