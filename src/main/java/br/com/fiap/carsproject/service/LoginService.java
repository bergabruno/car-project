package br.com.fiap.carsproject.service;

import br.com.fiap.carsproject.model.entity.Login;
import br.com.fiap.carsproject.model.entity.dto.LoginRequestDTO;
import org.springframework.stereotype.Service;

@Service
public interface LoginService {

    public Login getById(Integer id);

    public Login insert(LoginRequestDTO loginRequestDTO);

    public boolean logar(LoginRequestDTO loginRequestDTO);
}
