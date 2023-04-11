package edu.es.eoi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ClienteSaldoDto {

	@JsonProperty(value = "nif")
	private String dni;
		
	private String nombre;	
		
	private double saldo;
	
	
	
}
