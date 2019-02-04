package model.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import model.dao.AlumnoDao;
import model.entities.Alumno;
import model.support.Dao;
import model.support.DaoException;
import model.support.Service;

public class AlumnoService extends Service<Long, Alumno> {

	private static AlumnoService singleton = null;
	private AlumnoDao dao;
	private Logger log = LogManager.getLogger(AlumnoService.class);

	public static AlumnoService getInstance() {
		if (singleton == null) {
			singleton = new AlumnoService();
		}
		return singleton;

	}

	private AlumnoService() {
		super();
		this.dao = new AlumnoDao();
	}

	@Override
	protected Dao<Long, Alumno> getDao() {
		return this.dao;
	}

	public List<Alumno> findAlumnosPatron(String patron) {
		try {
			return this.dao.findAlumnos(patron);
		} catch (DaoException e) {
			e.printStackTrace();
			return new ArrayList<Alumno>();
		}

	}

	@Override
	protected Logger getLog() {
		return this.log;

	}

}