package br.com.fiap.carsproject.model.entity;

import br.com.fiap.carsproject.model.entity.dto.CarRequestDTO;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "tb_car")
public class Car {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    private String motor;

    private String name;

    private String color;

    private String licensePlate;

    private String brand;

    private String year;

    public Car(CarRequestDTO carRequestDTO){
        this.motor = carRequestDTO.getMotor();
        this.name = carRequestDTO.getName();
        this.color = carRequestDTO.getColor();
        this.licensePlate = carRequestDTO.getLicensePlate();
        this.brand = carRequestDTO.getBrand();
        this.year = carRequestDTO.getYear();
    }

}
