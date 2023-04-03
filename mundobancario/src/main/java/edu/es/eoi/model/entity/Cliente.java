package edu.es.eoi.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "clientes")
@Getter
@Setter
@ToString
public class Cliente {
	
	@Id	
	private String dni;

	@Column
	private String nombre;
	
	@Column
	private String direccion;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date fechaAlta;
	
}
