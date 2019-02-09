package model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.dao.AlumnoJpaDao;
import model.entities.Alumno;
import model.support.jpa.JpaDao;
import model.support.jpa.ServiceJpa;

@Service
public class AlumnoJpaService extends ServiceJpa<Long, Alumno> {
	@Autowired
	private AlumnoJpaDao dao;

	public JpaDao<Long, Alumno> getDao() {
		return this.dao;
	}

}