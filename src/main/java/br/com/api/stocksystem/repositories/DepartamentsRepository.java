package br.com.api.stocksystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.stocksystem.entities.Departaments;

public interface DepartamentsRepository extends JpaRepository<Departaments, Long> {

}
