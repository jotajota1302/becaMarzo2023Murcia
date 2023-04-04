package edu.es.eoi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AppMultiLanguageTests {

	@Autowired
	private AlumnoController controller;
	
	@Autowired
	private Alumno alumno;
	
	@Test
	void test() {

		System.out.println(controller.getAlumnoService().aprueba("Matematicas"));
		
		System.out.println(alumno);

	}

}
