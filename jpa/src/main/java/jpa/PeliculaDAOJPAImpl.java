package jpa;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class PeliculaDAOJPAImpl implements PeliculaDAO {

	private EntityManager manager = Persistence.createEntityManagerFactory("PELICULAS_PU").createEntityManager();

	// READ

	public Pelicula read(int id) {

		return manager.find(Pelicula.class, id);
	}

	// CREATE

	public void create(Pelicula pelicula) {

		manager.getTransaction().begin();
		manager.persist(pelicula);
		manager.getTransaction().commit();
	}

	// UPDATE

	public void update(Pelicula pelicula) {

		manager.getTransaction().begin();
		manager.merge(pelicula);
		manager.getTransaction().commit();
	}

	// DELETE

	public void delete(Pelicula pelicula) {

		manager.getTransaction().begin();
		manager.remove(pelicula);
		manager.getTransaction().commit();
	}

}
