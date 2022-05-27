package br.com.api.stocksystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.api.stocksystem.entities.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long>{

}
