package edu.es.eoi.model.service;

import edu.es.eoi.model.dao.ClienteDAO;

//la logica de negocio de mi app para clientes
	//1- Consultar el saldo de un cliente
	
public class CuentaServiceImpl  {
	
	private ClienteDAO dao=new ClienteDAO();	
	
	public double getSaldoCliente(String dni) {
		
		//como hariamos esto? me traigo un user y miro sus cuentas y saco el saldo
		
		dao.find(dni);
		
		//logica-> recorre las cuentas y suma los saldos de todas
		
		
		return 0.0;
	}

}
