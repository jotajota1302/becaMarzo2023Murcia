package edu.es.eoi.view;

import java.util.Scanner;

import edu.es.eoi.controller.ClienteController;

@SuppressWarnings("resource")
public class ClienteView {
		
	public static void printMenuPrincipal() {
		
		System.out.println("Buenos dias!! , bienvenido a mi app de gestion de clientes");
		System.out.println("¿Que quieres hacer?:");
		System.out.println("1-Alta");
		System.out.println("2-Consulta");
		System.out.println("3-Borrado");
		
		Scanner scanner= new Scanner(System.in);
		int opcion=scanner.nextInt();
		
		ClienteController.seleccionarOpcionMenu(opcion);	
		
	}

	
	public static void printMenuAlta() {
		
		System.out.println("Introduce DNI: ");
		Scanner scanner= new Scanner(System.in);
		String dni=scanner.nextLine();
		
		System.out.println("Introduce Nombre: ");
		scanner=new Scanner(System.in);
		String nombre=scanner.nextLine();
	
		System.out.println("Introduce Direccion: ");
		scanner=new Scanner(System.in);
		String direccion=scanner.nextLine();	
			
		
		ClienteController controller= new ClienteController();
		controller.altaCliente(dni, nombre, direccion);
		
	}
	
	public static void printMenuConsulta() {
		
	
		
	}
	
	public static void printMenuBorrado() {
		
	
		
	}

}
