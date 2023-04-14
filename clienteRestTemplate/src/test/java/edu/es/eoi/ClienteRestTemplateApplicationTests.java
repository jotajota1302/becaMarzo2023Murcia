package edu.es.eoi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.web.client.RestTemplate;

@SpringBootTest(webEnvironment =WebEnvironment.RANDOM_PORT)
class ClienteRestTemplateApplicationTests {

	@Test
	void contextLoads() {
		
		RestTemplate template= new RestTemplate();
		
		BancoDto devolucion = template.getForObject("http://localhost:8082/bancos/".concat("2"), BancoDto.class);
		
		Assertions.assertEquals("Santander", devolucion.getNombre());
		
	}

}
