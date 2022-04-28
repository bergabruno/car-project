package br.com.fiap.carsproject.model.entity;

import br.com.fiap.carsproject.model.entity.dto.LoginRequestDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "tb_login")
public class Login {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    private String username;

    private String password;

    public Login(LoginRequestDTO loginRequestDTO) {
        this.username = loginRequestDTO.getUsername();
        this.password = loginRequestDTO.getPassword();
    }
}

