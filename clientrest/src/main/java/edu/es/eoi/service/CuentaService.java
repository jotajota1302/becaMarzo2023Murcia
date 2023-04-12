package edu.es.eoi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.es.eoi.dto.CreateCuentaDto;
import edu.es.eoi.entity.Banco;
import edu.es.eoi.entity.Cliente;
import edu.es.eoi.entity.Cuenta;
import edu.es.eoi.repository.BancoRepository;
import edu.es.eoi.repository.ClienteRepository;
import edu.es.eoi.repository.CuentaRepository;

@Service
public class CuentaService {

	@Autowired
	ClienteRepository clienteRepository;
	
	@Autowired
	BancoRepository bancoRepository;
	
	@Autowired
	CuentaRepository cuentaRepository; 
	
	@Transactional
	public void createCuenta(CreateCuentaDto dto) {
		
		Cliente cliente= clienteRepository.findById(dto.getDni()).get();
		
		Banco banco= bancoRepository.findById(dto.getIdBanco()).get();
				
		Cuenta cuenta= new Cuenta();
		cuenta.setCliente(cliente);
		cuenta.setBanco(banco);
		cuenta.setSaldo(dto.getSaldo());
		
		cuentaRepository.save(cuenta);
	}
	
}
