package br.com.fiap.carsproject.service;

import br.com.fiap.carsproject.model.entity.Car;
import br.com.fiap.carsproject.model.entity.dto.CarRequestDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CarService {

    public Car getById(Integer id);

    public List<Car> getAllCar();

    public Car insert(CarRequestDTO car);
}
