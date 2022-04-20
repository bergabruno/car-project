package br.com.fiap.carsproject.controller;

import br.com.fiap.carsproject.model.entity.Filme;
import br.com.fiap.carsproject.model.entity.dto.FilmeRequestDTO;

import br.com.fiap.carsproject.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/filme")
public class FilmeController {

    @Autowired
    private FilmeService filmeService;

    @GetMapping
    public ModelAndView getAllFilmes(){
        ModelAndView modelView = new ModelAndView("filmes/index.html");

        List<Filme> filmes = filmeService.getAllFilme();

        modelView.addObject("getFilmes", filmes);

        return modelView;
    }

    @GetMapping("/criar")
    public ModelAndView criar(FilmeRequestDTO filmeRequestDTO) {
        ModelAndView modelView = new ModelAndView("filmes/criar");
        return modelView;
    }

    @PostMapping("/filmes")
    public ModelAndView insertFilme(@Valid FilmeRequestDTO model, BindingResult bindingResult){

        if (bindingResult.hasErrors()) {
            return new ModelAndView("filmes/criar.html");
        }

        filmeService.insert(model);
        return new ModelAndView("redirect:/api/v1/filme");
    }

}
