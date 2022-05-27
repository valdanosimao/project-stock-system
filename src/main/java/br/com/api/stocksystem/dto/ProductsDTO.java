package br.com.api.stocksystem.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class ProductsDTO {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nameProduct;
	
	private Double priceProduct;
	
	@ManyToOne
	private DepartamentsDTO departamentsDTO;
	
	public ProductsDTO() {
		
	}

	public ProductsDTO(Long id, String nameProduct, Double priceProduct, DepartamentsDTO departamentsDTO) {
		this.id = id;
		this.nameProduct = nameProduct;
		this.priceProduct = priceProduct;
		this.departamentsDTO = departamentsDTO;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public Double getPriceProduct() {
		return priceProduct;
	}

	public void setPriceProduct(Double priceProduct) {
		this.priceProduct = priceProduct;
	}

	public DepartamentsDTO getDepartamentsDTO() {
		return departamentsDTO;
	}

	public void setDepartamentsDTO(DepartamentsDTO departamentsDTO) {
		this.departamentsDTO = departamentsDTO;
	}
	
}

