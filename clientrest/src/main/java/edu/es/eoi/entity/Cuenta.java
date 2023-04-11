package edu.es.eoi.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "cuentas")
@Getter
@Setter
public class Cuenta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column
	private double saldo;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "dni",referencedColumnName = "dni")
	private Cliente cliente;
	

	
	
}
