package br.com.fiap.carsproject.model.entity;

import br.com.fiap.carsproject.model.entity.dto.FilmeRequestDTO;
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
@Entity(name = "tb_filme")
public class Filme {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    private String nome;

    private String autor;

    private String genero;

    private String ano;

    private String nota;

    private String diretor;

    public Filme(FilmeRequestDTO filmeRequestDTO) {
        this.nome = filmeRequestDTO.getNome();
        this.autor = filmeRequestDTO.getAutor();
        this.genero = filmeRequestDTO.getGenero();
        this.ano = filmeRequestDTO.getAno();
        this.nota = filmeRequestDTO.getNota();
        this.diretor = filmeRequestDTO.getDiretor();
    }
}
