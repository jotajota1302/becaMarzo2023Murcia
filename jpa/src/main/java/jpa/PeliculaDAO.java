package jpa;

public interface PeliculaDAO {

	Pelicula read(int id);

	void create(Pelicula pelicula);

	void update(Pelicula pelicula);

	void delete(Pelicula pelicula);

}