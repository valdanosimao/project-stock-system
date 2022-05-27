package br.com.api.stocksystem.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Products {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(nullable = false)
	private String nameProduct;
	
	@Column(nullable = false)
	private Double priceProduct;
	
	@ManyToOne
	private Departaments departaments;

	public Products() {
	}

	public Products(Long id, String nameProduct, Double priceProduct, Departaments departaments) {
		this.id = id;
		this.nameProduct = nameProduct;
		this.priceProduct = priceProduct;
		this.departaments = departaments;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return nameProduct;
	}

	public void setName(String name) {
		this.nameProduct = name;
	}

	public Double getPrice() {
		return priceProduct;
	}

	public void setPrice(Double price) {
		this.priceProduct = price;
	}

	public Departaments getDepartaments() {
		return departaments;
	}

	public void setDepartaments(Departaments departaments) {
		this.departaments = departaments;
	}
	
}
