package br.com.api.stocksystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.stocksystem.entities.Products;

public interface ProductsRepository extends JpaRepository<Products, Long>{

}
