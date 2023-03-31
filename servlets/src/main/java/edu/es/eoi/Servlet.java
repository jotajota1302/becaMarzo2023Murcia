package edu.es.eoi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.es.eoi.model.service.ClienteService;
import edu.es.eoi.model.service.ClienteServiceImpl;

@WebServlet("/miservicio")
public class Servlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
          
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			  
	    PrintWriter out = response.getWriter();	  
	    
	    ClienteService service= new ClienteServiceImpl();
	    
	    String dni=request.getParameter("dni");
	    
	    out.print(service.consulta(dni).getNombre());
	    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("entro por el post");
		doGet(request, response);
	}
	
	

}
