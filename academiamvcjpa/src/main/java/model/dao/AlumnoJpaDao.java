package model.dao;

import java.util.List;

import javax.management.Query;

import org.springframework.stereotype.Repository;

import model.entities.Alumno;
import model.support.jpa.AbstracJpaDao;

@Repository
public class AlumnoJpaDao extends AbstracJpaDao<Long, Alumno> {

	@Override
	protected Class<Alumno> getClase() {
		return Alumno.class;
	}

	List<Alumno> findAlumnosPatron(String patron) {
		String queryString = "SELECT o From Alumno o Where WHERE LOWER(o.nif) like LOWER('%" + patron
				+ "%') OR LOWER(o.nombre) like LOWER('%" + patron + "%') OR LOWER(o.apellido1) like LOWER('%" + patron
				+ "%')  OR LOWER(o.apellido2) like LOWER('%" + patron + "%') ;";

		Query query = (Query) this.entityManager.createQuery(queryString);
		return ((javax.persistence.Query) query).getResultList();
	}

}