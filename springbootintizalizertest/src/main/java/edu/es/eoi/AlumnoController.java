package edu.es.eoi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import lombok.Getter;
import lombok.Setter;

//EXPOSICION AL EXTERIOR DE MIS SERVICIOS/ ENTRADA-VALIDACION DATOS
@Controller
@Getter
@Setter
public class AlumnoController {
	
	@Autowired
	private AlumnoService alumnoService;
	
	@Autowired
	private MailService mailService;

}
