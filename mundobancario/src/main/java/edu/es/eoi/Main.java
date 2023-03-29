package edu.es.eoi;

import edu.es.eoi.model.service.ClienteService;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Hola Mundobancario");
		
		ClienteService service= new ClienteService();
		
		service.alta("55555555A","Perico","Avenida Palotes");
		
		System.out.println("");
	
	}

}
