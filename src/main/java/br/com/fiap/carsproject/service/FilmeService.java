package br.com.fiap.carsproject.service;

import br.com.fiap.carsproject.model.entity.Filme;
import br.com.fiap.carsproject.model.entity.dto.FilmeRequestDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FilmeService {

    public Filme getById(Integer id);

    public List<Filme> getAllFilme();

    public Filme insert(FilmeRequestDTO Filme);
}
