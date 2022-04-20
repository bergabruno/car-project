package br.com.fiap.carsproject.model.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
public class CarRequestDTO {

    @NotBlank
    @NotNull
    private String motor;

    @NotBlank
    @NotNull
    private String name;

    @NotBlank
    @NotNull
    private String color;

    @NotBlank
    @NotNull
    private String licensePlate;

    @NotBlank
    @NotNull
    private String brand;

    @NotBlank
    @NotNull
    private String year;
}
