package br.com.fiap.carsproject.controller;

import br.com.fiap.carsproject.model.entity.Car;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/car")
public class CarController {

    @GetMapping
    public ModelAndView getAllCars(){
        ModelAndView modelView = new ModelAndView("cars/index.html");

        Car c1 = new Car(1, "v8", "m135", "black", "FGV93482", "Golf");
        Car c2 = new Car(2, "v8", "m135", "black", "FGV93482", "Golf");

        List<Car> cars = Arrays.asList(c1,c2);

        modelView.addObject("getCars", cars);

        return modelView;
    }

    @PostMapping
    public ResponseEntity<Car> insertCar(@RequestBody Car car){

        return null;
    }
}
