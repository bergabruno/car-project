package br.com.fiap.carsproject.service.impl;

import br.com.fiap.carsproject.model.entity.Car;
import br.com.fiap.carsproject.model.entity.dto.CarRequestDTO;
import br.com.fiap.carsproject.repository.CarRepository;
import br.com.fiap.carsproject.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Override
    public Car getById(Integer id) {
        return carRepository.findById(id).get();
    }

    @Override
    public List<Car> getAllCar() {
        return carRepository.findAll();
    }

    @Override
    public Car insert(CarRequestDTO car) {
        Car carro = new Car(car);
        return carRepository.save(carro);
    }
}
