package edu.es.eoi.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateBancoDto {
	
	@NotNull
	@NotBlank
	private String nombre;	
	
	@NotNull
	@NotBlank
	private String ciudad;
	
	
}
