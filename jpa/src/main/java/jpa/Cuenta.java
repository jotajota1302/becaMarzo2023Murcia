package jpa;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cuentas")
public class Cuenta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column
	private double saldo;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "dni",referencedColumnName = "dni")
	private Cliente cliente;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="idbanco", referencedColumnName = "id")
	private Banco banco;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	
	
	
}
