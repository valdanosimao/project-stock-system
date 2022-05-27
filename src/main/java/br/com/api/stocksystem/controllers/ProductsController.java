package br.com.api.stocksystem.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.stocksystem.dto.ProductsDTO;
import br.com.api.stocksystem.services.ProductsService;

@RestController
@RequestMapping("/products")
public class ProductsController {
	
	private final ProductsService productsService;

	public ProductsController(ProductsService productsService) {
		this.productsService = productsService;
	}
	
	@GetMapping
	public ResponseEntity<List<ProductsDTO>> getProducts(){
		return ResponseEntity.status(HttpStatus.OK)
				.body(productsService.allProducts());
	}
	
	@PostMapping
	public ResponseEntity<ProductsDTO> addProducts(@RequestBody ProductsDTO productsDTO){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(productsService.saveProducts(productsDTO));
	}

}
