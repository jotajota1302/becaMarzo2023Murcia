package edu.es.eoi;

import org.springframework.stereotype.Component;

//TODA LA LOGICA DE ACCESO A DATOS

@Component
public class AlumnoRepositoryJPAImpl implements AlumnoRepository {
	
	@Override
	public double findCalificacion(String asignatura) {
		
		System.out.println("accedo con JPA a la BBDD y recupero la nota");
		
		return 4.5;
	}

}
