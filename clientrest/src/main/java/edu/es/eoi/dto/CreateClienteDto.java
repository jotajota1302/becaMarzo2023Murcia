package edu.es.eoi.dto;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateClienteDto {
	
	@Min(9)
	@Max(9)
	private String dni;	
	
	@NotNull	
	private String nombre;	

	private String direccion;	

	private String ciudad;	
	
	@NotNull
	private String password;
	
	@NotNull
	private String apellidos;	

	@NotNull
	private Date nacimiento;
	
}
