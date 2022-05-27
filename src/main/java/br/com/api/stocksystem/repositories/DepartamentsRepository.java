package br.com.api.stocksystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.api.stocksystem.entities.Departaments;

@Repository
public interface DepartamentsRepository extends JpaRepository<Departaments, Long> {

}
