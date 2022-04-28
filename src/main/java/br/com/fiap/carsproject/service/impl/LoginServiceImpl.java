package br.com.fiap.carsproject.service.impl;

import br.com.fiap.carsproject.model.entity.Login;
import br.com.fiap.carsproject.model.entity.dto.LoginRequestDTO;
import br.com.fiap.carsproject.repository.LoginRepository;
import br.com.fiap.carsproject.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    LoginRepository loginRepository;

    @Override
    public Login getById(Integer id) {
        return loginRepository.getById(id);
    }

    @Override
    public Login insert(LoginRequestDTO loginRequestDTO) {

        if(loginRepository.existsByUsername(loginRequestDTO.getUsername())){
            throw new RuntimeException("Ja existe um usuario com esse nome");
        }

        Login login = new Login(loginRequestDTO);

        return loginRepository.save(login);
    }

    @Override
    public boolean logar(LoginRequestDTO loginRequestDTO) {
        if(!loginRepository.existsByUsername(loginRequestDTO.getUsername())){
            throw new RuntimeException("Nao existe nenhum usuario com este username");
        }

        Login login = loginRepository.findByUsername(loginRequestDTO.getUsername());

        if(loginRequestDTO.getUsername().equals(login.getUsername()) &&
        loginRequestDTO.getPassword().equals(login.getPassword())){
            return true;
        }

        return false;
    }
}
