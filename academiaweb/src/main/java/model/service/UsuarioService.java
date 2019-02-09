package model.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import model.dao.UsuarioDao;
import model.entities.Usuario;
import model.support.Dao;
import model.support.DaoException;
import model.support.Service;

@org.springframework.stereotype.Service
public class UsuarioService extends Service<Long, Usuario> {

	@Autowired
	UsuarioDao dao;
	private Logger log = LogManager.getLogger(UsuarioService.class);

	protected Dao<Long, Usuario> getDao() {
		return this.dao;
	}

	protected Logger getLog() {
		return this.log;
	}

	public Usuario buscarUsuario(String username) {
		try {
			return this.dao.buscarUsuario(username);
		} catch (DaoException e) {
			this.log.error("Error", e);
			return null;
		}
	}

}