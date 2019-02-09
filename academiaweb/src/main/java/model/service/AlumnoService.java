package model.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import controller.alumnos.AlumnoForm;
import model.dao.AlumnoDao;
import model.entities.Alumno;
import model.support.Dao;
import model.support.DaoException;
import model.support.Service;

@org.springframework.stereotype.Service
public class AlumnoService extends Service<Long, Alumno> {
	@Autowired
	private AlumnoDao dao;
	private Logger log = LogManager.getLogger(AlumnoService.class);

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

	protected Logger getLog() {
		return this.log;

	}

	public List<Alumno> buscarNif(String nif) {
		try {
			return this.dao.buscarNif(nif);
		} catch (DaoException e) {
			this.log.error("Error buscando NIF", e);
			return null;
		}
	}

	public static AlumnoService getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Alumno obtenerAlumno) {
		// TODO Auto-generated method stub

	}

	public void create(AlumnoForm alumno) {
		// TODO Auto-generated method stub

	}

	public void update(AlumnoForm alumno) {
		// TODO Auto-generated method stub

	}

}