package edu.es.eoi;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/test")
public class ClientRestController {

	
	@GetMapping
	@RequestMapping("/{id}")
	public BancoDto doSomething(@PathVariable String id) {
		
		//recuperar la lista de bancos
		
		//como llamo a un servicio web?
		
		RestTemplate template= new RestTemplate();
		
		BancoDto devolucion = template.getForObject("http://localhost:8082/bancos/".concat(id), BancoDto.class);
		
//		Object respuesta = template.getForObject("https://swapi.dev/api/people/".concat(id), Object.class);
				
		return devolucion;
		
		
	}
	
}
