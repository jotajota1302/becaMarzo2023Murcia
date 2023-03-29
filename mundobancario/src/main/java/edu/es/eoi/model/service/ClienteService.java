package edu.es.eoi.model.service;

import edu.es.eoi.model.entity.Cliente;

public interface ClienteService {

	void alta(String dni, String nombre, String direccion);

	Cliente consulta(String dni);

	void borrar(String dni);

}