package br.com.fiap.carsproject.controller;

import br.com.fiap.carsproject.model.entity.Car;
import br.com.fiap.carsproject.model.entity.dto.CarRequestDTO;
import br.com.fiap.carsproject.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/car")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping
    public ModelAndView getAllCars(){
        ModelAndView modelView = new ModelAndView("cars/index.html");

        List<Car> cars = carService.getAllCar();

        modelView.addObject("getCars", cars);

        return modelView;
    }

    @GetMapping("/criar")
    public ModelAndView criar(CarRequestDTO carRequestDTO) {
        ModelAndView modelView = new ModelAndView("cars/criar");
        return modelView;
    }

    @PostMapping("/carros")
    public ModelAndView insertCar(@Valid CarRequestDTO model, BindingResult bindingResult){

        if (bindingResult.hasErrors()) {
            return new ModelAndView("cars/criar.html");
        }

        carService.insert(model);
        return new ModelAndView("redirect:/api/v1/car");
    }

}
