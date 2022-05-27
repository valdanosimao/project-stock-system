package br.com.api.stocksystem.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import br.com.api.stocksystem.dto.ProductsDTO;
import br.com.api.stocksystem.entities.Products;
import br.com.api.stocksystem.repositories.ProductsRepository;

@Service
public class ProductsService {
	
	private final ProductsRepository productsRepository;

	public ProductsService(ProductsRepository productsRepository) {
		this.productsRepository = productsRepository;
	}
	
	/**
	 *  method that returns all products
	 * @return all products
	 */
	public List<ProductsDTO> allProducts(){
		
		List<Products> products = productsRepository.findAll();
		
		return products.stream()
				.map(productObj -> new ModelMapper().map(productObj, ProductsDTO.class))
				.collect(Collectors.toList());
	}
	

	/**
     * method that saves a products
     * @param 
     * @return product who will be saved
     */
	public ProductsDTO saveProducts(ProductsDTO productsDTO) {
		
		ModelMapper modelMapper = new ModelMapper();
		
		Products products = modelMapper.map(productsDTO, Products.class);
		
		products = productsRepository.save(products);
		
		productsDTO.setId(products.getId());
		
		return productsDTO;
	}

}
