package jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class PeliculaDAOJPAImpl implements PeliculaDAO {

	private EntityManager manager = Persistence.createEntityManagerFactory("PELICULAS_PU").createEntityManager();

	// READ

	public Pelicula read(int id) {

		return manager.find(Pelicula.class, id);
	}

	// READ ALL

	public List<?> readAll() {

		Query query = manager.createQuery("FROM Pelicula");
		return query.getResultList();

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
