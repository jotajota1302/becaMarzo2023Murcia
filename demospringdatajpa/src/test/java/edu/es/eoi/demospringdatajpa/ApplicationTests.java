package edu.es.eoi.demospringdatajpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.es.eoi.repository.ClienteRepository;
import edu.es.eoi.service.ClienteService;
import edu.es.eoi.service.ReportService;

@SpringBootTest
class ApplicationTests {

	@Autowired
	ClienteRepository repository;
	
	@Autowired
	ClienteService service;	
	
	@Autowired
	ReportService reportService;	
	
	@Test
	void contextLoads() {
	
//		//crear				
//		Cliente cliente=new Cliente();
//		cliente.setDni("DDDDDDDD");
//		cliente.setDireccion("TEST");
//		cliente.setNombre("PEPE");
//		cliente.setPassword("abcdefgh");
//		
//		service.create(cliente);	
//		
//		//leer
//		Assertions.assertEquals("PEPE", service.findByDni("DDDDDDDD").getNombre());
//			
//		//updatear 		
//		cliente.setDireccion("Address updated");
//		service.update(cliente);		
//		Assertions.assertEquals("Address updated", service.findByDni("DDDDDDDD").getDireccion());
//		
//		//borrar		
//		service.delete("DDDDDDDD");		
	
//		service.findAll(1,4);
		
//		service.findClientesByNombre("PEPE");
		
//		reportService.findClientesMayoresDe(10);
		
//		repository.findByNombreOrderByApellidosAsc("PEPE");
		
//		repository.findByCiudad("alicante");
		
//		repository.findByApellidosStartingWith("al");	
		
//		repository.findByNombreContaining("ito");
	}

}
