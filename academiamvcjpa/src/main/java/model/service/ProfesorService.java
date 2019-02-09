package model.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import controller.profesores.ProfesorForm;
import model.dao.ProfesorDao;
import model.entities.Profesor;
import model.support.Dao;
import model.support.DaoException;
import model.support.Service;

public class ProfesorService extends Service<Long, Profesor> {

	private static ProfesorService singleton = null;
	private ProfesorDao dao;
	private Logger log = LogManager.getLogger(AlumnoService.class);

	public static ProfesorService getInstance() {
		if (singleton == null) {
			singleton = new ProfesorService();
		}
		return singleton;

	}

	private ProfesorService() {
		super();
		this.dao = new ProfesorDao();
	}

	@Override
	protected Dao<Long, Profesor> getDao() {
		return this.dao;
	}

	public List<Profesor> findProfesorPatron(String patron) {
		try {
			return this.dao.findProfesor(patron);
		} catch (DaoException e) {
			e.printStackTrace();
			return new ArrayList<Profesor>();
		}

	}

	@Override
	protected Logger getLog() {

		return this.log;
	}

	public void update(ProfesorForm profesor) {
		// TODO Auto-generated method stub

	}

	public List<Profesor> buscarNif(String nif) {
		try {
			return this.dao.buscarNif(nif);
		} catch (DaoException e) {
			this.log.error("Error buscando NIF", e);
			return null;
		}
	}

	public void update(Profesor obtenerProfesor) {
		// TODO Auto-generated method stub

	}

}