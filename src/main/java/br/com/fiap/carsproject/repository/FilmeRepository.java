package br.com.fiap.carsproject.repository;

import br.com.fiap.carsproject.model.entity.Car;
import br.com.fiap.carsproject.model.entity.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Integer> {
}
