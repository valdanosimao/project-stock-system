package br.com.api.stocksystem.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "departaments")
public class Departaments {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(nullable = false)
	private String name;
	
	@OneToMany(mappedBy = "departaments", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Products> products = new ArrayList<>();
	
	public Departaments() {
	}

	public Departaments(Long id, String name, List<Products> products) {
		this.id = id;
		this.name = name;
		this.products = products;
	}

	public Long getUuid() {
		return id;
	}

	public void setUuid(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}

}

