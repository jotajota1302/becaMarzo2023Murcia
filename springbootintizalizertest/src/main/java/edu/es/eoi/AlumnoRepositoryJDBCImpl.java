package edu.es.eoi;

public class AlumnoRepositoryJDBCImpl implements AlumnoRepository {

	@Override
	public double findCalificacion(String asignatura) {

		System.out.println("accedo con JDBC a la BBDD y recupero la nota");

		return 4.5;
	}

}
