package edu.es.eoi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

//ENTITY
@Getter
@Setter
@Component
public class Alumno {

	@Value("${user.mail}")
	private String nombre;

	@Value("${user.password}")
	private String password;

}
