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

@WebServlet("/clientes")
public class ClienteController extends HttpServlet {

	ClienteService service = new ClienteServiceImpl();
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		String dni = request.getParameter("dni");

		out.print(service.consulta(dni));

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("crear un cliente");

		String nombre = request.getParameter("nombre");
		String direccion = request.getParameter("direccion");
		String dni= request.getParameter("dni");
		
		service.alta(dni, nombre, direccion);
		
		response.getWriter().print("Cliente creado correctamente");

	}

}
