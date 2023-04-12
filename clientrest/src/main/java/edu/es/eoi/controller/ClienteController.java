package edu.es.eoi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.es.eoi.dto.ClienteDto;
import edu.es.eoi.dto.CreateClienteDto;
import edu.es.eoi.service.ClienteService;

@RestController
@RequestMapping("/clientes")
@Validated
public class ClienteController {

	@Autowired
	ClienteService clienteService;

	@GetMapping("/{dni}")
	public ResponseEntity<ClienteDto> findCliente(@PathVariable String dni) {

		try {		
			return new ResponseEntity<ClienteDto>(clienteService.findCliente(dni), HttpStatus.OK);

		} catch (Exception e) {

			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}

	}

	@PostMapping
	public ResponseEntity<?> createCliente(@RequestBody CreateClienteDto cliente) {

		try {

			clienteService.createCliente(cliente);

		} catch (Exception e) {

			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

		return new ResponseEntity<>(HttpStatus.CREATED);

	}
		
	

}
