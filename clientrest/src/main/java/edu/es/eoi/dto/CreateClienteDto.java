package edu.es.eoi.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateClienteDto {
	
	private String dni;	
	
	private String nombre;	

	private String direccion;	

	private String ciudad;	
	
	private String password;
	
	private String apellidos;	

	private Date nacimiento;
	
}
