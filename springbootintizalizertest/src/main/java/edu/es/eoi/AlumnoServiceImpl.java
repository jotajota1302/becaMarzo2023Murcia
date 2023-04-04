package edu.es.eoi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

//LOGICA DE NEGOCIO DE ALUMNOS

@Component
@Getter
@Setter
public class AlumnoServiceImpl implements AlumnoService {	
	
	@Autowired
	private AlumnoRepository repository;

	@Override
	public boolean aprueba(String asignatura) {
		
		if(repository.findCalificacion(asignatura)>=5) {
			
			return true;
		}
		else {
			return false;
		}
		
	}
	
}
