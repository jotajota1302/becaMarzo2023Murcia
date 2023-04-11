package edu.es.eoi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.es.eoi.entity.Cliente;
import edu.es.eoi.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	ClienteRepository clienteRepository;
	
	public Cliente findCliente(String dni) {
		
		return clienteRepository.findById(dni).get();
		
	}
	
}
