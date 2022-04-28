package br.com.fiap.carsproject.controller;


import br.com.fiap.carsproject.model.entity.dto.CarRequestDTO;
import br.com.fiap.carsproject.model.entity.dto.LoginRequestDTO;
import br.com.fiap.carsproject.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping
    public ModelAndView login(LoginRequestDTO loginRequestDTO) {
        ModelAndView modelView = new ModelAndView("index.html");
        return modelView;
    }

    @GetMapping("/criar")
    public ModelAndView criar(LoginRequestDTO loginRequestDTO) {
        ModelAndView modelView = new ModelAndView("criarConta.html");
        return modelView;
    }

    @PostMapping
    public ModelAndView criarConta(@Valid LoginRequestDTO loginRequestDTO, BindingResult bindingResult){

        if (bindingResult.hasErrors()) {
            return new ModelAndView("criarConta.html");
        }

        ModelAndView modelView = new ModelAndView("index.html");

        try{
            loginService.insert(loginRequestDTO);
        }catch (RuntimeException e){
            modelView.addObject("error", e.getMessage());
            modelView.setViewName("criarConta.html");
        }

        return modelView;
    }

    @PostMapping("/logar")
    public ModelAndView logar(@Valid LoginRequestDTO loginRequestDTO, BindingResult bindingResult){

        if (bindingResult.hasErrors()) {
            return new ModelAndView("redirect:/api/v1/login");
        }

        if(loginService.logar(loginRequestDTO)){
            ModelAndView modelView = new ModelAndView("redirect:/api/v1/filme");
            return  modelView;
        }

        ModelAndView modelView = new ModelAndView("redirect:/api/v1/login");
        return modelView;
    }
}
