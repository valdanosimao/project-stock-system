package br.com.api.stocksystem.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class DepartamentsDTO {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@OneToMany(mappedBy = "departamentsDTO", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<ProductsDTO> productsDTO;

	public DepartamentsDTO() {
		
	}

	public DepartamentsDTO(Long id, String name, List<ProductsDTO> productsDTO) {
		this.id = id;
		this.name = name;
		this.productsDTO = productsDTO;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ProductsDTO> getProductsDTO() {
		return productsDTO;
	}

	public void setProductsDTOs(List<ProductsDTO> productsDTO) {
		this.productsDTO = productsDTO;
	}
	
}

