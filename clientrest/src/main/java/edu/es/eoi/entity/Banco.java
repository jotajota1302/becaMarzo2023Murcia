package edu.es.eoi.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "bancos")
@Getter
@Setter
public class Banco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column
	private String nombre;
	
	@Column
	private String ciudad;
	
	@OneToMany(mappedBy = "banco",cascade = CascadeType.ALL)
	private List<Cuenta> cuentas;

	
	
	
}
