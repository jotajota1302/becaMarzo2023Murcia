package edu.es.eoi.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.es.eoi.service.PokemonService;

@WebServlet("/pokemon")
public class PokemonController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	private PokemonService service;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		//TODO recuperar el parametro de la request
		
		service.findPokemonByNumber(0);
		
		//TODO devolver la informacion
	}

	
	
	
}
