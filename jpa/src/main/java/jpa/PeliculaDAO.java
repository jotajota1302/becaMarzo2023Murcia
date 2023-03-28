package jpa;

import java.util.List;

public interface PeliculaDAO {

	List<?> readAll();
	
	Pelicula read(int id);

	void create(Pelicula pelicula);

	void update(Pelicula pelicula);

	void delete(Pelicula pelicula);

}