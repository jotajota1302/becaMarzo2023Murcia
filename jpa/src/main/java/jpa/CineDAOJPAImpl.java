package jpa;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class CineDAOJPAImpl implements CineDAO {

	private EntityManager manager = Persistence.createEntityManagerFactory("PELICULAS_PU").createEntityManager();

	// READ

	public Cine read(int id) {

		return manager.find(Cine.class, id);
	}

	// CREATE

	public void create(Cine cine) {

		manager.getTransaction().begin();
		manager.persist(cine);
		manager.getTransaction().commit();
	}

	// UPDATE

	public void update(Cine cine) {

		manager.getTransaction().begin();
		manager.merge(cine);
		manager.getTransaction().commit();
	}

	// DELETE

	public void delete(Cine cine) {

		manager.getTransaction().begin();
		manager.remove(cine);
		manager.getTransaction().commit();
	}

}
