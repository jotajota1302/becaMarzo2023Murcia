package edu.es.eoi.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import edu.es.eoi.model.entity.Cliente;

//se encarga unicamente de leer o escribir la entidad Cliente

public class ClienteDAO {
	
	private EntityManager manager=Persistence.createEntityManagerFactory("MUNDOBANCARIO_PU").createEntityManager();

	
	//CREATE
	
	public void create(Cliente cliente) {
		
		manager.getTransaction().begin();
		manager.persist(cliente);
		manager.getTransaction().commit();
		
	}
	
}
