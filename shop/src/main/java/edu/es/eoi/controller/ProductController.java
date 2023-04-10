package edu.es.eoi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.es.eoi.model.Product;

@RestController
@RequestMapping("/products")
public class ProductController {

	private List<Product> products = new ArrayList<Product>();

	// Servicio REST de productos: exponer las operacion CRUD
	// a traves de los metodos GET,POST,PUT,DELETE

	// GET /products --> Devolver todos los productos
	@GetMapping
	public List<Product> getAllProducts() {

		Product product1 = new Product();
		product1.setCode("AAAAAAA");
		product1.setName("TV");
		product1.setPrice(500.0);
		Product product2 = new Product();
		product2.setCode("BBBBBBB");
		product2.setName("PC");
		product2.setPrice(1000.0);

		ArrayList<Product> list = new ArrayList<Product>();
		list.add(product1);
		list.add(product2);

		// ESTO LO DEBERIA HACER UN SERVICIO

		return list;

	}

	// GET /products/ID --> Devolver el producto con ese ID
	@GetMapping("/{code}")
	public ResponseEntity<?> findProduct(@PathVariable String code) {

		Product product1 = new Product();
		product1.setCode(code);
		product1.setName("XXXXX");
	
		
		return  new ResponseEntity<Product>(product1,HttpStatus.OK);

	}

	// POST /products --> Crear un nuevo producto
	@PostMapping
	public String createProduct(@RequestBody Product product) {

		// llamar al servicio de guardado

		products.add(product);

		return "objeto creado";

	}

	// PUT /products/ID --> Actualizar el elemento existente
	@PutMapping("/{code}")
	public String updateProduct(@RequestBody Product product, @PathVariable String code) {

		// llamaria al servicio de update

		return "objeto updateado: " + code;

	}

	@DeleteMapping
	public String deleteAllProducts() {

		// ESTO LO DEBERIA HACER UN SERVICIO

		return "Borro todos los productos";

	}

	// GET /products/ID --> Devolver el producto con ese ID
	@DeleteMapping("/{code}")
	public String deleteProduct(@PathVariable String code) {

		// ESTO LO DEBERIA HACER UN SERVICIO

		return "Borro el producto " + code;

	}

}
