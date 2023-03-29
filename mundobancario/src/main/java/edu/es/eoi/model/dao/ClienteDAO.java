package edu.es.eoi.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import edu.es.eoi.model.entity.Cliente;

//se encarga unicamente de leer o escribir la entidad Cliente

public class ClienteDAO {

	private EntityManager manager = Persistence.createEntityManagerFactory("MUNDOBANCARIO_PU").createEntityManager();

	
	public void create(Cliente cliente) {
		
		manager.getTransaction().begin();
		manager.persist(cliente);
		manager.getTransaction().commit();

	}

	public Cliente find(String dni) {

		return manager.find(Cliente.class, dni);

	}

	public void update(Cliente cliente) {

		manager.getTransaction().begin();
		manager.merge(cliente);
		manager.getTransaction().commit();

	}

	public void borrar(Cliente cliente) {

		manager.getTransaction().begin();
		manager.remove(cliente);
		manager.getTransaction().commit();

	}

}
