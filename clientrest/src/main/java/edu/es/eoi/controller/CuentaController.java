package edu.es.eoi.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.es.eoi.dto.CreateCuentaDto;
import edu.es.eoi.service.BancoService;
import edu.es.eoi.service.ClienteService;
import edu.es.eoi.service.CuentaService;

@RestController
@RequestMapping("/cuentas")
public class CuentaController {

	@Autowired
	CuentaService cuentaService;
	
	@Autowired
	ClienteService clienteService;
	
	@Autowired
	BancoService bancoService;
	
	@PostMapping
	public ResponseEntity<?> createCuenta(@RequestBody @Valid CreateCuentaDto cuenta) {
			
			if(clienteService.findCliente(cuenta.getDni())==null) {
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);				
			};
			
			if(bancoService.findBanco(cuenta.getIdBanco())==null) {
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);				
			};			

			cuentaService.createCuenta(cuenta);

		return new ResponseEntity<>(HttpStatus.CREATED);

	}
		
	
}
