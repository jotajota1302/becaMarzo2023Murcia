package edu.es.eoi.controller;

import edu.es.eoi.model.service.ClienteService;
import edu.es.eoi.view.ClienteView;

public class ClienteController {

	// validar los datos de entrada/salida y controlan la navegacion

	private ClienteService service = new ClienteService();

	public static void seleccionarOpcionMenu(int opcion) {

		switch (opcion) {
		case 1:
			ClienteView.printMenuAlta();
			break;
		case 2:
			ClienteView.printMenuConsulta();
			break;
		case 3:
			ClienteView.printMenuBorrado();
			break;
		default:
			System.out.println("Opcion no valida");
			ClienteView.printMenuPrincipal();
			break;
		}

	}

	public void altaCliente(String dni, String nombre, String direccion) {

		// validacion
		if (dni.length() != 9) {
			System.out.println("Formato de dni Incorrecto");
			ClienteView.printMenuAlta();
		}

		service.alta(dni, nombre, direccion);

		ClienteView.printMenuPrincipal();

	}

}
