package edu.es.eoi.controller;

import java.util.List;

import javax.validation.Valid;

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

import edu.es.eoi.dto.BancoDto;
import edu.es.eoi.dto.CreateBancoDto;
import edu.es.eoi.service.BancoService;

@RestController
@RequestMapping("/bancos")
@Validated
public class BancoController {

	@Autowired
	BancoService bancoService;

	@GetMapping("/{id}")
	public ResponseEntity<BancoDto> findBanco(@PathVariable int id) {

		try {		
			return new ResponseEntity<BancoDto>(bancoService.findBanco(id), HttpStatus.OK);

		} catch (Exception e) {

			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}

	}
	
	@GetMapping()
	public ResponseEntity<?> findAll() {
	
		return new ResponseEntity<List<BancoDto>>(bancoService.findAll(), HttpStatus.OK);


	}

	@PostMapping
	public ResponseEntity<?> createBanco(@RequestBody @Valid CreateBancoDto banco) {

		try {

			bancoService.createBanco(banco);

		} catch (Exception e) {

			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

		return new ResponseEntity<>(HttpStatus.CREATED);

	}
		
	

}
