package model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.dao.ResponsableJpaDao;
import model.entities.ResponsableAlumno;
import model.support.DaoException;
import model.support.jpa.JpaDao;
import model.support.jpa.ServiceJpa;

//import es.indra.academia.model.dao.ReponsableDao;

@Service
public class ResponsableJpaService extends ServiceJpa<Long, ResponsableAlumno> {

	// private Logger log = LogManager.getLogger(ResponsableJpaService.class);

	@Autowired
	private ResponsableJpaDao dao;

	@Override
	public JpaDao<Long, ResponsableAlumno> getDao() {
		return this.dao;
	}

	public List<ResponsableAlumno> findResponsableAlumnosPatron(String patron) {

		return this.dao.findResponsableAlumnosPatron(patron);
		// Falta catch y Try !!

	}

	/*
	 * @Override protected Logger getLog() { return this.log; }
	 */

	public List<ResponsableAlumno> buscarNif(String nif) {
		try {
			return this.dao.buscarNif(nif);
		} catch (DaoException e) {
			// this.log.error("Error buscando NIF", e);
			return null;
		}
	}

	public List<ResponsableAlumno> listanorepetidos(Long id) {
		List<ResponsableAlumno> listado = this.dao.findAll();
		int n = listado.size();
		for (int i = 0; i < n; i++) {
			if (id == listado.get(i).getId()) {
				listado.remove(i);
			}
		}

		return listado;
	}

}