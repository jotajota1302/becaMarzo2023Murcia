package edu.es.eoi;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/miservicio")
public class Servlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
          
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		System.out.println(request.getParameter("cliente"));
		
	    // Obtener el objeto PrintWriter para escribir la respuesta
	    PrintWriter out = response.getWriter();

	    // Escribir la respuesta	  
	    out.println(LocalDateTime.now());	   
	    
	  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("entro por el post");
		doGet(request, response);
	}
	
	

}
