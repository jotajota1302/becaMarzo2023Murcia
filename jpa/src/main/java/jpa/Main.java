package jpa;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {


		EntityManager manager = Persistence.createEntityManagerFactory("PELICULAS_PU").createEntityManager();
		
		Usuario user = manager.find(Usuario.class, "12345678A");
		
		System.out.println(user);

		//TABLA USER - ID,NOMBRE,MAIL
		//TABLA PASSWORD ID,NOMBRE,VALIDEZ
		//TABLA AFICIONES ID,DESCRIPCION
		//RELACION 1-1 con USER-PASSWORD
		
		//Recuperar un usuario por ID y poder consultar su PW
		
		//RELACION 1-N entre user y aficiones
		
		//Recuperar un usuario y ver que tiene 2 aficiones por lo menos 
		
		//N-N con usuario
		
	}

}
