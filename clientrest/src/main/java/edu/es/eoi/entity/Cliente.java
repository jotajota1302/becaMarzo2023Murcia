package edu.es.eoi.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	@Column(length = 10)
	private String dni;
	
	@Column
	private String nombre;
	
	@Column
	private String direccion;
	
	@Column
	private String ciudad;
	
	@Column(name = "password")
	private String password;
	
	@Column
	private String apellidos;
	
	@Column(name = "fechaalta")
	@Temporal(TemporalType.DATE)
	private Date alta;
		
	@Column
	@Temporal(TemporalType.DATE)
	private Date nacimiento;
	
	
	@OneToMany(mappedBy = "cliente" , fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Cuenta> cuentas;


}
