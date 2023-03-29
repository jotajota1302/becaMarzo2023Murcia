package jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {


		EntityManager manager = Persistence.createEntityManagerFactory("PELICULAS_PU").createEntityManager();
		
//		Usuario user = manager.find(Usuario.class, "12345678A");
//		
//		System.out.println(user.getSugerencias());

		//LAZY no hace la query hasta que no se necesita ese dato
				
		//SELECT - FETCH 
						
		//INSERT

		//recupero un usuario
		
//		user=manager.find(Usuario.class,"87654321A");
		
//		List<Sugerencia> sugerencias=new ArrayList<Sugerencia>();
//		
//		List<Usuario> usuarios=new ArrayList<Usuario>();
//		usuarios.add(user);
//		
//		Sugerencia s1=new Sugerencia();
//		s1.setDescripcion("AMOR");
//		s1.setUsuarios(usuarios);	
//		s1.setUsuarios(usuarios);
//		
//		Sugerencia s2=new Sugerencia();
//		s2.setUsuarios(usuarios);
//		s2.setDescripcion("ACCION");
//		
//		sugerencias.add(s1);
//		sugerencias.add(s2);
//		
//		user.setSugerencias(sugerencias);		
		
//		manager.getTransaction().begin();
//		manager.merge(user);
//		manager.getTransaction().commit();
//		
		
		
//		Cliente cliente= new Cliente();
//		cliente.setNombre("Pepito");
//		cliente.setDni("11111111A");
//		cliente.setDireccion("C/Pez");
//		
//		manager.getTransaction().begin();
//		manager.persist(cliente);
//		manager.getTransaction().commit();		
		
//		
//		Banco banco= new Banco();
//		banco.setNombre("KUXA");
//		banco.setCiudad("Bilbao");
//		
//		manager.getTransaction().begin();
//		manager.persist(banco);
//		manager.getTransaction().commit();		
		
		Cliente cliente=manager.find(Cliente.class, "11111111A");
		Banco banco=manager.find(Banco.class, 3);
		
		Cuenta cuenta= new Cuenta();
		cuenta.setBanco(banco);
		cuenta.setCliente(cliente);
		cuenta.setSaldo(20000);
		
		if(cliente.getCuentas()==null) {
			cliente.setCuentas(new ArrayList<Cuenta>());			
		}
		cliente.getCuentas().add(cuenta);
		
		if(banco.getCuentas()==null) {
			banco.setCuentas(new ArrayList<Cuenta>());
		}
		banco.getCuentas().add(cuenta);
		
		manager.getTransaction().begin();
		manager.merge(cuenta);
		manager.getTransaction().commit();	
		
		
	}

}
