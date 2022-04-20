package br.com.fiap.carsproject.model.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
public class FilmeRequestDTO {

    @NotBlank
    @NotNull
    private String nome;

    @NotBlank
    @NotNull
    private String autor;

    @NotBlank
    @NotNull
    private String genero;

    @NotBlank
    @NotNull
    private String ano;

    @NotBlank
    @NotNull
    private String nota;

    @NotBlank
    @NotNull
    private String diretor;
}
