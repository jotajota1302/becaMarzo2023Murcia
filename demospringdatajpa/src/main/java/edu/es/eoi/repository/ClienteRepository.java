package edu.es.eoi.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.es.eoi.entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, String>{
	
	public List<Cliente> findByNombre(String nombre);
	
	public List<Cliente> findByNacimientoLessThan(Date nacimiento);
	
	public List<Cliente> findByNombreOrderByApellidosAsc(String nombre);

	public List<Cliente> findByCiudad(String ciudad);
	
	public List<Cliente> findByApellidosStartingWith(String cadena);
	
	public List<Cliente> findByNombreContaining(String cadena); 

}
