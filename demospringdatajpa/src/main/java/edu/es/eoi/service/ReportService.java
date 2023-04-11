package edu.es.eoi.service;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.es.eoi.entity.Cliente;
import edu.es.eoi.repository.ClienteRepository;

@Service
public class ReportService {

	@Autowired
	private ClienteRepository repository;
		
	//Devolver todos los usuarios mayores de una edad dada por parámetro
	
	public List<Cliente> findClientesMayoresDe(int years){
				
		//logica de negocio
		
		LocalDate localdate = LocalDate.now().minusYears(years);
		Date date = Date.from(localdate.atStartOfDay().toInstant(ZoneOffset.UTC));
						
		return repository.findByNacimientoLessThan(date);		
	}
	
	
}
