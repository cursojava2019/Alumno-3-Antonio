package model.support.jpa;

import java.io.Serializable;
import java.util.List;

import model.support.DaoException;
import model.support.ServiceException;

public abstract class ServiceJpa<K extends Serializable, O extends Serializable> {

	public abstract JpaDao<K, O> getDao();

	public void crear(O objeto) throws ServiceException, DaoException {

		getDao().save(objeto);

	}

	public void modificar(O objeto) throws ServiceException, DaoException {
		getDao().update(objeto);
	}

	public void eliminar(O objeto) throws ServiceException, DaoException {
		getDao().delete(objeto);
	}

	public void eliminarById(K key) throws ServiceException, DaoException {
		getDao().deleteById(key);
	}

	public O buscar(K clave) throws ServiceException, DaoException {
		return getDao().findOne(clave);
	}

	public List<O> buscarTodos() throws ServiceException, DaoException {
		return getDao().findAll();
	}

}