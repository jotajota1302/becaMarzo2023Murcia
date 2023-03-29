package edu.es.eoi.model.service;

import edu.es.eoi.model.dao.ClienteDAO;
import edu.es.eoi.model.entity.Cliente;

//la logica de negocio de mi app para clientes
	//1-Dar de Alta un cliente
	//2-Consultar un cliente (por dni)
	//3-Borrar un cliente(por dni)


public class ClienteService {
	
	private ClienteDAO dao=new ClienteDAO();	
	
	public void alta(String dni,String nombre,String direccion) {
		
		//crear un cliente
		
		Cliente cliente= new Cliente();
		cliente.setDni(dni);
		cliente.setDireccion(direccion);
		cliente.setNombre(nombre);
		
		//guardar
		
		dao.create(cliente);
		
	}

}
