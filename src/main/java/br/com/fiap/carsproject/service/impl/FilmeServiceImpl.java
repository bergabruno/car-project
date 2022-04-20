package br.com.fiap.carsproject.service.impl;

import br.com.fiap.carsproject.model.entity.Filme;
import br.com.fiap.carsproject.model.entity.dto.CarRequestDTO;
import br.com.fiap.carsproject.model.entity.dto.FilmeRequestDTO;
import br.com.fiap.carsproject.repository.CarRepository;
import br.com.fiap.carsproject.repository.FilmeRepository;
import br.com.fiap.carsproject.service.CarService;
import br.com.fiap.carsproject.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmeServiceImpl implements FilmeService {

    @Autowired
    private FilmeRepository filmeRepository;

    @Override
    public Filme getById(Integer id) {
        return filmeRepository.findById(id).get();
    }

    @Override
    public List<Filme> getAllFilme() {
        return filmeRepository.findAll();
    }

    @Override
    public Filme insert(FilmeRequestDTO filme) {
        Filme carro = new Filme(filme);
        return filmeRepository.save(carro);
    }
}
