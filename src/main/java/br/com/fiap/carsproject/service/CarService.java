package br.com.fiap.carsproject.service;

import br.com.fiap.carsproject.model.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarService extends JpaRepository<Car, Integer> {
}
