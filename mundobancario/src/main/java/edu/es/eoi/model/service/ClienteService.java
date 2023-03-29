package edu.es.eoi.model.service;

import java.util.Calendar;

import edu.es.eoi.model.dao.ClienteDAO;
import edu.es.eoi.model.entity.Cliente;

//la logica de negocio de mi app para clientes
	//1-Dar de Alta un cliente
	//2-Consultar un cliente (por dni)
	//3-Borrar un cliente(por dni)


public class ClienteService {
	
	private ClienteDAO dao=new ClienteDAO();	
	
	public void alta(String dni,String nombre,String direccion) {
		
		Cliente cliente= new Cliente();
		cliente.setDni(dni);
		cliente.setDireccion(direccion);
		cliente.setNombre(nombre);
		cliente.setFechaAlta(Calendar.getInstance().getTime());
		
			
		dao.create(cliente);
		
	}
	
	public Cliente consulta(String dni) {
		
		return dao.find(dni);
		
	}
	
	public void borrar(String dni) {
		
		dao.borrar(dao.find(dni));
		
	}

}
