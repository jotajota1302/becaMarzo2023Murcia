package jpa;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {

//		long start = Calendar.getInstance().getTimeInMillis();
		
//		PeliculaDAO dao = new PeliculaDAOJDBCImpl();
//		PeliculaDAO dao = new PeliculaDAOJPAImpl();
//		
//		System.out.println(dao.read(5));
//
//		long end = Calendar.getInstance().getTimeInMillis();
//
//		System.out.println(end - start + " msec");
//		
//		start = Calendar.getInstance().getTimeInMillis();
//				
//		System.out.println(dao.read(5));
//
//		end = Calendar.getInstance().getTimeInMillis();
//
//		System.out.println(end - start + " msec");
		
		PeliculaDAO dao = new PeliculaDAOJPAImpl();
		
		//conseguir updater una pelicula con una fecha en la bbdd
		
		Pelicula p= new Pelicula();
			
//		Pelicula pelicula=dao.read(1);
					
		Calendar calendar=new GregorianCalendar(1991,1,1);
		p.setGenero("Accion");
		p.setNombre("Jungla de Cristal 2");
		p.setNota(5.0);	
		p.setEstreno(calendar.getTime());
		
//		dao.create(p);

		EntityManager manager = Persistence.createEntityManagerFactory("PELICULAS_PU").createEntityManager();
		
		Usuario user = manager.find(Usuario.class, "12345678A");
		
		System.out.println(user.getTarjetas());

		//TABLA USER - ID,NOMBRE,MAIL
		//TABLA PASSWORD ID,NOMBRE,VALIDEZ
		//TABLA AFICIONES ID,DESCRIPCION
		//RELACION 1-1 con USER-PASSWORD
		
		//Recuperar un usuario por ID y poder consultar su PW
		
		//RELACION 1-N entre user y aficiones
		
		//Recuperar un usuario y ver que tiene 2 aficiones por lo menos 
		
	}

}
