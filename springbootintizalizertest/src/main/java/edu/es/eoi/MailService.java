package edu.es.eoi;

import org.springframework.stereotype.Component;

@Component
public class MailService {
	
	public void sendMail(Alumno alumno) {
		
		System.out.println("le mando un mail a " + alumno);
	}

}
