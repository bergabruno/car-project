package br.com.fiap.carsproject.model.entity;

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

}
