package edu.es.eoi.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ClienteDto {

	@JsonProperty(value = "nif")
	private String dni;
		
	private String nombre;
	
	private String direccion;
	
	private String ciudad;
	
	@JsonProperty(value = "secret")
	private String password;
	
	private String apellidos;
	
	private Date alta;

	private Date nacimiento;

	private double saldo;
	
	public String getPassword() {
		return "##########";
	}
	
	
	
	
}
