package jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {


		EntityManager manager = Persistence.createEntityManagerFactory("PELICULAS_PU").createEntityManager();
		
		Usuario user = manager.find(Usuario.class, "12345678A");
		
		System.out.println(user.getSugerencias());

		//LAZY no hace la query hasta que no se necesita ese dato
				
		//SELECT - FETCH 
						
		//INSERT

		//recupero un usuario
		
		user=manager.find(Usuario.class,"87654321A");
		
		List<Sugerencia> sugerencias=new ArrayList<Sugerencia>();
		
		List<Usuario> usuarios=new ArrayList<Usuario>();
		usuarios.add(user);
		
		Sugerencia s1=new Sugerencia();
		s1.setDescripcion("AMOR");
		s1.setUsuarios(usuarios);	
		s1.setUsuarios(usuarios);
		
		Sugerencia s2=new Sugerencia();
		s2.setUsuarios(usuarios);
		s2.setDescripcion("ACCION");
		
		sugerencias.add(s1);
		sugerencias.add(s2);
		
		user.setSugerencias(sugerencias);		
		
		manager.getTransaction().begin();
		manager.merge(user);
		manager.getTransaction().commit();
		
		
	}

}
