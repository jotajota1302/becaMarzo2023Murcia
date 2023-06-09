package edu.es.eoi.service;

import java.util.Calendar;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.es.eoi.dto.ClienteDto;
import edu.es.eoi.dto.CreateClienteDto;
import edu.es.eoi.entity.Cliente;
import edu.es.eoi.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	ClienteRepository clienteRepository;

	public ClienteDto findCliente(String dni) {

		Cliente cliente = clienteRepository.findById(dni).get();

		ClienteDto dto = new ClienteDto();

		BeanUtils.copyProperties(cliente, dto);
		
		dto.setNombre(dto.getNombre().toUpperCase());
		dto.setApellidos(dto.getApellidos().toUpperCase());

		return dto;

	}

	public void createCliente(CreateClienteDto cliente) {

		Cliente entidad = new Cliente();

		BeanUtils.copyProperties(cliente, entidad);

		entidad.setAlta(Calendar.getInstance().getTime());
		
		clienteRepository.save(entidad);

	}
	
	

}
