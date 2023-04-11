package edu.es.eoi.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.es.eoi.dto.ClienteDto;
import edu.es.eoi.entity.Cliente;
import edu.es.eoi.entity.Cuenta;
import edu.es.eoi.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	ClienteRepository clienteRepository;

	public ClienteDto findCliente(String dni) {

		Cliente cliente = clienteRepository.findById(dni).get();

		ClienteDto dto = new ClienteDto();

		BeanUtils.copyProperties(cliente, dto);

		List<Cuenta> cuentas = cliente.getCuentas();

		double saldo = 0.0;

		for (Cuenta cuenta : cuentas) {
			saldo = saldo + cuenta.getSaldo();
		}
		
		dto.setSaldo(saldo);

		return dto;

	}

	public void createCliente(ClienteDto cliente) {

		Cliente entidad = new Cliente();

		BeanUtils.copyProperties(cliente, entidad);

		clienteRepository.save(entidad);

	}

}
