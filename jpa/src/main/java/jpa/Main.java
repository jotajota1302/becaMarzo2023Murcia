package jpa;

import java.util.Calendar;

public class Main {

	public static void main(String[] args) {

		long start = Calendar.getInstance().getTimeInMillis();
		
//		PeliculaDAO dao = new PeliculaDAOJDBCImpl();
		PeliculaDAO dao = new PeliculaDAOJPAImpl();
		
		System.out.println(dao.read(5));

		long end = Calendar.getInstance().getTimeInMillis();

		System.out.println(end - start + " msec");
		
		start = Calendar.getInstance().getTimeInMillis();
				
		System.out.println(dao.read(5));

		end = Calendar.getInstance().getTimeInMillis();

		System.out.println(end - start + " msec");

	}

}
