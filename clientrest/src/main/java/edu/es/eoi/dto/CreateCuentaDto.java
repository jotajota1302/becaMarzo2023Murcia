package edu.es.eoi.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateCuentaDto {

	@NotNull
	@NotBlank
	private String dni;
	
	@NotNull
	private Integer idBanco;
	
	@NotNull	
	private double saldo;
	
	
}
