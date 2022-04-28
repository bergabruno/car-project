package br.com.fiap.carsproject.model.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@Getter
public class LoginRequestDTO {

    @NotBlank
    @NotNull
    private String username;

    @NotBlank
    @NotNull
    private String password;
}
