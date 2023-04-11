package edu.es.eoi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.es.eoi.entity.Cliente;
import edu.es.eoi.repository.ClienteRepository;

@SpringBootTest
class ClientApplicationTests {

	@Autowired
	ClienteRepository clienteRepository;
	
	@Test
	void contextLoads() {
		
		Cliente cliente = clienteRepository.findById("23434545T").get();
		
		System.out.println(cliente.getCuentas());
		
		
	}

}
