package service;

import java.util.List;

import dao.ComunidadesDao;
import dao.ComunidadesDaoFactory;
import dao.MunicipiosDao;
import dao.ProvinciasDao;
import model.Comunidad;
import model.Municipio;
import model.Provincia;

class ComunidadesServiceImpl implements ComunidadesService {
	ComunidadesDao comunidadesDao;
	ProvinciasDao provinciasDao;
	MunicipiosDao municipiosDao;	
	
	public ComunidadesServiceImpl() {
		comunidadesDao=ComunidadesDaoFactory.getComunidadesDao();
		provinciasDao=ComunidadesDaoFactory.getProvinciasDao();
		municipiosDao=ComunidadesDaoFactory.getMunicipiosDao();
	}
	@Override
	public int saveComunidades(List<Comunidad> comunidades) {
		/*solucion 1
		int cont=0;
		for(Comunidad c:comunidades) {
			if(!comunidadesDao.existComunidad(c.getCodigo())) {
				comunidadesDao.save(c);
				cont++;
			}
		}
		return cont;
		
		return (int)comunidades.stream()
				.filter(c->!comunidadesDao.existComunidad(c.getCodigo()))
				.peek(c->comunidadesDao.save(c))
				.count();
		*/
		//solución 2
		List<Comunidad> aux=comunidades.stream()
				.filter(c->!comunidadesDao.existComunidad(c.getCodigo()))
				.toList();
		comunidadesDao.save(aux);
		return aux.size();
	}

	@Override
	public int saveProvincias(List<Provincia> provincias) {
		List<String> codigos=provinciasDao.findCodigos();
		List<Provincia> aux=provincias.stream()
				.filter(p->!codigos.contains(p.getCodigo()))
				.toList();
		provinciasDao.saveProvincias(aux);
		return aux.size();
	}

	@Override
	public int saveMunicipios(List<Municipio> municipios) {
		List<String> codigos=municipiosDao.findCodigos();
		List<Municipio> aux=municipios.stream()
				.filter(p->!codigos.contains(p.getCodigo()))
				.toList();
		municipiosDao.saveMunicipios(aux);
		return aux.size();
	}
	
}
