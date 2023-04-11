package edu.es.eoi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import edu.es.eoi.entity.Cliente;
import edu.es.eoi.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repository;
	
	
	public  List<Cliente> findAll(int page, int size){
	
		return repository.findAll(PageRequest.of(page,size)).getContent();
		
	}
	
	public List<Cliente> findAll(){
		
		return repository.findAll();
		
	}
	
	public List<Cliente> findClientesByNombre(String nombre){
		
		return  repository.findByNombre(nombre);		
		
	}
	
	public Cliente findByDni(String dni) {
		
		return repository.findById(dni).get();
	}
	
	public void create(Cliente cliente) {
		
		repository.save(cliente);
	
	}

	public void update(Cliente cliente) {
		
		repository.save(cliente);
	
	}	
	
	public void delete(String dni) {
		
		repository.deleteById(dni);
	
	}	
}
